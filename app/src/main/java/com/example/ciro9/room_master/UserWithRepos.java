package com.example.ciro9.room_master;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Relation;

import java.util.List;

public class UserWithRepos {
    @Embedded
    public User user;

    @Relation(parentColumn = "id", entityColumn = "userId")
    public List<Repo> repoList;


    @Override
    public String toString()
    {
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append(" id = "+user.id+ " login "+user.login + "RepoList ");

        for(Repo repo: repoList)
        {
            sb.append("id repo = " + repo.id + " name: "+ repo.name);
        }

        string= String.valueOf(sb);
        return string;
    }
}

