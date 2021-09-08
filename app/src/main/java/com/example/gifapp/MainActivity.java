package com.example.gifapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.GridView;
import android.widget.ImageView;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private GridView gvGif;
    private WebView webView;
    private ImageView imgView;
    public static String key = "search?api_key=YGHnKKBGSydS6nSt6WAoUcICWwmgCfvL&q=&limit=25&offset=0&rating=g&lang=en";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
        imgView = findViewById(R.id.imgView);

        startMyAsyncTask();

    }

    public void startMyAsyncTask() {

        MyAsyncTask myAsyncTask = new MyAsyncTask();
        myAsyncTask.execute();

    }

}

class MyAsyncTask extends AsyncTask{

    private String key = MainActivity.key;
    public static String [] urls = {"","","","","","","","",""};


    @Override
    protected Object doInBackground(Object[] objects) {

        RetrofitInstance.getInstance()
                .getApiInterface()
                .getEmptyGiphyResponse()
                .enqueue(new Callback<GifInfoResult>() {
                    @Override
                    public void onResponse(Call<GifInfoResult> call, Response<GifInfoResult> response) {

                        if (response.isSuccessful()) {

                            GifInfoResult gifInfoResult = response.body();

                            List<Datum> datumList = gifInfoResult.getData();

                            Log.d("MyApp", String.valueOf(datumList.size()));

                            for (int i = 0; i < datumList.size() ; i++) {

                                Datum datum = datumList.get(i);

                                Images images = datum.getImages();

                                DownsizedStill previewGif = images.getDownsizedStill();

                                urls[i] = previewGif.getUrl();

                                Log.d("MyApp", urls[i]);


                            }

                        }

                    }

                    @Override
                    public void onFailure(Call<GifInfoResult> call, Throwable t) {

                    }
                });
        return urls;
    }
}