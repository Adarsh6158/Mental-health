package com.example.mentalhealth;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

public class QuotesActivity extends AppCompatActivity {
    private ImageView backgroundImageView;
    String[] QuotesFilename;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);

        backgroundImageView = findViewById(R.id.backgroundImageView);
        AssetManager assetManager = getAssets();
        try {
            QuotesFilename = assetManager.list("Images");
            int randomNumber = new Random().nextInt(QuotesFilename.length);
            InputStream inputStream = assetManager.open("Images/" + QuotesFilename[randomNumber]);

            // Convert InputStream to Drawable
            Drawable drawable = Drawable.createFromStream(inputStream, null);

            // Set the Drawable as the background image for the ImageView
            backgroundImageView.setImageDrawable(drawable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int delayMillis = 4000;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Intent to start MainActivity4
                Intent intent = new Intent(QuotesActivity.this, MainActivity4.class);
                startActivity(intent);
                finish();
            }
        }, delayMillis);
    }
}

//
//public class QuotesActivity extends AppCompatActivity {
//
//    private int[] imageResources = {R.drawable.img1, R.drawable.img2, R.drawable.img3};
//    private ImageView backgroundImageView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_quotes);
//
//        backgroundImageView = findViewById(R.id.backgroundImageView);
//
//        // Code to change the background image
//        int randomImageIndex = (int) (Math.random() * imageResources.length);
//        int randomImageResource = imageResources[randomImageIndex];
//        backgroundImageView.setImageResource(randomImageResource);
//
//        // Delay for 6 seconds
//        int delayMillis = 6000;
//
//        // Handler to post a delayed Runnable for redirection
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                // Code to redirect the user to another activity (e.g., MainActivity4)
//                Intent intent = new Intent(QuotesActivity.this, MainActivity4.class);
//                startActivity(intent);
//                finish(); // Optional: Finish the QuotesActivity so the user cannot go back to it
//            }
//        }, delayMillis);
//    }
//}