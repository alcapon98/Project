package com.example.mz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_main_show_info , btn_main_web , btn_main_save_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_main_show_info = findViewById(R.id.btn_main_show_info);
        btn_main_web = findViewById(R.id.btn_main_web);
        btn_main_save_info = findViewById(R.id.btn_main_save_info);


    }
}
