package com.example.mentalhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class GamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);

        TextView textView = (TextView) findViewById(R.id.textView);
        TextView chess = (TextView) findViewById(R.id.chess);
        TextView puzzel = (TextView) findViewById(R.id.puzzel);
        TextView sudko = (TextView) findViewById(R.id.sudko);

        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton puzzelbutton = (ImageButton) findViewById(R.id.puzzelbutton);
        ImageButton button = (ImageButton) findViewById(R.id.button);

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s="https://www.chess.com/play";
                gotoUrl(s);
            }
        });
        puzzelbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s="https://www.arkadium.com/free-online-games/puzzles/";
                gotoUrl(s);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s="https://www.247sudoku.com/?utm_source=google&utm_campaign=247june2022&gclid=CjwKCAjwt7SWBhAnEiwAx8ZLajvGSUW9ZwdHUzUtJNicOuaqrHuY-6k1HZ3IY8xVcVmimeLo3vpoUxoCOz0QAvD_BwE";
                gotoUrl(s);
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
