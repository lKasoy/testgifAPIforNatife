package com.example.gifapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GifInfoAPI {

    @GET("{key}")
    public Call<GifInfoResult> getGiphyResponse(@Path("key") String key);

    @GET("https://api.giphy.com/v1/gifs/search?api_key=YGHnKKBGSydS6nSt6WAoUcICWwmgCfvL&q=pepsi&limit=25&offset=0&rating=g&lang=en")
    public Call<GifInfoResult> getEmptyGiphyResponse();

}
