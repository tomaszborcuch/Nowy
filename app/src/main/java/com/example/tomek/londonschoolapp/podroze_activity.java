package com.example.tomek.londonschoolapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class podroze_activity extends Kategorie {
    ViewPager viewPager;
    Podroze_adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podroze_activity);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Podróże");
        viewPager = (ViewPager)findViewById(R.id.view_pager);
        adapter = new Podroze_adapter(this);
        viewPager.setAdapter(adapter);
    }
}
