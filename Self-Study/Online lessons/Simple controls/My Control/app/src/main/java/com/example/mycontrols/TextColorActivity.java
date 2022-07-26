package com.example.mycontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TextColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_color);
        // 从布局文件中获取名为 tv_color_system 的文本视图
        TextView tv_color = findViewById(R.id.tv_color_system);
        // 将 tv_tv_color_systemcolor 的文字颜色设置为系统自带的蓝色
        tv_color.setTextColor(Color.BLUE);
        // 从布局文件中获取名为 tv_color_rgb 的文本视图
        TextView tv_color_rgb = findViewById(R.id.tv_color_rgb);
        // 将 tv_color_rgb 的文字颜色设置为不透明的蓝色
        tv_color_rgb.setTextColor(0xff0000ff);
    }
}