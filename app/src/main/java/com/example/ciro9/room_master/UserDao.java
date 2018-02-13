package com.example.ciro9.room_master;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

@Dao
public interface UserDao {
    @Query("select * from User ")
    List<User> getUser();

    @Insert(onConflict = REPLACE)
    void addUser(User user);

    @Delete()
    void deleteUser(User user);

    @Query("DELETE FROM User")
    void remuve();



}
