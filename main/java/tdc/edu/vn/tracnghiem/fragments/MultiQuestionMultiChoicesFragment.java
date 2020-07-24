package tdc.edu.vn.tracnghiem.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import tdc.edu.vn.tracnghiem.R;
import tdc.edu.vn.tracnghiem.data_models.AbtractQuestion;
import tdc.edu.vn.tracnghiem.data_models.MultiQuestionMultiChoices;
import tdc.edu.vn.tracnghiem.data_models.Question;


public class MultiQuestionMultiChoicesFragment extends AbstractsFragment {


    CheckBox cbluachon1;
    CheckBox cbluachon2;
    CheckBox cbluachon3;
    CheckBox cbluachon4;
    TextView txtcauhoi;
    MultiQuestionMultiChoices question;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentMultil = null;
        fragmentMultil = inflater.inflate(R.layout.multi_question_multi_choices_fragment,container,false);
        cbluachon1 = fragmentMultil.findViewById(R.id.cbluachon1);
        cbluachon2 = fragmentMultil.findViewById(R.id.cbluachon2);
        cbluachon3 = fragmentMultil.findViewById(R.id.cbluachon3);
        cbluachon4 = fragmentMultil.findViewById(R.id.cbluachon4);
        txtcauhoi = fragmentMultil.findViewById(R.id.txtcauhoi);


        txtcauhoi.setText(question.getQuestionDrscription());
        cbluachon1.setText(question.getQuestionChoices().get(0));
        cbluachon2.setText(question.getQuestionChoices().get(1));
        cbluachon3.setText(question.getQuestionChoices().get(2));
        cbluachon4.setText(question.getQuestionChoices().get(3));

        return fragmentMultil;
    }

    public void setQuestion(AbtractQuestion question)
    {
        this.question = (MultiQuestionMultiChoices) question;
    }

    @Override
    public void updatePoint(int questionID) {
        Question.questions.get(questionID).getQuestionAnswers().clear();
        if(cbluachon1.isChecked())
        {
            Question.questions.get(questionID).getQuestionAnswers().add(0);
        }
        if(cbluachon2.isChecked())
        {
            Question.questions.get(questionID).getQuestionAnswers().add(1);
        }
        if(cbluachon3.isChecked())
        {
            Question.questions.get(questionID).getQuestionAnswers().add(2);
        }
        if(cbluachon4.isChecked())
        {
            Question.questions.get(questionID).getQuestionAnswers().add(3);
        }
    }
}
