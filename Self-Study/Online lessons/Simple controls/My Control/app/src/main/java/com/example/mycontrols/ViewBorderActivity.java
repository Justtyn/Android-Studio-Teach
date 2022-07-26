package com.example.mycontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mycontrols.util.Utils;

public class ViewBorderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_border);
        TextView tv_code_border = findViewById(R.id.tv_code_border);
        // 获取 tv_code_border 的布局参数（含宽度和高度）
        ViewGroup.LayoutParams params = tv_code_border.getLayoutParams();
        // 修改布局参数中的宽高数值 注意默认 px 为单位 需要把 dp 数值转换为 px 数值
        params.width = Utils.dip2px(this, 300);
        // 设置 tv_code_border 的布局参数
        tv_code_border.setLayoutParams(params);
    }
}