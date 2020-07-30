package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.project1.data_models.Doctor;
import com.example.projectnhom12.R;


public class Home_Activity extends AppCompatActivity {
    Button btntuvan;
    Button btnlogout;
    Button btntimbenhvien;
    Button btntracuu;
    Intent intent;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        btntimbenhvien = findViewById(R.id.btnsearchbenhvien);
        btntracuu = findViewById(R.id.btntrieuchung);
        btnlogout = findViewById(R.id.btnlogout);
        btntuvan = findViewById(R.id.btnTVTT);
        intent = new Intent();

        btntracuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setClass(Home_Activity.this,DiseaseSearch_Activity.class);
                startActivity(intent);
            }
        });

        btntuvan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setClass(Home_Activity.this, Doctor_Activity.class);
                startActivity(intent);
            }
        });

        btntimbenhvien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setClass(Home_Activity.this, Hostpital_Activity.class);
                startActivity(intent);
            }
        });

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setClass(Home_Activity.this, Login_Activity.class);
                startActivity(intent);

            }
        });
    }
}
