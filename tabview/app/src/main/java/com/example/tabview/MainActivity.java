package com.example.tabview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.tabview.basic.TabLayoutBasicActivity;
import com.example.tabview.custome.TabLayoutCustomeActivity;

public class MainActivity extends AppCompatActivity {

    Context mContext;
    Button btnBasic, btnCustome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;
        btnBasic = findViewById(R.id.btn_basic_tab_view);
        btnCustome = findViewById(R.id.btn_custome_tab_view);

        btnBasic.setOnClickListener(view -> {
            Intent intent = new Intent(mContext, TabLayoutBasicActivity.class);
            startActivity(intent);
        });

        btnCustome.setOnClickListener(view -> {
            Intent intent = new Intent(mContext, TabLayoutCustomeActivity.class);
            startActivity(intent);
        });

    }
}