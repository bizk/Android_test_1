package com.example.test_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] text1 = {"aaa","bbbb","cccc","Ddddd dddd ddddddddddd","eeeeeeee","FFFFFFFFFFFFFFFFFFFFFFFF","GGGG"};
    String[] text2 = {"111111111111111111111","22222222222222222222","333333333333333","44444444444","555555555555","66666666666666","77777"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.ListViewID);
        CustomAdapter  customAdapter = new CustomAdapter(getApplicationContext(),text1,text2);
        listView.setAdapter(customAdapter);
    }
}
