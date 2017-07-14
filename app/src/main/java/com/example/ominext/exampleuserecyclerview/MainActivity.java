package com.example.ominext.exampleuserecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    AdapterRecyclerView adapter;
    List<TitleAndContent> listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createData();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new AdapterRecyclerView(this,listData);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void createData() {
        listData=new ArrayList<>();
        TitleAndContent titleAndContent=new TitleAndContent("Ví dụ 1","Bài tập về cơ sở dữ liệu quan hệ");
        listData.add(titleAndContent);
        titleAndContent=new TitleAndContent("Ví dụ 2","Bài tập về giao diện cơ bản");
        listData.add(titleAndContent);
        titleAndContent=new TitleAndContent("Ví dụ 3","Bài tập về ListView");
        listData.add(titleAndContent);
        titleAndContent=new TitleAndContent("Ví dụ 4","Bài tập về RecyclerView");
        listData.add(titleAndContent);
    }

    public void onItemClickListener(View view) {

    }
}
