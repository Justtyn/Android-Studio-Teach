package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.net.URL;

public class ActionUriActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_uri);
        findViewById(R.id.btn_dial).setOnClickListener(this);
        findViewById(R.id.btn_sms).setOnClickListener(this);
        findViewById(R.id.btn_my).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String PhoneNum = "12345";
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.btn_dial:
                // 设置意图动作为准备拨号
                intent.setAction(Intent.ACTION_DIAL);
                // 声明一个拨号的 Uri
                Uri uri1 = Uri.parse("tel:" + PhoneNum);
                intent.setData(uri1);
                startActivity(intent);
                break;

            case R.id.btn_sms:

                // 设置意图动作为发短信
                intent.setAction(Intent.ACTION_SENDTO);
                // 声明一个发短信的 Uri
                Uri uri2 = Uri.parse("smsto:" + PhoneNum);
                intent.setData(uri2);
                startActivity(intent);
                break;

            case R.id.btn_my:
                intent.setAction("android.intent.action.JZH");
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                startActivity(intent);
                break;
        }
    }
}