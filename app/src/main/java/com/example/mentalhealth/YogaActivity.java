package com.example.mentalhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.Locale;

public class YogaActivity extends AppCompatActivity {
    TextView input1,input2,input3,input4,input5,input6,input7;
    TextToSpeech ts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);

        input1 = findViewById(R.id.view1);
        ts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status!=TextToSpeech.ERROR) {
                    ts.setLanguage(new Locale("hi", "IN"));
                }
            }
        });
        input2 = findViewById(R.id.view2);
        ts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status!=TextToSpeech.ERROR) {
                    ts.setLanguage(new Locale("hi", "IN"));
                }
            }
        });
        input3 = findViewById(R.id.view3);
        ts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status!=TextToSpeech.ERROR) {
                    ts.setLanguage(new Locale("hi", "IN"));
                }
            }
        });
        input4 = findViewById(R.id.view4);
        ts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status!=TextToSpeech.ERROR) {
                    ts.setLanguage(new Locale("hi", "IN"));
                }
            }
        });
        input5 = findViewById(R.id.view5);
        ts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status!=TextToSpeech.ERROR) {
                    ts.setLanguage(new Locale("hi", "IN"));
                }
            }
        });
        input6 = findViewById(R.id.view6);
        ts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status!=TextToSpeech.ERROR) {
                    ts.setLanguage(new Locale("hi", "IN"));
                }
            }
        });
        input7 = findViewById(R.id.view7);
        ts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status!=TextToSpeech.ERROR) {
                    ts.setLanguage(new Locale("hi", "IN"));
                }
            }
        });

        Button button2=(Button) findViewById(R.id.button2);

//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String s = "https://seattleyoganews.com/15-yoga-poses-and-their-benefits-to-your-body/";
//                gotoUrl(s);
//            }
//        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBottomSheet(); // Call the method to open the bottom sheet
            }
        });

    }
    private void openBottomSheet() {
        // Create and configure the bottom sheet
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(YogaActivity.this);
        View bottomSheetView = getLayoutInflater().inflate(R.layout.bottom_sheet_yoga, null);

        // Get the layout from the bottom sheet layout
        LinearLayout layout1 = bottomSheetView.findViewById(R.id.yoga1);
        LinearLayout layout2 = bottomSheetView.findViewById(R.id.yoga2);

        // Set click listeners for the layouts
        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle layout1 click
                // You can perform any action or open a specific URL
                String s = "https://www.yogaalliance.org";
                gotoUrl(s);
            }
        });

        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle layout2 click
                // You can perform any action or open a specific URL
                String s = "https://seattleyoganews.com/15-yoga-poses-and-their-benefits-to-your-body/";
                gotoUrl(s);
            }
        });

        // Set the view and show the bottom sheet
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }


    public void convert1(View view) {
        String text = input1.getText().toString();
        ts.speak(text, TextToSpeech.QUEUE_FLUSH,null);
    }
    public void convert2(View view) {
        String text = input2.getText().toString();
        ts.speak(text, TextToSpeech.QUEUE_FLUSH,null);
    }
    public void convert3(View view) {
        String text = input3.getText().toString();
        ts.speak(text, TextToSpeech.QUEUE_FLUSH,null);
    }
    public void convert4(View view) {
        String text = input4.getText().toString();
        ts.speak(text, TextToSpeech.QUEUE_FLUSH,null);
    }
    public void convert5(View view) {
        String text = input5.getText().toString();
        ts.speak(text, TextToSpeech.QUEUE_FLUSH,null);
    }
    public void convert6(View view) {
        String text = input6.getText().toString();
        ts.speak(text, TextToSpeech.QUEUE_FLUSH,null);
    }
    public void convert7(View view) {
        String text = input7.getText().toString();
        ts.speak(text, TextToSpeech.QUEUE_FLUSH,null);
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}