package tdc.edu.vn.tracnghiem;

import android.app.FragmentTransaction;
import android.content.Intent;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.appcompat.app.AppCompatActivity;

import tdc.edu.vn.tracnghiem.data_models.Question;
import tdc.edu.vn.tracnghiem.data_models.TrueFalseQuestion;
import tdc.edu.vn.tracnghiem.fragments.AbstractsFragment;

public class MH5Activity extends AppCompatActivity {
    Button btnEnd;
    Button btnPrevious;
    Button btnNext;
    Intent intent;
    TextView txtcauhoi;
    EditText edtluachon1;
    EditText edtluachon2;
    EditText edtluachon3;
    Switch swluachon1;
    Switch swluachon2;
    Switch swluachon3;
    int questionID = 0;
    AbstractsFragment fragment;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mh5_layout);
        btnPrevious = findViewById(R.id.btnPrevious);
        btnNext = findViewById(R.id.btnNext);
        btnEnd = findViewById(R.id.btnEnd);
       /* edtluachon1 = findViewById(R.id.edtluachon1);
        edtluachon2 = findViewById(R.id.edtluachon2);
        edtluachon3 = findViewById(R.id.edtluachon3);
        swluachon1 = findViewById(R.id.swluachon1);
        swluachon2 = findViewById(R.id.swluachon2);
        swluachon3 = findViewById(R.id.swluachon3);
        txtcauhoi = findViewById(R.id.txtcauhoi);*/
        intent = MH1Activity.intent;

        //processing
        /*TrueFalseQuestion qs5 =(TrueFalseQuestion) Question.questions.get(4);
        txtcauhoi.setText(qs5.getQuestionDrscription());
        edtluachon1.setText(qs5.getTFQuestionchoise().get(0));
        edtluachon2.setText(qs5.getTFQuestionchoise().get(1));
        edtluachon3.setText(qs5.getTFQuestionchoise().get(2));*/

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*intent.setClass(MH5Activity.this,MH4Activity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);*/

            }
        });

        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setClass(MH5Activity.this,MH6Activity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                // start intent
                startActivity(intent);
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               intent.setClass(MH5Activity.this,MH1Activity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);

            }
        });
    }
    public void processUserActivities (Switch swluachon1, Switch swluachon2, Switch swluachon3)
    {
        Question.questions.get(4).getQuestionAnswers().clear();
        if(swluachon1.isChecked())
        {
            Question.questions.get(4).getQuestionAnswers().add(1);
        }
        else{
            Question.questions.get(4).getQuestionAnswers().add(0);
        }
        if(swluachon2.isChecked())
        {
            Question.questions.get(4).getQuestionAnswers().add(1);
        }
        else{
            Question.questions.get(4).getQuestionAnswers().add(0);
        }
        if(swluachon3.isChecked())
        {
            Question.questions.get(4).getQuestionAnswers().add(1);
        }
        else{
            Question.questions.get(4).getQuestionAnswers().add(0);
        }
    }
}
