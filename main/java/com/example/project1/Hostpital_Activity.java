package com.example.project1;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.project1.data_models.Doctor;
import com.example.project1.data_models.Hostpital;
import com.example.projectnhom12.R;

import java.util.ArrayList;

public class Hostpital_Activity extends AppCompatActivity {
    private ArrayList<Hostpital> listHostpital;
    private ArrayAdapter<Hostpital> adapter;
    private ListView listhostpital;
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchhostpital_layout);
        listhostpital = findViewById(R.id.listhostpital);

        listHostpital = new ArrayList<Hostpital>();
        listHostpital.add(new Hostpital("DKTD","quận thủ đức"));
        listHostpital.add(new Hostpital("Hòa Hảo","quận 3"));
        adapter = new ArrayAdapter<Hostpital>(this,android.R.layout.simple_list_item_1,listHostpital);
        listhostpital.setAdapter(adapter);
    }
}
