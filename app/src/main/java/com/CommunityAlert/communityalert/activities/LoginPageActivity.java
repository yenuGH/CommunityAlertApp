package com.CommunityAlert.communityalert.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.example.communityalert.R;
import com.google.android.material.textfield.TextInputEditText;

public class LoginPageActivity extends AppCompatActivity {

    private EditText editTextUsernameField;
    private EditText editTextPasswordField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        initializeFields();
    }

    private void initializeFields() {
        editTextUsernameField = findViewById(R.id.loginPageUsernameField);
        editTextPasswordField = findViewById(R.id.loginPageUsernameField);
    }

}