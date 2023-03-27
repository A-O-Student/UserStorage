package com.example.userstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class AddUserActivity extends AppCompatActivity {

    private EditText firstName;
    private EditText lastName;
    private EditText email;
    private RadioGroup degreeProgramGrp;
    private String sFirstName,sLastName,sEmail,sDegreeProgram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
    }

    public void addUser(View view) {

        firstName = findViewById(R.id.txtFirstName);
        lastName = findViewById(R.id.txtLastName);
        email = findViewById(R.id.txtEmail);
        degreeProgramGrp = findViewById(R.id.rgDegreeProgram);

        sFirstName = String.valueOf(firstName.getText());
        sLastName = String.valueOf(lastName.getText());
        sEmail = String.valueOf(email.getText());

        switch(degreeProgramGrp.getCheckedRadioButtonId()) {
            case R.id.rbLaskennallinenTekniikka:
                sDegreeProgram = "Laskennallinen tekniikka";
            case R.id.rbSahkötekniikka:
                sDegreeProgram = "Sähkötekniikka";
            case R.id.rbTietotekniikka:
                sDegreeProgram = "Tietotekniikka";
            case R.id.rbTuotantotalous:
                sDegreeProgram = "Tuotantotalous";
        }
        UserStorage.getInstance().addUser(new User(sFirstName, sLastName, sEmail, sDegreeProgram));
    }

    public void switchToUserList2(View view) {
        Intent intent = new Intent(this, UserListingActivity.class);
        startActivity(intent);
    }
}