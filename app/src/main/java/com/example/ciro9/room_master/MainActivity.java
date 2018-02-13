package com.example.ciro9.room_master;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    AppDatabase appDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appDatabase = AppDatabase.getDatabase(this.getApplication());
        insertData();

        List<UserWithRepos> usos=  appDatabase.userWithReposDao().getUsersWithRepos();

        TextView txt=findViewById(R.id.txtDati);
        for(UserWithRepos us: usos)
        {
            txt.append(us.toString());
            txt.append("\n");
        }

    }

    void insertData()
    {
        User user= new User("ciao","pass");
        System.out.println(user.id);

        //charge 10 user
        for(int i=0;i<10;i++)
            appDatabase.userDao().addUser(user);

        //charge 10 repo at 1° user
        for(int i=0;i<10;i++)
        {Repo repo =new Repo("come ","wwww",1);// <-----
            appDatabase.repoDao().addRepo(repo);
        }
    }



}
