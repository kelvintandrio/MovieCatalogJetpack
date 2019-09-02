package com.algovin373.project.moviecatalog.db.tvshow;

import android.database.Cursor;
import androidx.paging.DataSource;
import androidx.paging.DataSource.Factory;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class TVShowDao_Impl implements TVShowDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfTVShowEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTVShowFavorite;

  public TVShowDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTVShowEntity = new EntityInsertionAdapter<TVShowEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `TVShowEntity`(`idTVShow`,`posterTVShow`,`titleTVShow`,`releaseDateTVShow`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TVShowEntity value) {
        stmt.bindLong(1, value.getTvShowId());
        if (value.getTvShowPoster() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTvShowPoster());
        }
        if (value.getTvShowTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTvShowTitle());
        }
        if (value.getTvShowReleaseDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTvShowReleaseDate());
        }
      }
    };
    this.__preparedStmtOfDeleteTVShowFavorite = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM tvshowentity WHERE idTVShow = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertTVShowFavorite(TVShowEntity tvShowEntity) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfTVShowEntity.insert(tvShowEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteTVShowFavorite(int id) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteTVShowFavorite.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, id);
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteTVShowFavorite.release(_stmt);
    }
  }

  @Override
  public DataSource.Factory<Integer, TVShowEntity> getDataTvShowFavorite() {
    final String _sql = "SELECT * FROM tvshowentity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new DataSource.Factory<Integer, TVShowEntity>() {
      @Override
      public LimitOffsetDataSource<TVShowEntity> create() {
        return new LimitOffsetDataSource<TVShowEntity>(__db, _statement, false , "tvshowentity") {
          @Override
          protected List<TVShowEntity> convertRows(Cursor cursor) {
            final int _cursorIndexOfTvShowId = cursor.getColumnIndexOrThrow("idTVShow");
            final int _cursorIndexOfTvShowPoster = cursor.getColumnIndexOrThrow("posterTVShow");
            final int _cursorIndexOfTvShowTitle = cursor.getColumnIndexOrThrow("titleTVShow");
            final int _cursorIndexOfTvShowReleaseDate = cursor.getColumnIndexOrThrow("releaseDateTVShow");
            final List<TVShowEntity> _res = new ArrayList<TVShowEntity>(cursor.getCount());
            while(cursor.moveToNext()) {
              final TVShowEntity _item;
              final int _tmpTvShowId;
              _tmpTvShowId = cursor.getInt(_cursorIndexOfTvShowId);
              final String _tmpTvShowPoster;
              _tmpTvShowPoster = cursor.getString(_cursorIndexOfTvShowPoster);
              final String _tmpTvShowTitle;
              _tmpTvShowTitle = cursor.getString(_cursorIndexOfTvShowTitle);
              final String _tmpTvShowReleaseDate;
              _tmpTvShowReleaseDate = cursor.getString(_cursorIndexOfTvShowReleaseDate);
              _item = new TVShowEntity(_tmpTvShowId,_tmpTvShowPoster,_tmpTvShowTitle,_tmpTvShowReleaseDate);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  @Override
  public List<TVShowEntity> checkDataTVShowFavorite(int id) {
    final String _sql = "SELECT * FROM tvshowentity WHERE idTVShow = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfTvShowId = _cursor.getColumnIndexOrThrow("idTVShow");
      final int _cursorIndexOfTvShowPoster = _cursor.getColumnIndexOrThrow("posterTVShow");
      final int _cursorIndexOfTvShowTitle = _cursor.getColumnIndexOrThrow("titleTVShow");
      final int _cursorIndexOfTvShowReleaseDate = _cursor.getColumnIndexOrThrow("releaseDateTVShow");
      final List<TVShowEntity> _result = new ArrayList<TVShowEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TVShowEntity _item;
        final int _tmpTvShowId;
        _tmpTvShowId = _cursor.getInt(_cursorIndexOfTvShowId);
        final String _tmpTvShowPoster;
        _tmpTvShowPoster = _cursor.getString(_cursorIndexOfTvShowPoster);
        final String _tmpTvShowTitle;
        _tmpTvShowTitle = _cursor.getString(_cursorIndexOfTvShowTitle);
        final String _tmpTvShowReleaseDate;
        _tmpTvShowReleaseDate = _cursor.getString(_cursorIndexOfTvShowReleaseDate);
        _item = new TVShowEntity(_tmpTvShowId,_tmpTvShowPoster,_tmpTvShowTitle,_tmpTvShowReleaseDate);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
