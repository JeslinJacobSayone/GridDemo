package com.example.sayone.griddemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    public List<Integer> mThumbIds = new ArrayList<>(Arrays.asList(
            R.drawable.logone, R.drawable.logtwo,
            R.drawable.logthree, R.drawable.logfive,
            R.drawable.logfive, R.drawable.logseven,
            R.drawable.logone, R.drawable.logfive,
            R.drawable.logfive, R.drawable.logthree,
            R.drawable.logone, R.drawable.logthree,
            R.drawable.logfive, R.drawable.logfive,
            R.drawable.logfive, R.drawable.logone,
            R.drawable.logthree, R.drawable.logthree,
            R.drawable.logfive, R.drawable.logfive,
            R.drawable.logfive, R.drawable.logthree));

    public List<String> names=new ArrayList<>(Arrays.asList(
            "hai","hello",
            "hai","hello",
            "hai","hello",
            "hai","hello",
            "hai","hello",
            "hai","hello",
            "hai","hello",
            "hai","hello",
            "hai","hello",
            "hai","hello",
            "hai","hello"

    ));

    // Constructor
    public ImageAdapter(Context c) {
        mContext = c;
    }

//
//    public Integer[] mThumbIds = {
//            R.drawable.logone, R.drawable.logtwo,
//            R.drawable.logthree, R.drawable.logfive,
//            R.drawable.logfive, R.drawable.logseven,
//            R.drawable.logone, R.drawable.logfive,
//            R.drawable.logfive, R.drawable.logthree,
//            R.drawable.logone, R.drawable.logthree,
//            R.drawable.logfive, R.drawable.logfive,
//            R.drawable.logfive, R.drawable.logone,
//            R.drawable.logthree, R.drawable.logthree,
//            R.drawable.logfive, R.drawable.logfive,
//            R.drawable.logfive, R.drawable.logthree
//    };

    @Override
    public int getCount() {
        return mThumbIds.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView;

        View grid;
        LayoutInflater inflater =(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        if (convertView == null) {

            grid = new View(mContext);
            grid = inflater.inflate(R.layout.tryit, null);
            TextView  textView = (TextView) grid.findViewById(R.id.gridtext);
            imageView = (ImageView)grid.findViewById(R.id.gridimg);
            textView.setText(names.get(position));
            imageView.setImageResource(mThumbIds.get(position));
//            imageView.setLayoutParams(new GridLayout.LayoutParams());
//            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//            imageView.setPadding(8, 8, 8, 8);
        }
        else
        {
            grid = (View) convertView;
        }


        return grid;
    }
}
