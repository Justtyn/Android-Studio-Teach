package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActStartActivity extends AppCompatActivity implements View.OnClickListener {


    private static final String TAG = "jzh";

    //  创建活动 把页面布局加载到内存 进入初始状态
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ActStartActivity");
        setContentView(R.layout.activity_act_start);

        // 拿到组件
        findViewById(R.id.btn_act_next).setOnClickListener(this);
    }

    // 活动的启动 即跳转到下一个活动
    @Override
    public void onClick(View v) {
        // 显示 Intent
        // 方法1 在 Intent 的构造函数中指定
        //Intent intent = new Intent(this, ActFinishActivity.class);
        // 方法2 调用意图对象的 setClass 方法指定
        Intent intent = new Intent();
        //intent.setClass(this, ActFinishActivity.class);
        // 方法3 调用意图对象的 setComponent 方法指定
        ComponentName component = new ComponentName(this, ActFinishActivity.class);
        intent.setComponent(component);

        startActivity(intent);
    }

    //  开始活动 把活动页面显示在屏幕上 进入就绪状态
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ActStartActivity");
    }

    //  恢复活动 活动页面进入活跃状态 能够与用户正常交互   eg: 允许相应用户的点击动作等...
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ActStartActivity");
    }

    //  暂停活动 页面进入暂停状态 无法与用户正常交互
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ActStartActivity");
    }

    //  停止活动 页面将不显示在屏幕上
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ActStartActivity");
    }

    //  重启活动 重新加载内存中的页面数据
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ActStartActivity");
    }

    //  销毁活动 回收活动占用的系统资源 把页面从内存中清除
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ActStartActivity");
    }
}