package com.example.mentalhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        TextView name1=(TextView) findViewById(R.id.name1);
        TextView  age2=(TextView) findViewById(R.id.age2);
        TextView  work2=(TextView) findViewById(R.id.work2);
        TextView  contact2=(TextView) findViewById(R.id.contact2);

        SharedPreferences sp= getApplicationContext().getSharedPreferences("Full name", Context.MODE_PRIVATE);
        String name=sp.getString("Name"," ");
        String age = sp.getString("age", "");
        String work=sp.getString("work"," ");
        String contact=sp.getString("contact","");

        name1.setText(name);
        age2.setText(age);
        work2.setText(work);
        contact2.setText(contact);
    }
}