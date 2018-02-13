package com.example.ciro9.room_master;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public final String login;
    public final String avatarUrl;

    public User(String login, String avatarUrl) {

        this.login = login;
        this.avatarUrl = avatarUrl;
    }
}
