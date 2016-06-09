package com.example.pablo.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        User user = (User)(getIntent().getSerializableExtra("USER"));
        if (user != null) {
            Toast.makeText(this, user.getUsername(), Toast.LENGTH_LONG).show();
        }
    }
}