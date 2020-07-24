package tdc.edu.vn.tracnghiem;

import android.app.FragmentTransaction;
import android.content.Intent;

import android.os.Bundle;


import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;


import androidx.annotation.ArrayRes;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import java.util.ArrayList;

import tdc.edu.vn.tracnghiem.data_models.MatchingQuestion;
import tdc.edu.vn.tracnghiem.data_models.MultiQuestionMultiChoices;
import tdc.edu.vn.tracnghiem.data_models.MultiQuestionOneChoice;
import tdc.edu.vn.tracnghiem.data_models.Question;
import tdc.edu.vn.tracnghiem.data_models.TrueFalseQuestion;
import tdc.edu.vn.tracnghiem.fragments.AbstractsFragment;
import tdc.edu.vn.tracnghiem.fragments.MatchingQuestionFragment;
import tdc.edu.vn.tracnghiem.fragments.MultiQuestionMultiChoicesFragment;
import tdc.edu.vn.tracnghiem.fragments.MultiQuestionOneChoicesFragment;
import tdc.edu.vn.tracnghiem.fragments.TrueFalseQuestionBFragment;
import tdc.edu.vn.tracnghiem.fragments.TrueFalseQuestionFragment;

public class MH1Activity extends AppCompatActivity {
    int questionID = 0;
    AbstractsFragment fragment;
    FragmentTransaction fragmentTransaction;


    Button btnEnd;
    Button btnPrevious;
    Button btnNext;
    static Intent intent;
    CheckBox cbluachon1;
    CheckBox cbluachon2;
    CheckBox cbluachon3;
    CheckBox cbluachon4;
    TextView txtcauhoi;
    ActionBarDrawerToggle drawerToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
       // dán layout
        FrameLayout mainlayout = findViewById(R.id.drawcontainer);
        getLayoutInflater().inflate(R.layout.mh1_layout,mainlayout);


        // get view from layout
        btnPrevious = findViewById(R.id.btnPrevious);
        btnNext = findViewById(R.id.btnNext);
        btnEnd = findViewById(R.id.btnEnd);
        intent = getIntent();
            /*cbluachon1 = findViewById(R.id.cbluachon1);
            cbluachon2 = findViewById(R.id.cbluachon2);
            cbluachon3 = findViewById(R.id.cbluachon3);
            cbluachon4 = findViewById(R.id.cbluachon4);
            txtcauhoi = findViewById(R.id.txtcauhoi);*/

        if(Question.questions.size() == 0)
        {
            Question.intiallation();
        }
            // đổ dữ liêu vào listview ( this , layout , data source )
        ListView questionList = findViewById(R.id.drawer);
        ArrayList<String> questionname = new ArrayList<String>();
       for(int i = 0 ; i < Question.questions.size(); i++)
       {
           questionname.add("Cau so" + (i+1) );
       }
       // adapter cần ( this, layout, data source)
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,questionname);
        questionList.setAdapter(adapter);

        final DrawerLayout drawerLayout = findViewById(R.id.drawlayout);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        drawerToggle = new ActionBarDrawerToggle(MH1Activity.this,drawerLayout,R.string.open,R.string.close) {
            public void onDrawerOpen(View drawerOpen) {
                super.onDrawerOpened(drawerOpen);
            }

            public void onDrawerClose(View drawerClose) {
                super.onDrawerClosed(drawerClose);
            }
        };
        drawerLayout.setDrawerListener(drawerToggle);
        drawerToggle.syncState();



        updateUI();

        /*MultiQuestionMultiChoices qs1 = (MultiQuestionMultiChoices) Question.questions.get(0);
        txtcauhoi.setText(qs1.getQuestionDrscription());
        cbluachon1.setText(qs1.getQuestionChoices().get(0));
        cbluachon2.setText(qs1.getQuestionChoices().get(1));
        cbluachon3.setText(qs1.getQuestionChoices().get(2));
        cbluachon4.setText(qs1.getQuestionChoices().get(3));*/


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*intent.setClass(MH1Activity.this, MH2Activity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                processUserActivities(cbluachon1,cbluachon2,cbluachon3,cbluachon4);
                // start intent
                startActivity(intent);*/
                fragment.updatePoint(questionID);
                if(questionID == Question.questions.size()-1)
                {
                    questionID = 0;
                }
                else{
                    questionID++;
                }
                updateUI();
            }
        });
        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setClass(MH1Activity.this, MH6Activity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                //processUserActivities(cbluachon1,cbluachon2,cbluachon3,cbluachon4);
                // start intent
                fragment.updatePoint(questionID);
                startActivity(intent);


                if(Question.questions.get(questionID) instanceof MultiQuestionMultiChoices)
                {
                    if (getFragmentManager().findFragmentByTag(questionID+" ") == null)
                        fragment = new MultiQuestionMultiChoicesFragment();
                    else
                        fragment =(MultiQuestionMultiChoicesFragment) getFragmentManager().findFragmentByTag(questionID+" ");

                }

            }
        });
        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*intent.setClass(MH1Activity.this, MH5Activity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                processUserActivities(cbluachon1,cbluachon2,cbluachon3,cbluachon4);
                // start intent
                startActivity(intent);*/
                fragment.updatePoint(questionID);
                if(questionID == 0)
                {
                    questionID = Question.questions.size()-1;
                }
                else
                {
                    questionID--;
                }
                updateUI();
            }
        });

    }

    public void processUserActivities (CheckBox cbluachon1,CheckBox cbluachon2,CheckBox cbluachon3,CheckBox cbluachon4)
    {
        Question.questions.get(0).getQuestionAnswers().clear();
        if(cbluachon1.isChecked())
        {
            Question.questions.get(0).getQuestionAnswers().add(0);
        }
        if(cbluachon2.isChecked())
        {
            Question.questions.get(0).getQuestionAnswers().add(1);
        }
        if(cbluachon3.isChecked())
        {
            Question.questions.get(0).getQuestionAnswers().add(2);
        }
        if(cbluachon4.isChecked())
        {
            Question.questions.get(0).getQuestionAnswers().add(3);
        }
    }






    void updateUI(){
        setTitle("Cau so: "+ (questionID + 1));

        if(Question.questions.get(questionID) instanceof MultiQuestionMultiChoices)
        {
            if (getFragmentManager().findFragmentByTag(questionID+" ") == null)
                fragment = new MultiQuestionMultiChoicesFragment();
            else
                fragment =(MultiQuestionMultiChoicesFragment) getFragmentManager().findFragmentByTag(questionID+" ");

        }
        else if (Question.questions.get(questionID) instanceof MultiQuestionOneChoice)
        {
            if (getFragmentManager().findFragmentByTag(questionID+" ") == null)
                fragment= new MultiQuestionOneChoicesFragment();
            else
                fragment =(MultiQuestionOneChoicesFragment) getFragmentManager().findFragmentByTag(questionID+" ");

        }
        else if(Question.questions.get(questionID) instanceof MatchingQuestion)
        {
            if (getFragmentManager().findFragmentByTag(questionID+" ") == null)
                fragment = new MatchingQuestionFragment();

            else

                fragment =(MatchingQuestionFragment) getFragmentManager().findFragmentByTag(questionID+" ");

        }
        else if(Question.questions.get(questionID) instanceof TrueFalseQuestion){
            if(questionID % 2 == 0)
            {
                if (getFragmentManager().findFragmentByTag(questionID+" ") == null)
                    fragment = new TrueFalseQuestionFragment();
                else

                    fragment =(TrueFalseQuestionFragment) getFragmentManager().findFragmentByTag(questionID+" ");

            }
            else{
                if (getFragmentManager().findFragmentByTag(questionID+" ") == null)
                    fragment = new TrueFalseQuestionBFragment();
                else
                    fragment = (TrueFalseQuestionBFragment) getFragmentManager().findFragmentByTag(questionID+" ");


            }

        }

        fragment.setQuestion(Question.questions.get(questionID));
        fragmentTransaction = getFragmentManager().beginTransaction();

        fragmentTransaction.replace(R.id.FramentsContainer,fragment,questionID+" ");


        // input to stack and check seen null or not null
        if (getFragmentManager().findFragmentByTag(questionID+" ") == null) {
            fragmentTransaction.addToBackStack(null);
        }
        fragmentTransaction.commit();
    }


}
