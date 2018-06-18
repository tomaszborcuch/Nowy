package com.example.tomek.londonschoolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button button;
    public Button button2;
    public Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennew();
            }
        });
        button3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennew2();
            }
        }));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }
    public void openActivity2 () {
        startActivity(new Intent(this, SlowkaListActivity.class));
    }
    public void opennew(){
        startActivity(new Intent(this,Kategorie.class));
    }
    public void  opennew2() { startActivity(new Intent(this,Quiz.class));}

}
