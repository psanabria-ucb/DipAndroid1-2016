package com.example.pablo.listviewexample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.pablo.listviewexample.R;
import com.example.pablo.listviewexample.model.Post;

import java.util.zip.Inflater;

/**
 * Created by Pablo on 6/9/2016.
 */
public class PostAdapter extends ArrayAdapter<Post> {

    public PostAdapter(Context context) {
        super(context, R.layout.row_layout);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Post post = getItem(position); // Recupera el objeto de la posicion que necesitamos dibujar
        View currentView;

        // Si convertView es null => Crear una nueva vista
        // Caso contrario reusar la vista que nos estan pasando
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            currentView = inflater.inflate(R.layout.row_layout, parent, false);
        } else {
            currentView = convertView;
        }

        // Buscamos la referencia a nuestros objectos dentro del layout
        TextView title = (TextView)currentView.findViewById(R.id.title_text_view);
        TextView content = (TextView)currentView.findViewById(R.id.content_text_view);

        // LLenar el layout con el contenido que nos interesa
        title.setText(post.getTitle());
        content.setText(post.getContent());

        // Le devolvemos la vista ya procesada
        return currentView;
    }
}
