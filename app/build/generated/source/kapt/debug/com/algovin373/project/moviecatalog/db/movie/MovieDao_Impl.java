package com.algovin373.project.moviecatalog.db.movie;

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
public class MovieDao_Impl implements MovieDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfMovieEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteMovieFavorite;

  public MovieDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovieEntity = new EntityInsertionAdapter<MovieEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `MovieEntity`(`idMovie`,`posterMovie`,`titleMovie`,`releaseDateMovie`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieEntity value) {
        stmt.bindLong(1, value.getMovieId());
        if (value.getMoviePoster() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMoviePoster());
        }
        if (value.getMovieTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getMovieTitle());
        }
        if (value.getMovieReleaseDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMovieReleaseDate());
        }
      }
    };
    this.__preparedStmtOfDeleteMovieFavorite = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM movieentity WHERE idMovie = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertMovieFavorite(MovieEntity movieFavorite) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfMovieEntity.insert(movieFavorite);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteMovieFavorite(int id) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteMovieFavorite.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, id);
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteMovieFavorite.release(_stmt);
    }
  }

  @Override
  public DataSource.Factory<Integer, MovieEntity> getDataMovieFavorite() {
    final String _sql = "SELECT * FROM movieentity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new DataSource.Factory<Integer, MovieEntity>() {
      @Override
      public LimitOffsetDataSource<MovieEntity> create() {
        return new LimitOffsetDataSource<MovieEntity>(__db, _statement, false , "movieentity") {
          @Override
          protected List<MovieEntity> convertRows(Cursor cursor) {
            final int _cursorIndexOfMovieId = cursor.getColumnIndexOrThrow("idMovie");
            final int _cursorIndexOfMoviePoster = cursor.getColumnIndexOrThrow("posterMovie");
            final int _cursorIndexOfMovieTitle = cursor.getColumnIndexOrThrow("titleMovie");
            final int _cursorIndexOfMovieReleaseDate = cursor.getColumnIndexOrThrow("releaseDateMovie");
            final List<MovieEntity> _res = new ArrayList<MovieEntity>(cursor.getCount());
            while(cursor.moveToNext()) {
              final MovieEntity _item;
              final int _tmpMovieId;
              _tmpMovieId = cursor.getInt(_cursorIndexOfMovieId);
              final String _tmpMoviePoster;
              _tmpMoviePoster = cursor.getString(_cursorIndexOfMoviePoster);
              final String _tmpMovieTitle;
              _tmpMovieTitle = cursor.getString(_cursorIndexOfMovieTitle);
              final String _tmpMovieReleaseDate;
              _tmpMovieReleaseDate = cursor.getString(_cursorIndexOfMovieReleaseDate);
              _item = new MovieEntity(_tmpMovieId,_tmpMoviePoster,_tmpMovieTitle,_tmpMovieReleaseDate);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  @Override
  public List<MovieEntity> checkDataMovieFavorite(int id) {
    final String _sql = "SELECT * FROM movieentity WHERE idMovie = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfMovieId = _cursor.getColumnIndexOrThrow("idMovie");
      final int _cursorIndexOfMoviePoster = _cursor.getColumnIndexOrThrow("posterMovie");
      final int _cursorIndexOfMovieTitle = _cursor.getColumnIndexOrThrow("titleMovie");
      final int _cursorIndexOfMovieReleaseDate = _cursor.getColumnIndexOrThrow("releaseDateMovie");
      final List<MovieEntity> _result = new ArrayList<MovieEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final MovieEntity _item;
        final int _tmpMovieId;
        _tmpMovieId = _cursor.getInt(_cursorIndexOfMovieId);
        final String _tmpMoviePoster;
        _tmpMoviePoster = _cursor.getString(_cursorIndexOfMoviePoster);
        final String _tmpMovieTitle;
        _tmpMovieTitle = _cursor.getString(_cursorIndexOfMovieTitle);
        final String _tmpMovieReleaseDate;
        _tmpMovieReleaseDate = _cursor.getString(_cursorIndexOfMovieReleaseDate);
        _item = new MovieEntity(_tmpMovieId,_tmpMoviePoster,_tmpMovieTitle,_tmpMovieReleaseDate);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
