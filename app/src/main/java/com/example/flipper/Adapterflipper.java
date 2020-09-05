package com.example.flipper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class Adapterflipper extends BaseAdapter {
    Context context;
    int []adimg;

    public Adapterflipper(Context context, int[] adimg) {
        this.context = context;
        this.adimg = adimg;
    }

    @Override
    public int getCount() {
        return adimg.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View v, ViewGroup viewGroup) {
         v= LayoutInflater.from(context).inflate(R.layout.rootlayout,viewGroup,false);
       ImageView imageView=v.findViewById(R.id.adlyimg);
       imageView.setImageResource(adimg[i]);
        return v;
    }
}
