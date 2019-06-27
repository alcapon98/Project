package com.example.inputinformationvalidation;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et_name;
    EditText et_lastname;
    EditText phone_number;
    Button btn_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_name=findViewById(R.id.et_get_name);
        et_lastname=findViewById(R.id.et_get_lastname);
        phone_number=findViewById(R.id.et_get_phone_number);
        btn_save=findViewById(R.id.bt_save_info);


    }


    public void onclick(View view){


    }
}
