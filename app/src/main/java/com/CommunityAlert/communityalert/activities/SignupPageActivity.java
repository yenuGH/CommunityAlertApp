package com.CommunityAlert.communityalert.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.CommunityAlert.communityalert.MainActivity;


import com.example.communityalert.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignupPageActivity extends AppCompatActivity {

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_signup_page);


        EditText username = (EditText) findViewById(R.id.signupUsernameField);
        EditText password = (EditText) findViewById(R.id.signupPasswordField);
        EditText email = (EditText) findViewById(R.id.signupEmailField);

        mAuth = FirebaseAuth.getInstance();


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

                final String emailFinal = email1;
                final String passwordFinal = password1;
                mAuth.createUserWithEmailAndPassword(emailFinal, passwordFinal).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(SignupPageActivity.this, "Thank you for making the world a safer place!",
                                    Toast.LENGTH_LONG).show();
                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(SignupPageActivity.this, "Authentication failed. Do you have an account?",
                                    Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });


    }
}