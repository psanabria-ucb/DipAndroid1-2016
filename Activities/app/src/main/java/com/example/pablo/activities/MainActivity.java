package com.example.pablo.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
    }

    public void loginClick(View view) {
        Log.d("MainActivity", "You clicked me!");
        Log.d("MainActivity", "Username: " + username.getText());
        Log.d("MainActivity", "Password: " + password.getText());
        String rightUsername = "admin";
        String rightPassword = "foobar";

        if (rightUsername.equals(username.getText().toString()) &&
                rightPassword.equals(password.getText().toString())) {
            Toast.makeText(this, R.string.login_success, Toast.LENGTH_LONG).show();
            User user = new User();

            user.setUsername(username.getText().toString());
            user.setPassword(password.getText().toString());

            Intent intent = new Intent(this, DashboardActivity.class);

            intent.putExtra("USER", user);
            startActivity(intent);
        } else {
            Toast.makeText(this, R.string.login_failed, Toast.LENGTH_LONG).show();
        }
    }
}
