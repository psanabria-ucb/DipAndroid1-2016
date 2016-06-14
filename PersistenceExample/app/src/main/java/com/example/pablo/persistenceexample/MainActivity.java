package com.example.pablo.persistenceexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.pablo.persistenceexample.model.Post;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter<Post> postAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.posts_list_view);
        postAdapter = new ArrayAdapter<Post>(this, R.layout.post_item_layout);
        // Ya se llama en el onResume
        // postAdapter.addAll(Post.listAll(Post.class));

        listView.setAdapter(postAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        postAdapter.clear();
        postAdapter.addAll(Post.listAll(Post.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.option_register) {
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
