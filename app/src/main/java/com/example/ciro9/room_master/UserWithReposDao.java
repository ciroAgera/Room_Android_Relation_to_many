package com.example.ciro9.room_master;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

@Dao
public interface UserWithReposDao {

    @Query("SELECT * from user")
    public List<UserWithRepos> getUsersWithRepos();

}

