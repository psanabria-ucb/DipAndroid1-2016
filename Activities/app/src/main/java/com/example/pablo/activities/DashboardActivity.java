package com.example.pablo.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        SharedPreferences preferences = getSharedPreferences(
                getString(R.string.app_name), MODE_PRIVATE);
        String username = preferences.getString("username", "");
        if (username.isEmpty()) {
            // Usuario no logeado
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Username: " + username, Toast.LENGTH_LONG).show();
        }
    }
}