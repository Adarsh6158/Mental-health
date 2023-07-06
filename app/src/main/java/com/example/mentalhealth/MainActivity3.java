package com.example.mentalhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity3 extends AppCompatActivity {
    EditText name,age,work,contact;
    Button subbtton;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        name=findViewById(R.id.name);
        age=findViewById(R.id.age);
        work=findViewById(R.id.work);
        contact=findViewById(R.id.contact);
        subbtton=findViewById(R.id.subbutton);

        sp=getSharedPreferences("Full name", Context.MODE_PRIVATE);


        subbtton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameStr = name.getText().toString();
                String ageStr = age.getText().toString();
                String workStr = work.getText().toString();
                String contactStr = contact.getText().toString();

                if (nameStr.isEmpty() || ageStr.isEmpty() || workStr.isEmpty() || contactStr.isEmpty()) {
                    Toast.makeText(MainActivity3.this, "Please fill in all the details", Toast.LENGTH_SHORT).show();
                } else {
                    SharedPreferences.Editor editor = sp.edit();

                    editor.putString("Name", nameStr);
                    editor.putString("age", ageStr);
                    editor.putString("work", workStr);
                    editor.putString("contact", contactStr);

                    editor.apply();

                    Toast.makeText(MainActivity3.this, "Information saved", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                    startActivity(intent);
                }
            }
        });

    }
}