package com.example.gifapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.GridView;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private GridView gvGif;
    private List<Datum> datums;

//    private String[] urls;

    public static String key = "search?api_key=YGHnKKBGSydS6nSt6WAoUcICWwmgCfvL&q=&limit=25&offset=0&rating=g&lang=en";

    private List<GifInfoResult> gifInfoResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gvGif = findViewById(R.id.gvGif);


    }

    @Override
    protected void onResume() {
        super.onResume();

        readGif();

    }

    private void renderGif() {

        GiphyAdapter giphyAdapter = new GiphyAdapter(this, 1, datums);
        gvGif.setAdapter(giphyAdapter);
    }


    public void readGif(){

//    String key = MainActivity.key;
    String [] urls = {"","","","","","","","",""};



        RetrofitInstance.getInstance()
                .getApiInterface()
                .getEmptyGiphyResponse()
                .enqueue(new Callback<GifInfoResult>() {
                    @Override
                    public void onResponse(Call<GifInfoResult> call, Response<GifInfoResult> response) {

                        if (response.isSuccessful()) {

                            GifInfoResult gifInfoResults = response.body();

                            if(gifInfoResults != null)
                            {
                                datums = gifInfoResults.getData();

                                if(datums != null)
                                {

                                    Datum datum = datums.get(0);
                                    Log.d("MyApp", String.valueOf(datums.size()));
                                    renderGif();
                                }
                            }







//                            for (int i = 0; i < datums.size() ; i++) {
//
//                                Datum datum = datums.get(i);
//
//                                Images images = datum.getImages();
//
//                                DownsizedStill previewGif = images.getDownsizedStill();
//
//                                urls[i] = previewGif.getUrl();
//
//                                Log.d("MyApp", urls[i]);}

                            }
                        }


                    @Override
                    public void onFailure(Call<GifInfoResult> call, Throwable t) {

                    }
                });

    }
}