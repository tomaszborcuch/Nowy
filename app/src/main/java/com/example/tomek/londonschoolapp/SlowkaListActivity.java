package com.example.tomek.londonschoolapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SlowkaListActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter;

    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slowka_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Lista Słówek");

        productList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        //recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        //adding some items to our list
        productList.add(
                new Product(
                        "Car",
                        "Samochód",
                        R.drawable.auto1));
        productList.add(
                new Product(
                        "Ticket",
                        "Bilet",
                        R.drawable.bilet1));
        productList.add(
                new Product(
                        "Train",
                        "Pociąg",
                        R.drawable.pociag1));
        productList.add(
                new Product(
                        "Bike",
                        "Rower",
                        R.drawable.rower1));
        productList.add(
                new Product(
                        "Tran",
                        "Tramwaj",
                        R.drawable.tramwaj1));
        productList.add(
                new Product(
                        "Pasta",
                        "Makaron",
                        R.drawable.makaron1));
        productList.add(
                new Product(
                        "Potatoes",
                        "Ziemniaki",
                        R.drawable.ziemniaki1));
        productList.add(
                new Product(
                        "Soup",
                        "Zupa",
                        R.drawable.zupa1));
        productList.add(
                new Product(
                        "Supper",
                        "Kolacja",
                        R.drawable.kolacja1));
        productList.add(
                new Product(
                        "Flakes",
                        "Płatki",
                        R.drawable.platki1));

        productList.add(
                new Product(
                        "Arm",
                        "Ręka",
                        R.drawable.dellinspiron));
        productList.add(
                new Product(
                        "Neck",
                        "Szyja",
                        R.drawable.szyja1));

        productList.add(
                new Product(
                        "Knee",
                        "Kolano",
                        R.drawable.kolano1));

        productList.add(
                new Product(
                        "Finger",
                        "Palec",
                        R.drawable.palec1));

        productList.add(
                new Product(
                        "Elbow",
                        "Łokieć",
                        R.drawable.lokiec1));

        productList.add(
                new Product(
                        "Waist",
                        "Talia",
                        R.drawable.talia1));

        productList.add(
                new Product(
                        "Head",
                        "Głowa",
                        R.drawable.glowa1));

        productList.add(
                new Product(
                        "Hand",
                        "Dloń",
                        R.drawable.dlon1));

        productList.add(
                new Product(
                        "Leg",
                        "Noga",
                        R.drawable.noga1));

        productList.add(
                new Product(
                        "Forehead",
                        "Czolo",
                        R.drawable.czolo1));

        productList.add(
                new Product(
                        "Ear",
                        "Ucho",
                        R.drawable.ucho1));

        productList.add(
                new Product(
                        "Backpack",
                        "Plecak",
                        R.drawable.plecak
                )
        );
        adapter = new ProductAdapter(this, productList);
        recyclerView.setAdapter(adapter);
    }
}
