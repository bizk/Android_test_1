package com.example.test_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] t1;
    String[] t2;
    LayoutInflater infltr;
    public CustomAdapter(Context appContext, String[] titulo1, String[] titulo2){
        this.context = appContext;
        this.t1 = titulo1;
        this.t2 = titulo2;
        infltr = (LayoutInflater.from(appContext));
    }

    @Override
    public int getCount() {
        return t1.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = infltr.inflate(R.layout.itemlayout,null);
        TextView aaa = (TextView) view.findViewById(R.id.textView);
        aaa.setText(t1[i]);
        TextView textView2 = (TextView) view.findViewById(R.id.textView2);
        textView2.setText(t2[i]);
        return view;
    }
}

