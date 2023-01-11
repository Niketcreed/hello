package com.astro.articlemode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

ArrayList<String> blogSection = new ArrayList<>();

//ArrayList<ModelBlogData> modelBlogDataArrayList = new ArrayList<>();
RecyclerView my_Recycle_items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        my_Recycle_items = findViewById(R.id.my_Recycle_items);

       // String str = new String("hi shubham how are you");

        blogSection.add("Image");
        blogSection.add("text");
        blogSection.add("f");
        blogSection.add("sdf");
        blogSection.add("sdfsd");
        blogSection.add("sdfs");
        blogSection.add("sdfsd");
        blogSection.add("sdfsdf");
       // blogSection.add(str);



       // addItemToBlogList();




        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        my_Recycle_items.setLayoutManager(linearLayoutManager);

      //  SnapHelper snapHelper =new LinearSnapHelper();
      //  snapHelper.attachToRecyclerView(my_Recycle_items);

        AdapterBlogSection adpterArticle= new AdapterBlogSection(blogSection);
       my_Recycle_items.setAdapter(adpterArticle);
    }

  //  private void addItemToBlogList() {

       // ModelBlogData modelBlogData =new ModelBlogData("Hello I am title","Hello i am sub title here", "shubham");
        //modelBlogDataArrayList.add(modelBlogData);



    }
