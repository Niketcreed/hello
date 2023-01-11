package com.astro.articlemode.widgets;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.astro.articlemode.R;

public class SingleScreenGridActivity extends AppCompatActivity {

RecyclerView gridButtons;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blogsection);

        gridButtons = findViewById(R.id.gridButtons);



    }
}
