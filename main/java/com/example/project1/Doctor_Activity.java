package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.project1.data_models.Doctor;
import com.example.projectnhom12.R;

import java.util.ArrayList;

public class Doctor_Activity extends AppCompatActivity {
    private ArrayList<Doctor> listDoctor;
    private ArrayAdapter<Doctor> adapter;
    private ListView listbacsi;
    Button btnthontin;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clickdoctor_layout);
        listbacsi = findViewById(R.id.lstBacSi);
        btnthontin = findViewById(R.id.btnthongtin);

        // dữ liệu giả
        listDoctor = new ArrayList<Doctor>();

        listDoctor.add(new Doctor("Phuong","DKTD","Tai, Mũi, Họng"));
        listDoctor.add(new Doctor("Hùng","DKTD","Tai, Mũi, Họng"));
        listDoctor.add(new Doctor("Thắng","DKTD","Tai, Mũi, Họng"));

        adapter = new ArrayAdapter<Doctor>(this,android.R.layout.simple_list_item_1,listDoctor);

        listbacsi.setAdapter(adapter);


        btnthontin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Doctor_Activity.this,DoctorInformation_Activity.class);
            }
        });
}
}
