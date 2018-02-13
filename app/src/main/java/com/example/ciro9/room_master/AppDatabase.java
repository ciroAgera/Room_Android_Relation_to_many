package com.example.ciro9.room_master;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by ciro9 on 12/02/2018.
 */
@Database(entities ={User.class , Repo.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase INSTANCE;

    public static AppDatabase getDatabase(Context context )
    { if(INSTANCE ==null)
      {
        INSTANCE = Room.databaseBuilder(context.getApplicationContext(),AppDatabase.class,"user_db").allowMainThreadQueries().build();
      }
      return INSTANCE;
    }


    public abstract UserDao userDao();// 1

    public abstract RepoDao repoDao();// Many

    public abstract UserWithReposDao userWithReposDao(); //1 to Many



}
