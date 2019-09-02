package com.algovin373.project.moviecatalog.db.movie;

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
public class MovieDatabase_Impl extends MovieDatabase {
  private volatile MovieDao _movieDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `MovieEntity` (`idMovie` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `posterMovie` TEXT NOT NULL, `titleMovie` TEXT NOT NULL, `releaseDateMovie` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"91e9755cc452904495a8c45fe4657b15\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `MovieEntity`");
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
        final HashMap<String, TableInfo.Column> _columnsMovieEntity = new HashMap<String, TableInfo.Column>(4);
        _columnsMovieEntity.put("idMovie", new TableInfo.Column("idMovie", "INTEGER", true, 1));
        _columnsMovieEntity.put("posterMovie", new TableInfo.Column("posterMovie", "TEXT", true, 0));
        _columnsMovieEntity.put("titleMovie", new TableInfo.Column("titleMovie", "TEXT", true, 0));
        _columnsMovieEntity.put("releaseDateMovie", new TableInfo.Column("releaseDateMovie", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMovieEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMovieEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMovieEntity = new TableInfo("MovieEntity", _columnsMovieEntity, _foreignKeysMovieEntity, _indicesMovieEntity);
        final TableInfo _existingMovieEntity = TableInfo.read(_db, "MovieEntity");
        if (! _infoMovieEntity.equals(_existingMovieEntity)) {
          throw new IllegalStateException("Migration didn't properly handle MovieEntity(com.algovin373.project.moviecatalog.db.movie.MovieEntity).\n"
                  + " Expected:\n" + _infoMovieEntity + "\n"
                  + " Found:\n" + _existingMovieEntity);
        }
      }
    }, "91e9755cc452904495a8c45fe4657b15", "179679bb38d0d0bb91989323f05bb259");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "MovieEntity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `MovieEntity`");
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
  public MovieDao movieDao() {
    if (_movieDao != null) {
      return _movieDao;
    } else {
      synchronized(this) {
        if(_movieDao == null) {
          _movieDao = new MovieDao_Impl(this);
        }
        return _movieDao;
      }
    }
  }
}
