package tdc.edu.vn.tracnghiem;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import tdc.edu.vn.tracnghiem.data_models.AbtractQuestion;
import tdc.edu.vn.tracnghiem.data_models.Question;

public class MH6Activity extends AppCompatActivity {
    Button btnEnd;
    Button btnPrevious;
    Button btnNext;
    Intent intent;
    ArrayAdapter<AbtractQuestion> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mh6_layout);
        btnPrevious = findViewById(R.id.btnPrevious);
        btnNext = findViewById(R.id.btnNext);
        btnEnd = findViewById(R.id.btnEnd);
        intent = MH1Activity.intent;


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setClass(MH6Activity.this, MH1Activity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);

                // start intent
                startActivity(intent);

            }
        });
        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setClass(MH6Activity.this, MH1Activity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);

                // start intent
                startActivity(intent);
            }
        });
        ListView listResult = findViewById(R.id.listResult);

        ArrayList<Question> listdataResult = new ArrayList<Question>();


        adapter = new ArrayAdapter<AbtractQuestion>(this,android.R.layout.simple_list_item_1,Question.questions);
        listResult.setAdapter(adapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        adapter.notifyDataSetChanged();
    }
}
