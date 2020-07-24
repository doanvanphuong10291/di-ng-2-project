package tdc.edu.vn.tracnghiem;

import android.app.FragmentTransaction;
import android.content.Intent;

import android.os.Bundle;

import android.text.Layout;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import tdc.edu.vn.tracnghiem.data_models.MatchingQuestion;
import tdc.edu.vn.tracnghiem.data_models.Question;
import tdc.edu.vn.tracnghiem.fragments.AbstractsFragment;

public class MH3Activity extends AppCompatActivity {
    int questionID = 0;
    AbstractsFragment fragment;
    FragmentTransaction fragmentTransaction;

    Button btnEnd;
    Button btnPrevious;
    Button btnNext;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mh3_layout);
        btnPrevious = findViewById(R.id.btnPrevious);
        btnNext = findViewById(R.id.btnNext);
        btnEnd = findViewById(R.id.btnEnd);
        /*txtcauhoi = findViewById(R.id.txtcauhoi);
        edtluachon1 = findViewById(R.id.edtluachon1);
        edtluachon2 = findViewById(R.id.edtluachon2);
        edtluachon3 = findViewById(R.id.edtluachon3);
        snluachon1= findViewById(R.id.snluachon1);
        snluachon2= findViewById(R.id.snluachon2);
        snluachon3= findViewById(R.id.snluachon3);*/
        intent = MH1Activity.intent;

        // processing
        /*MatchingQuestion qs3 = (MatchingQuestion) Question.questions.get(2);
        txtcauhoi.setText(qs3.getQuestionDrscription());
        edtluachon1.setText(qs3.getQuestionchoiseA().get(0));
        edtluachon2.setText(qs3.getQuestionchoiseA().get(1));
        edtluachon3.setText(qs3.getQuestionchoiseA().get(2));
        ArrayAdapter<String> adaptermatching  = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,qs3.getQuestionchoiseB());
        snluachon1.setAdapter(adaptermatching);
        snluachon2.setAdapter(adaptermatching);
        snluachon3.setAdapter(adaptermatching);*/

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*intent.setClass(MH3Activity.this,MH4Activity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);*/

            }
        });
        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*intent.setClass(MH3Activity.this,MH6Activity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                // start intent
                startActivity(intent);*/

            }
        });
    }
    protected void onResume() {
        super.onResume();

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*intent.setClass(MH3Activity.this,MH2Activity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);*/


            }
        });
    }
    public void processUserActivities (Spinner snluachon1, Spinner snluachon2, Spinner snluachon3)
    {
        Question.questions.get(2).getQuestionAnswers().clear();
        Question.questions.get(2).getQuestionAnswers().add(snluachon1.getSelectedItemPosition());
        Question.questions.get(2).getQuestionAnswers().add(snluachon2.getSelectedItemPosition());
        Question.questions.get(2).getQuestionAnswers().add(snluachon3.getSelectedItemPosition());

    }

}
