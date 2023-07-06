package com.example.mentalhealth;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testing3);

        TextView content=(TextView)findViewById(R.id.content);

        ImageButton button=(ImageButton) findViewById(R.id.button);
        ImageView meditation=(ImageView) findViewById(R.id.meditation);
        ImageView yoga=(ImageView) findViewById(R.id.yoga);
        ImageView song=(ImageView) findViewById(R.id.song);
        ImageView games=(ImageView) findViewById(R.id.games);
        ImageView quotes=(ImageView) findViewById(R.id.quotes);
        ImageView tips=(ImageView) findViewById(R.id.tips);

        // to Retrieve name of the users
        SharedPreferences sp = getApplicationContext().getSharedPreferences("Full name", Context.MODE_PRIVATE);
        String name = sp.getString("Name", "");

        TextView view = findViewById(R.id.content);
        String greeting = "Hello ," + name;
        view.setText(greeting);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(intent);
            }
        });

        meditation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity4.this,StopwatchActivity.class);
                startActivity(intent);
            }
        });

        yoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity4.this,YogaActivity.class);
                startActivity(intent);
            }
        });

        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity4.this, SongActivity.class);
                startActivity(intent);
            }
        });

        games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity4.this, GamesActivity.class);
                startActivity(intent);
            }
        });
        quotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity4.this, QuotesActivity.class);
                startActivity(intent);
            }
        });
        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity4.this, TipsActivity.class);
                startActivity(intent);
            }
        });
    }
}