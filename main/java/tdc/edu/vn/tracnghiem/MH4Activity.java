package tdc.edu.vn.tracnghiem;

import android.app.FragmentTransaction;
import android.content.Intent;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;


import androidx.appcompat.app.AppCompatActivity;

import tdc.edu.vn.tracnghiem.data_models.MatchingQuestion;
import tdc.edu.vn.tracnghiem.data_models.Question;
import tdc.edu.vn.tracnghiem.data_models.TrueFalseQuestion;
import tdc.edu.vn.tracnghiem.fragments.AbstractsFragment;

public class MH4Activity extends AppCompatActivity {
    Button btnEnd;
    Button btnPrevious;
    Button btnNext;
    Intent intent;
    TextView txtcauhoi;
    int questionID = 0;
    AbstractsFragment fragment;
    FragmentTransaction fragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mh4_layout);
        btnPrevious = findViewById(R.id.btnPrevious);
        btnNext = findViewById(R.id.btnNext);
        btnEnd = findViewById(R.id.btnEnd);
        txtcauhoi = findViewById(R.id.txtcauhoi);
       /* edtluachon1 = findViewById(R.id.edtluachon1);
        edtluachon2 = findViewById(R.id.edtluachon2);
        edtluachon3 = findViewById(R.id.edtluachon3);
        tlgluachon1 = findViewById(R.id.tlgluachon1);
        tlgluachon2 = findViewById(R.id.tlgluachon2);
        tlgluachon3 = findViewById(R.id.tlgluachon3);*/
        intent = MH1Activity.intent;

        //processing
        /*TrueFalseQuestion qs4 = (TrueFalseQuestion)Question.questions.get(3);
        txtcauhoi.setText(qs4.getQuestionDrscription());
        edtluachon1.setText(qs4.getTFQuestionchoise().get(0));
        edtluachon2.setText(qs4.getTFQuestionchoise().get(1));
        edtluachon3.setText(qs4.getTFQuestionchoise().get(2));*/

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*intent.setClass(MH4Activity.this,MH5Activity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                processUserActivities(tlgluachon1,tlgluachon2,tlgluachon3);
                startActivity(intent);*/

            }
        });
        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*intent.setClass(MH4Activity.this,MH6Activity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                processUserActivities(tlgluachon1,tlgluachon2,tlgluachon3);
                // start intent
                startActivity(intent);*/
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* intent.setClass(MH4Activity.this,MH3Activity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                processUserActivities(tlgluachon1,tlgluachon2,tlgluachon3);
                startActivity(intent);*/

            }
        });
    }
    public void processUserActivities (ToggleButton tlgluachon1, ToggleButton tlgluachon2, ToggleButton tlgluachon3)
    {
        Question.questions.get(3).getQuestionAnswers().clear();
        if(tlgluachon1.isChecked())
        {
            Question.questions.get(3).getQuestionAnswers().add(1);
        }
        else{
            Question.questions.get(3).getQuestionAnswers().add(0);
        }
        if(tlgluachon2.isChecked())
        {
            Question.questions.get(3).getQuestionAnswers().add(1);
        }
        else{
            Question.questions.get(3).getQuestionAnswers().add(0);
        }
        if(tlgluachon3.isChecked())
        {
            Question.questions.get(3).getQuestionAnswers().add(1);
        }
        else{
            Question.questions.get(3).getQuestionAnswers().add(0);
        }
    }
}
