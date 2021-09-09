package com.example.gifapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import static com.example.gifapp.MainActivity.datums;
import static com.example.gifapp.MainActivity.urls;

public class GifOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif_one);

        Intent intent = getIntent();

        int position = intent.getExtras().getInt("id");
        Log.d("MyApp", position + " в новом активити");

        GiphyAdapter giphyAdapter = new GiphyAdapter(this, 0, datums);

        ImageView imageView = findViewById(R.id.imgGifOne);

        Glide
                .with(this)
                .asGif()
                .load(urls[position])
                .into(imageView);
//        Log.d("MyApp", String.valueOf(giphyAdapter.getView().));

//        GiphyAdapter giphyAdapter = new GiphyAdapter(this, 0);
//        ImageView imageView = findViewById(R.id.imgGifOne);
//        imageView.setImageResource(giphyAdapter);

            }
        }