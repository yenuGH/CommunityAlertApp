package com.CommunityAlert.communityalert.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.CommunityAlert.communityalert.MainActivity;


import com.example.communityalert.R;
import com.google.android.material.button.MaterialButton;

public class SignupPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_signup_page);


        EditText username = (EditText) findViewById(R.id.signupUsernameField);
        EditText password = (EditText) findViewById(R.id.signupPasswordField);
        EditText email = (EditText) findViewById(R.id.signupEmailField);


        MaterialButton regbtn = (MaterialButton) findViewById(R.id.signupRegisterbutton);

        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username1 = username.getText().toString();
                String password1 = password.getText().toString();
                String email1 = email.getText().toString();

                Toast.makeText(SignupPageActivity.this,"Username is"+username1+
                        "Password is"+ password1+ "Email is"+ email1,
                        Toast.LENGTH_SHORT).show();
            }
        });


    }
}