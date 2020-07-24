package tdc.edu.vn.tracnghiem.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import tdc.edu.vn.tracnghiem.R;
import tdc.edu.vn.tracnghiem.data_models.AbtractQuestion;
import tdc.edu.vn.tracnghiem.data_models.Question;
import tdc.edu.vn.tracnghiem.data_models.TrueFalseQuestion;


public class TrueFalseQuestionBFragment extends AbstractsFragment {


    EditText edtluachon1;
    EditText edtluachon2;
    EditText edtluachon3;
    Switch swluachon1;
    Switch swluachon2;
    Switch swluachon3;
    TextView txtcauhoi;
    TrueFalseQuestion question;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentMultil = null;
        fragmentMultil = inflater.inflate(R.layout.true_false_questionb_fragment,container,false);
        txtcauhoi = fragmentMultil.findViewById(R.id.txtcauhoi);
        edtluachon1 = fragmentMultil.findViewById(R.id.edtluachon1);
        edtluachon2 = fragmentMultil.findViewById(R.id.edtluachon2);
        edtluachon3 = fragmentMultil.findViewById(R.id.edtluachon3);
        swluachon1= fragmentMultil.findViewById(R.id.swluachon1);
        swluachon2= fragmentMultil.findViewById(R.id.swluachon2);
        swluachon3= fragmentMultil.findViewById(R.id.swluachon3);
        txtcauhoi = fragmentMultil.findViewById(R.id.txtcauhoi);


        txtcauhoi.setText(question.getQuestionDrscription());
        edtluachon1.setText(question.getTFQuestionchoise().get(0));
        edtluachon2.setText(question.getTFQuestionchoise().get(1));
        edtluachon3.setText(question.getTFQuestionchoise().get(2));



        return fragmentMultil;
    }

    public void setQuestion(AbtractQuestion question)
    {
        this.question = (TrueFalseQuestion) question;
    }

    @Override
    public void updatePoint(int questionID) {
        Question.questions.get(questionID).getQuestionAnswers().clear();
        if(swluachon1.isChecked())
        {
            Question.questions.get(questionID).getQuestionAnswers().add(1);
        }
        else{
            Question.questions.get(questionID).getQuestionAnswers().add(0);
        }
        if(swluachon2.isChecked())
        {
            Question.questions.get(questionID).getQuestionAnswers().add(1);
        }
        else{
            Question.questions.get(questionID).getQuestionAnswers().add(0);
        }
        if(swluachon3.isChecked())
        {
            Question.questions.get(questionID).getQuestionAnswers().add(1);
        }
        else{
            Question.questions.get(questionID).getQuestionAnswers().add(0);
        }
    }
}
