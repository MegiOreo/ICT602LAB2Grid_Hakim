package com.example.lab2layoutgrid_hakimi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mcontext;

    public Integer[] thumbImages = {
            R.drawable.kuuga_1, R.drawable.agito_2, R.drawable.ryuki_3, R.drawable.faiz_4,
            R.drawable.blade_5, R.drawable.hibiki_6, R.drawable.kabuto_7, R.drawable.deno_8,
            R.drawable.kiva_9, R.drawable.decade_10, R.drawable.w_11, R.drawable.ooo_12,
            R.drawable.fourze_13,
    };

    public ImageAdapter(Context c) {
        mcontext = c;
    }

    @Override
    public int getCount() {
        return thumbImages.length;
    }

    @Override
    public Object getItem(int position) {
        return 0;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mcontext);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(250, 250));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8, 8, 8, 8);
        imageView.setImageResource(thumbImages[position]);
        return imageView;
    }
}
