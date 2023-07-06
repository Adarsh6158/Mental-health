package com.example.mentalhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SongActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        TextView aff = (TextView) findViewById(R.id.aff);

        Button button = (Button) findViewById(R.id.button);
        LinearLayout button1 = findViewById(R.id.button1);
        LinearLayout button2 = findViewById(R.id.button2);
        LinearLayout button3 = findViewById(R.id.button3);
        LinearLayout button4 = findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "https://youtu.be/fG1oNm2tCro";
                gotoUrl(s);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s="https://youtu.be/lE6RYpe9IT0";
                gotoUrl(s);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s="https://youtu.be/9BD1y0TOk3o";
                gotoUrl(s);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s="https://youtu.be/ijfLsKg8jFY";
                gotoUrl(s);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s="https://youtu.be/Lju6h-C37hE";
                gotoUrl(s);
            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}