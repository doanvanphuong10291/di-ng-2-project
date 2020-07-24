package tdc.edu.vn.tracnghiem;

import android.app.FragmentTransaction;
import android.content.Intent;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import tdc.edu.vn.tracnghiem.data_models.MultiQuestionMultiChoices;
import tdc.edu.vn.tracnghiem.data_models.MultiQuestionOneChoice;
import tdc.edu.vn.tracnghiem.data_models.Question;
import tdc.edu.vn.tracnghiem.fragments.AbstractsFragment;
import tdc.edu.vn.tracnghiem.fragments.MultiQuestionMultiChoicesFragment;
import tdc.edu.vn.tracnghiem.fragments.MultiQuestionOneChoicesFragment;
import tdc.edu.vn.tracnghiem.view_models.MyRadioButtonGroup;

public class MH2Activity extends AppCompatActivity {
    int questionID = 0;
    AbstractsFragment fragment;
    FragmentTransaction fragmentTransaction;


   Button btnEnd;
    Button btnPrevious;
    Button btnNext;
    Intent intent;
    RadioButton rbluachon1;
    RadioButton rbluachon2;
    RadioButton rbluachon3;
    RadioButton rbluachon4;
    TextView txtcauhoi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mh2_layout);

        // get view from layout
        btnPrevious = findViewById(R.id.btnPrevious);
        btnNext = findViewById(R.id.btnNext);
        btnEnd = findViewById(R.id.btnEnd);
        intent = MH1Activity.intent;
        /*rbluachon1 = findViewById(R.id.rbluachon1);
        rbluachon2 = findViewById(R.id.rbluachon2);
        rbluachon3 = findViewById(R.id.rbluachon3);
        rbluachon4 = findViewById(R.id.rbluachon4);
        txtcauhoi = findViewById(R.id.txtcauhoi);*/

        /*MyRadioButtonGroup myRadioButtonGroup = new MyRadioButtonGroup(rbluachon1,rbluachon2,rbluachon3,rbluachon4);
        MultiQuestionOneChoice qs2 = (MultiQuestionOneChoice) Question.questions.get(1);
        txtcauhoi.setText(qs2.getQuestionDrscription());
        rbluachon1.setText(qs2.getQuestionChoice().get(0));
        rbluachon2.setText(qs2.getQuestionChoice().get(1));
        rbluachon3.setText(qs2.getQuestionChoice().get(2));
        rbluachon4.setText(qs2.getQuestionChoice().get(3));*/

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*intent.setClass(MH2Activity.this,MH3Activity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                processUserActivities(rbluachon1,rbluachon2,rbluachon3,rbluachon4);
                startActivity(intent);*/


            }
        });
        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*intent.setClass(MH2Activity.this,MH6Activity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                processUserActivities(rbluachon1,rbluachon2,rbluachon3,rbluachon4);
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
                /*intent.setClass(MH2Activity.this,MH1Activity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                processUserActivities(rbluachon1,rbluachon2,rbluachon3,rbluachon4);
                startActivity(intent);*/


            }
        });
    }
    public void processUserActivities (RadioButton rbluachon1, RadioButton rbluachon2, RadioButton rbluachon3, RadioButton rbluachon4)
    {
        Question.questions.get(1).getQuestionAnswers().clear();
        if(rbluachon1.isChecked())
        {
            Question.questions.get(1).getQuestionAnswers().add(0);
        }
        if(rbluachon2.isChecked())
        {
            Question.questions.get(1).getQuestionAnswers().add(1);
        }
        if(rbluachon3.isChecked())
        {
            Question.questions.get(1).getQuestionAnswers().add(2);
        }
        if(rbluachon4.isChecked())
        {
            Question.questions.get(1).getQuestionAnswers().add(3);
        }
    }

}
