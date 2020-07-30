package com.example.project1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.project1.data_models.Doctor;
import com.example.projectnhom12.R;

import java.util.ArrayList;

public class DoctorInformation_Activity extends AppCompatActivity {

    Button btnchat;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doctor_layout);
        btnchat = findViewById(R.id.btnChat);

        // dữ liệu giả

}
}
