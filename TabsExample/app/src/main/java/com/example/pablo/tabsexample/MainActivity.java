package com.example.pablo.tabsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.pablo.tabsexample.adapter.PostAdapter;
import com.example.pablo.tabsexample.model.Post;
import com.example.pablo.tabsexample.network.RetrievePostsAsyncTask;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private PostAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.posts_list_view);
        adapter = new PostAdapter(this);
        listView.setAdapter(adapter);

        RetrievePostsAsyncTask task = new RetrievePostsAsyncTask(this);
        task.execute();
    }

    public PostAdapter getAdapter() {
        return adapter;
    }
}
