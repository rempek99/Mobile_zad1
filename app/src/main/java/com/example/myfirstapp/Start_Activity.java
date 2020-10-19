package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;

import com.example.myfirstapp.task1.MainActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class Start_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_activity);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btn_task1 = (Button) findViewById(R.id.btn_task1);
        btn_task1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_to_task1 = new Intent(getApplicationContext(), com.example.myfirstapp.task1.MainActivity.class);
                startActivity(go_to_task1);
            }
        });
        Button btn_task2 = (Button) findViewById(R.id.btn_task2);
        btn_task2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_to_task2 = new Intent(getApplicationContext(), com.example.myfirstapp.task2.MainActivity.class);
                startActivity(go_to_task2);
            }
        });
    }
}