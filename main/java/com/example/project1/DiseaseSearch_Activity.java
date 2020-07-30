package com.example.project1;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.project1.data_models.DiseaseSearch;
import com.example.projectnhom12.R;

import java.util.ArrayList;

public class DiseaseSearch_Activity extends AppCompatActivity {
    String[] items;
    private ArrayList<DiseaseSearch> listTrieuChung;
    private ArrayAdapter<DiseaseSearch> adapter;
    private ListView listtrieuchung;
    EditText edtTrieuChung;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manger_trieuchung);
        listtrieuchung = findViewById(R.id.listTrieuChung);
        edtTrieuChung = findViewById(R.id.edtTrieuChung);
            initlist();


            edtTrieuChung.addTextChangedListener(new TextWatcher() {
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
                        searchDiseaseSearch(s.toString());
                    }
                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            });
    }
    public void searchDiseaseSearch(String search){
        for(String item: items){
            if(!item.contains(search));
            {
                listTrieuChung.remove(item);
            }
        }
        adapter.notifyDataSetChanged();
    }
    public void initlist(){
        // dữ liệu giả
        listTrieuChung = new ArrayList<DiseaseSearch>();
        listTrieuChung.add(new DiseaseSearch("Nóng","Nóng"));
        adapter = new ArrayAdapter<DiseaseSearch>(this,android.R.layout.simple_list_item_1,listTrieuChung);
        listtrieuchung.setAdapter(adapter);
    }


}
