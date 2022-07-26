package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Bean> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 9000; i < 100000; i++) {
//            if (i % 4 != 0) {
//                continue;
//            }
            Bean bean = new Bean();
            bean.setName("Justyn" + i);
            data.add(bean);
        }

        RecyclerView recyclerView = findViewById(R.id.rv);

//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(linearLayoutManager);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(gridLayoutManager);

//        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3,
//                LinearLayout.VERTICAL);
//        recyclerView.setLayoutManager(staggeredGridLayoutManager);

        MyAdapter myAdapter = new MyAdapter(data, this);
        recyclerView.setAdapter(myAdapter);

        myAdapter.setRecyclerItemClickListener(new MyAdapter.OnRecyclerItemClickListListener() {
            @Override
            public void onRecyclerItemClick(int position) {
                Log.e("justyn", "onRecyclerItemClick: " + position);
            }
        });
    }
}