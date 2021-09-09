package com.example.gifapp;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Glide;
import java.util.List;


public class GiphyAdapter extends ArrayAdapter<Datum> {

    public GiphyAdapter(@NonNull Context context, int resource, @NonNull List<Datum> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Datum datum = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.gif_item, parent, false);}

        Images images = datum.getImages();
        DownsizedMedium downsizedMedium = images.getDownsizedMedium();

        ImageView imgGif = convertView.findViewById(R.id.imgGif);
        imgGif.setPadding(1,1,1,1);

        Glide.
                 with(convertView.getContext())
                .asGif()
                .load(Uri.parse(downsizedMedium.getUrl()))
                .into(imgGif);

 return convertView;
    }

}
