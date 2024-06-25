package com.example.viewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btneditprofile = findViewById(R.id.btn_main_edit_profile);
        CheckBox checkBox1 = findViewById(R.id.checkBox1);
        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        CheckBox checkBox3 = findViewById(R.id.checkBox3);
        RadioGroup radioGroup = findViewById(R.id.radiogroup);
        RadioButton radioButton1 = findViewById(R.id.radio_main_btn1);
        RadioButton radioButton2 = findViewById(R.id.radio_main_btn2);
        RadioButton radioButton3 = findViewById(R.id.radio_main_btn3);
        TextView txtfullname = findViewById(R.id.txt_main_name);

        btneditprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, Maineditprofile.class);
                startActivity(intent);
            }
        });
        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "checkbox1", Toast.LENGTH_LONG) . show();
                }
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radio_main_btn1) {
                    Toast.makeText(MainActivity.this, "radio1", Toast.LENGTH_LONG) . show();
                }
                if (checkedId == R.id.radio_main_btn2) {
                    Toast.makeText(MainActivity.this, "radio2", Toast.LENGTH_LONG) . show();
                }
                if (checkedId == R.id.radio_main_btn3) {
                    Toast.makeText(MainActivity.this, "radio3", Toast.LENGTH_LONG) . show();
                }
            }
        });
        String txfullname = getIntent().getStringExtra("fullname");
        txtfullname.setText(txfullname);


    }
}