package com.example.ciro9.room_master;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

@Dao
public interface RepoDao {
    @Query("select * from Repo ")
    List<Repo> getRepo();

    @Insert(onConflict = REPLACE)
    void addRepo(Repo repo);
    @Delete()
    void deleteRepo(Repo repo);

    @Query("DELETE FROM Repo")
    void remuve();



}
