package com.example.pablo.persistenceexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.pablo.persistenceexample.model.Post;

public class RegisterActivity extends AppCompatActivity {
    private EditText titleEditText;
    private EditText contentEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        titleEditText = (EditText)findViewById(R.id.title_text);
        contentEditText = (EditText)findViewById(R.id.content_text);
    }

    public void savePost(View view) {
        Post post = new Post();

        post.setTitle(titleEditText.getText().toString());
        post.setContent(contentEditText.getText().toString());

        post.save();

        finish();
    }
}
