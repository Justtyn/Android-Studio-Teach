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
        // 从布局文件中获取名为 tv_color_code_system 的文本视图
        TextView tv_color_code_system = findViewById(R.id.tv_color_code_system);
        // 将 tv_color_code_system 的文字颜色设置为系统自带的蓝色
        tv_color_code_system.setTextColor(Color.BLUE);

        // 从布局文件中获取名为 tv_color_code_eight_rgb 的文本视图
        TextView tv_color_code_eight_rgb = findViewById(R.id.tv_color_code_eight_rgb);
        // 将 tv_color_code_eight_rgb 的文字颜色设置为不透明的蓝色
        tv_color_code_eight_rgb.setTextColor(0xff0000ff);

        // 从布局文件中获取名为 tv_color_code_six_rgb 的文本视图
        TextView tv_color_code_six_rgb = findViewById(R.id.tv_color_code_six_rgb);
        // 将 tv_color_code_six_rgb 的文字颜色设置为透明的蓝色 透明即看不到
        tv_color_code_six_rgb.setTextColor(0x0000ff);

        // 从布局文件中获取名为 tv_color_background 的文本视图
        TextView tv_color_background = findViewById(R.id.tv_color_background);
        // 将 tv_color_background 的背景颜色设置为绿色
        tv_color_background.setBackgroundColor(Color.GREEN);
        // 颜色来源于资源文件
        tv_color_background.setBackgroundResource(R.color.blue);
    }
}