package com.taqpa.sample_activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    String[] Titles;
    String[] SubTitles;
    int[] images;

    public CustomAdapter(Context context, String[] titles, String[] subTitles, int[] images) {
        this.context = context;
        Titles = titles;
        SubTitles = subTitles;
        this.images = images;

        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return Titles.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint({"ViewHolder", "InflateParams"})
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.sample_layout, null);

        TextView name = (TextView) convertView.findViewById(R.id.title);
        TextView speed = (TextView) convertView.findViewById(R.id.subT);
        ImageView image = (ImageView) convertView.findViewById(R.id.profile_image);


        name.setText(Titles[position]);
        speed.setText(SubTitles[position]);
        image.setImageResource(images[position]);


        return convertView;
    }
}
