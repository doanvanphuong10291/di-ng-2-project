package com.example.project1;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
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
    String[] items;
    EditText edtSearh;
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchhostpital_layout);
        listhostpital = findViewById(R.id.listhostpital);


        initlist();

        edtSearh.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.toString().equals("")){
                    // nếu như trên thanh tìm kiếm không có text thì sẽ load lại danh sách
                    initlist();
                }else{
                    // ngược lại nếu có text thì sẽ cho tìm kiếm
                    searchhostpital(s.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    public void searchhostpital(String search){
        for(String item: items){
            if(!item.contains(search));
            {
                listHostpital.remove(item);
            }
        }
        adapter.notifyDataSetChanged();
    }
    public void initlist(){
        listHostpital = new ArrayList<Hostpital>();
        listHostpital.add(new Hostpital("DKTD","quận thủ đức"));
        listHostpital.add(new Hostpital("Hòa Hảo","quận 3"));
        adapter = new ArrayAdapter<Hostpital>(this,android.R.layout.simple_list_item_1,listHostpital);
        listhostpital.setAdapter(adapter);
    }
}
