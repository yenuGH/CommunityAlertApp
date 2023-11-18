package com.CommunityAlert.communityalert.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.communityalert.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginPageActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    private EditText editTextUsernameField;
    private EditText editTextPasswordField;
    private Button loginPageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        initializeFields();
    }

    private void initializeFields() {
        mAuth = FirebaseAuth.getInstance();

        editTextUsernameField = findViewById(R.id.loginPageUsernameField);
        editTextPasswordField = findViewById(R.id.loginPageUsernameField);
        loginPageButton = findViewById(R.id.loginPageButton);

        String email = String.valueOf(editTextUsernameField.getText());
        String password = String.valueOf(editTextPasswordField.getText());

        Log.d("LoginPageActivity", "Do you see this?");

        System.out.println(email + password);

        Toast.makeText(LoginPageActivity.this, "DO YOU SEE THIS", Toast.LENGTH_LONG);

        loginPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in user's information
                                    //Intent intent = new Intent(getApplicationContext(), HomePageActivity.class);
                                    //startActivity(intent);
                                } else {
                                    // If sign in fails, display a message to the user.
                                    Toast.makeText(LoginPageActivity.this, "Authentication failed. Do you have an account?",
                                            Toast.LENGTH_LONG).show();

                                    System.out.println("Username and passwword: " + email + " " + password);
                                }
                            }
                        });
            }
        });
    }

}