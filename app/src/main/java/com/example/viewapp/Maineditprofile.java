package com.example.viewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Maineditprofile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maineditprofile);

        Button btndone = findViewById(R.id.btn_editprofile_done);
        TextView txtfullname = findViewById(R.id.fullname);

        btndone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullname = txtfullname.getText().toString();
                Intent intent = new Intent(Maineditprofile.this , MainActivity.class);
                intent.putExtra("fullname", fullname);
                startActivity(intent);
            }
        });

    }
}
