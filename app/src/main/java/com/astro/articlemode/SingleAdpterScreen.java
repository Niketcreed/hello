package com.astro.articlemode;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SingleAdpterScreen  extends RecyclerView.Adapter<SingleAdpterScreen.SingleScreenGrid> {

    public SingleAdpterScreen  (ArrayList<String> SingleAdpterScreen ) {

    }

    @NonNull
    @Override
    public SingleScreenGrid onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlescreenbutton,parent,false);
        SingleScreenGrid gridscreen =new SingleScreenGrid(view);
        return gridscreen;
    }

    @Override
    public void onBindViewHolder(@NonNull SingleScreenGrid holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class SingleScreenGrid extends RecyclerView.ViewHolder{
           TextView buttonGrid;

        public SingleScreenGrid(@NonNull View itemView) {
            super(itemView);
            buttonGrid = itemView.findViewById(R.id.buttonGrid);
        }
    }

}
