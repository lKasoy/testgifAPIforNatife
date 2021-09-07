package com.example.gifapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.renderscript.Sampler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtKey;
    private Button btnSearch;
    public static String key = "search?api_key=YGHnKKBGSydS6nSt6WAoUcICWwmgCfvL&q=&limit=25&offset=0&rating=g&lang=en";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtKey = findViewById(R.id.txtKey);
        btnSearch = findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(this);

    }

    public void startMyAsyncTask() {

        MyAsyncTask myAsyncTask = new MyAsyncTask();
        myAsyncTask.execute();
    }


    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btnSearch:
            {
                startMyAsyncTask();
            }
        }

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

                                PreviewGif previewGif = images.getPreviewGif();

                                urls[i] = previewGif.getUrl();

                                Log.d("MyApp", urls[i]);

                            }

                        }

                    }

                    @Override
                    public void onFailure(Call<GifInfoResult> call, Throwable t) {

                    }
                });
        return null;
    }
}