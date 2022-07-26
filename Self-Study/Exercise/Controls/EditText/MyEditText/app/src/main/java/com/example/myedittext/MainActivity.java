package com.example.myedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et_name;
    private EditText et_phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btn_name = findViewById(R.id.btn_name);
        et_name = findViewById(R.id.et_name);

        btn_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et_name.getText().toString();
                Log.e("justyn", "输入的用户名: " + name);
            }
        });

        Button btn_phone = findViewById(R.id.btn_phone);
        et_phone = findViewById(R.id.et_phone);

        btn_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = et_phone.getText().toString();
                Log.e("justyn", "输入的手机号: " + phone );
            }
        });

    }
}