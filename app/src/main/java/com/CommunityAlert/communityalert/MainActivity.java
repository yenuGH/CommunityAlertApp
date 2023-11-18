package com.CommunityAlert.communityalert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.CommunityAlert.communityalert.activities.LoginPageActivity;
import com.example.communityalert.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        Intent intent = new Intent(MainActivity.this, LoginPageActivity.class);
    }
}