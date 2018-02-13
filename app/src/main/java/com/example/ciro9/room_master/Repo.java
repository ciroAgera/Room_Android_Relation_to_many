package com.example.ciro9.room_master;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Relation;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

@Entity
public class Repo {
    @PrimaryKey(autoGenerate = true)
    public int id;
    @ColumnInfo(name="name")
    public final String name;
    public final String url;
    public final int userId;

    public Repo( String name, String url, int userId) {
        this.name = name;
        this.url = url;
        this.userId = userId;
    }
}

