package com.algovin373.project.moviecatalog.db.tvshow;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public class TVShowDatabase_Impl extends TVShowDatabase {
  private volatile TVShowDao _tVShowDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `TVShowEntity` (`idTVShow` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `posterTVShow` TEXT NOT NULL, `titleTVShow` TEXT NOT NULL, `releaseDateTVShow` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"7414f4e800f30462beed3b23cb6cf654\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `TVShowEntity`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsTVShowEntity = new HashMap<String, TableInfo.Column>(4);
        _columnsTVShowEntity.put("idTVShow", new TableInfo.Column("idTVShow", "INTEGER", true, 1));
        _columnsTVShowEntity.put("posterTVShow", new TableInfo.Column("posterTVShow", "TEXT", true, 0));
        _columnsTVShowEntity.put("titleTVShow", new TableInfo.Column("titleTVShow", "TEXT", true, 0));
        _columnsTVShowEntity.put("releaseDateTVShow", new TableInfo.Column("releaseDateTVShow", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTVShowEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTVShowEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTVShowEntity = new TableInfo("TVShowEntity", _columnsTVShowEntity, _foreignKeysTVShowEntity, _indicesTVShowEntity);
        final TableInfo _existingTVShowEntity = TableInfo.read(_db, "TVShowEntity");
        if (! _infoTVShowEntity.equals(_existingTVShowEntity)) {
          throw new IllegalStateException("Migration didn't properly handle TVShowEntity(com.algovin373.project.moviecatalog.db.tvshow.TVShowEntity).\n"
                  + " Expected:\n" + _infoTVShowEntity + "\n"
                  + " Found:\n" + _existingTVShowEntity);
        }
      }
    }, "7414f4e800f30462beed3b23cb6cf654", "0beb1ac18f86cf114c6e7063677240d0");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "TVShowEntity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `TVShowEntity`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public TVShowDao tvShowDao() {
    if (_tVShowDao != null) {
      return _tVShowDao;
    } else {
      synchronized(this) {
        if(_tVShowDao == null) {
          _tVShowDao = new TVShowDao_Impl(this);
        }
        return _tVShowDao;
      }
    }
  }
}
