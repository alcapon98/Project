package com.example.a10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et_main_person_name;
    TextView tv_main_show_person_name;
    Button btn_main_show_info;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_main_person_name = findViewById(R.id.et_main_person_name);
        tv_main_show_person_name = findViewById(R.id.tv_main_show_person_name);
        btn_main_show_info = findViewById(R.id.btn_main_info_show);

        btn_main_show_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
