package com.example.gifapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

        private static RetrofitInstance retrofitInstance;

        private Retrofit retrofit;

        private RetrofitInstance()
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.giphy.com/v1/gifs/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


        }

        public static RetrofitInstance getInstance()
        {
            if(retrofitInstance == null)
            {
                retrofitInstance = new RetrofitInstance();
            }

            return retrofitInstance;
        }

        public GifInfoAPI getApiInterface(){

            return retrofit.create(GifInfoAPI.class);
        }

    }
