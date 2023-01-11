package com.astro.articlemode;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterBlogSection extends RecyclerView.Adapter<AdapterBlogSection.SubAdapterBlog> {


    public AdapterBlogSection(ArrayList<String> blogSection) {

    }

    @NonNull
    @Override
    public SubAdapterBlog onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.blogsection,parent, false);
        SubAdapterBlog subBlog = new SubAdapterBlog(view);
        return subBlog;
    }

    @Override
    public void onBindViewHolder(@NonNull SubAdapterBlog holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
//holder contain class
    public class SubAdapterBlog extends RecyclerView.ViewHolder {

        ImageView profileImage;
        TextView textArticle;
        ImageView shareArticle;
        ImageView threeDots;
        ImageView spiderImage;
        TextView mainHeading;
        TextView subHeading;
//constructor call.
        public SubAdapterBlog(@NonNull View itemView) {
            super(itemView);

            profileImage = itemView.findViewById(R.id.profileImage);
            textArticle = itemView.findViewById(R.id.textArticle);
            shareArticle = itemView.findViewById(R.id.shareArticle);
            threeDots = itemView.findViewById(R.id.threeDots);
            spiderImage = itemView.findViewById(R.id.spiderImage);
            mainHeading = itemView.findViewById(R.id.mainHeading);
            subHeading = itemView.findViewById(R.id.subHeading);
        }
    }


}


