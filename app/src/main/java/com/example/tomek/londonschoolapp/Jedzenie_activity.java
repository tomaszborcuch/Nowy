package com.example.tomek.londonschoolapp;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Jedzenie_activity extends Kategorie {
    ViewPager viewPager1;
    Jedzenie_adapter adapter1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jedzenie);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Jedzenie");


        viewPager1 = (ViewPager)findViewById(R.id.view_pager1);
        adapter1 = new Jedzenie_adapter(this);
        viewPager1.setAdapter(adapter1);
    }
}
