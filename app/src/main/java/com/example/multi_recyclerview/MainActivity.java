package com.example.multi_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<MultipleViewModal> list;
    MultViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = findViewById(R.id.recycler);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);

        list = new ArrayList<>();

        adapter = new MultViewAdapter(list);
        rv.setAdapter(adapter);

        putData();
    }

    private void putData() {
        MultipleViewModal model;

        for (int i = 0; i < 5; i++) {
            model = new MultipleViewModal();
            model.setType(MultipleViewModal.NAME_IMAGE_TYPE);
            model.setName("Ice Cream Sundae");
            model.setImage(R.drawable.pic1);
            list.add(model);
        }

        for (int i = 0; i < 5; i++) {
            model = new MultipleViewModal();
            model.setType(MultipleViewModal.IMAGE_ONLY_TYPE);
            model.setImage(R.drawable.pic1);
            list.add(model);
        }

        for (int i = 0; i < 5; i++) {
            model = new MultipleViewModal();
            model.setType(MultipleViewModal.NAME_ONLY_TYPE);
            model.setName("Ice Cream Sundae");
            list.add(model);
        }

    }
}
