package com.example.gifapp;

import retrofit2.Call;
import retrofit2.http.GET;


public interface GifInfoAPI {

//    @GET("{key}")
//    public Call<GifInfoResult> getGiphyResponse(@Path("key") String key);

    @GET("https://api.giphy.com/v1/gifs/search?api_key=YGHnKKBGSydS6nSt6WAoUcICWwmgCfvL&q=cat&limit=10&offset=0&rating=g&lang=en")
    public Call<GifInfoResult> getEmptyGiphyResponse();

}
