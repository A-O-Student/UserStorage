package com.example.userstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserStorage s = UserStorage.getInstance();

        s.addUser(new User("Aleksi", "Oja", "aleksi@student.lut.fi", "Tuotantotalous"));
    }

    public void switchToUserList(View view) {
        Intent intent = new Intent(this, UserListingActivity.class);
        startActivity(intent);
    }

    public void switchToAddUser(View view) {
        Intent intent = new Intent(this, AddUserActivity.class);
        startActivity(intent);
    }
}