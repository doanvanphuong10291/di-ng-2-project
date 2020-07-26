package com.example.project1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.project1.data_models.DiseaseSearch;
import com.example.projectnhom12.R;

import java.util.ArrayList;

public class DiseaseSearch_Activity extends AppCompatActivity {
    private ArrayList<DiseaseSearch> listTrieuChung;
    private ArrayAdapter<DiseaseSearch> adapter;
    private ListView listtrieuchung;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manger_trieuchung);
        listtrieuchung = findViewById(R.id.listTrieuChung);

        // dữ liệu giả
        listTrieuChung = new ArrayList<DiseaseSearch>();

        listTrieuChung.add(new DiseaseSearch("Nóng","Nóng"));



        adapter = new ArrayAdapter<DiseaseSearch>(this,android.R.layout.simple_list_item_1,listTrieuChung);

        listtrieuchung.setAdapter(adapter);
}
}
