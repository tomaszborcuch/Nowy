package com.example.tomek.londonschoolapp;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cialo extends Kategorie {
    ViewPager viewPager;
    cialo_adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cialo);
        getSupportActionBar().setTitle("Części ciała");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);





        viewPager = (ViewPager)findViewById(R.id.view_pager);
        adapter = new cialo_adapter(this);
        viewPager.setAdapter(adapter);
    }
}
