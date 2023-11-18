package com.CommunityAlert.communityalert.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.communityalert.R;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        loadHomePage();
    }

    public static Intent makeIntent(Context context) {
        return new Intent(context, HomePageActivity.class);
    }

    void loadHomePage() {
        Button sendAlertBtn = findViewById(R.id.sendAlertBtn);
        sendAlertBtn.setOnClickListener(v -> {
            //TODO: create intents and the send alert activity
//            Intent launchActivity = SendAlertActivity.makeIntent(HomePageActivity.this);
//            startActivity(launchActivity);
        });
    }
}