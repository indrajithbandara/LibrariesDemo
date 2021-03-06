package com.snehpandya.glidedemo;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.signature.StringSignature;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageview);

        //Loading image using Glide from URL into imageView
        Glide.with(this)
                .load("https://pbs.twimg.com/profile_images/2652314177/3c0f918ced0ad55d8a628c1df7739b62_400x400.png").asBitmap() //Loads image as a Bitmap
                .signature(new StringSignature(String.valueOf(System.currentTimeMillis() / (7 * 24 * 60 * 60 * 1000)))) //Clear Cache of Specific image URL
                .error(R.mipmap.ic_launcher_round)
                .into(imageView);
    }
}
