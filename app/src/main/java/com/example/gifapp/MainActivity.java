package com.example.gifapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private GridView gvGif;
    public static List<Datum> datums;
    public static String[] urls = {"","","","","","","","","",""};
    public static int positionNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gvGif = findViewById(R.id.gvGif);
        gvGif.setOnItemClickListener(gridViewOnItemClickListener);

    }

    private GridView.OnItemClickListener gridViewOnItemClickListener = new GridView.OnItemClickListener()
    {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            positionNumber = position;
            Intent intent = new Intent(getApplicationContext(),GifOne.class);
            intent.putExtra("id", position);


            Log.d("MyApp", String.valueOf(position));
            startActivity(intent);

        }
    };

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

                                    for (int i = 0; i <datums.size() ; i++) {

                                        Datum datum1 = datums.get(i);
                                        Images images = datum1.getImages();
                                        DownsizedMedium downsizedMedium = images.getDownsizedMedium();
                                        urls[i] = String.valueOf(downsizedMedium.getUrl());
                                    }

                                    renderGif();
                                }
                            }

                        }
                    }

                    @Override
                    public void onFailure(Call<GifInfoResult> call, Throwable t) {

                    }
                });

    }
}