package com.rl.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomAdapter customAdapter;
    ClickListener clickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<examData> list = getData();

        recyclerView = findViewById(R.id.recyclerView);

        customAdapter = new CustomAdapter(list, getApplication(), clickListener);

        recyclerView.setAdapter(customAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

    }

    private List<examData> getData() {

        List<examData> list = new ArrayList<>();

        list.add(new examData(
                "Ravi",
                "Sep 08 2020",
                "Good Luck"
        ));

        list.add(new examData(
                "Rajesh",
                "Sep 08 2020",
                "Good Luck"
        ));

        list.add(new examData(
                "ram",
                "Sep 08 2020",
                "Good Luck"
        ));

        list.add(new examData(
                "vinod",
                "Sep 08 2020",
                "Good Luck"
        ));

        list.add(new examData(
                "Rafi",
                "Sep 08 2020",
                "Good Luck"
        ));

        list.add(new examData(
                "Rafi",
                "Sep 08 2020",
                "Good Luck"
        ));

        list.add(new examData(
                "Rafi",
                "Sep 08 2020",
                "Good Luck"
        ));

        list.add(new examData(
                "Rafi",
                "Sep 08 2020",
                "Good Luck"
        ));

        list.add(new examData(
                "Rafi",
                "Sep 08 2020",
                "Good Luck"
        ));

        return list;


    }
}