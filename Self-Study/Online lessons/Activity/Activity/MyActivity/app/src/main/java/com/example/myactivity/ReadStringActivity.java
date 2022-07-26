package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ReadStringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_string);
        TextView tv_resource = findViewById(R.id.tv_resource);
        // 从 string.xml 获取名为 weather_str 的字符串值
        String value = getString(R.string.weather_str);
        tv_resource.setText(value);
    }
}