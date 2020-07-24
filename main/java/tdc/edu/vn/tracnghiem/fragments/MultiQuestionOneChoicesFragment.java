package tdc.edu.vn.tracnghiem.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import tdc.edu.vn.tracnghiem.R;
import tdc.edu.vn.tracnghiem.data_models.AbtractQuestion;
import tdc.edu.vn.tracnghiem.data_models.MultiQuestionMultiChoices;
import tdc.edu.vn.tracnghiem.data_models.MultiQuestionOneChoice;
import tdc.edu.vn.tracnghiem.data_models.Question;
import tdc.edu.vn.tracnghiem.view_models.MyRadioButtonGroup;


public class MultiQuestionOneChoicesFragment extends AbstractsFragment {


    RadioButton rbluachon1;
    RadioButton rbluachon2;
    RadioButton rbluachon3;
    RadioButton rbluachon4;
    TextView txtcauhoi;
    MultiQuestionOneChoice question;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentMultil = null;
        fragmentMultil = inflater.inflate(R.layout.multi_question_one_choices_fragment,container,false);
        rbluachon1 = fragmentMultil.findViewById(R.id.rbluachon1);
        rbluachon2 = fragmentMultil.findViewById(R.id.rbluachon2);
        rbluachon3 = fragmentMultil.findViewById(R.id.rbluachon3);
        rbluachon4 = fragmentMultil.findViewById(R.id.rbluachon4);
        txtcauhoi = fragmentMultil.findViewById(R.id.txtcauhoi);

        MyRadioButtonGroup myRadioButtonGroup = new MyRadioButtonGroup(rbluachon1,rbluachon2,rbluachon3,rbluachon4);
       // MultiQuestionOneChoice qs2 = (MultiQuestionOneChoice) Question.questions.get(1);
        txtcauhoi.setText(question.getQuestionDrscription());
        rbluachon1.setText(question.getQuestionChoice().get(0));
        rbluachon2.setText(question.getQuestionChoice().get(1));
        rbluachon3.setText(question.getQuestionChoice().get(2));
        rbluachon4.setText(question.getQuestionChoice().get(3));

        return fragmentMultil;
    }

    public void setQuestion(AbtractQuestion question)
    {
        this.question = (MultiQuestionOneChoice) question;
    }

    @Override
    public void updatePoint(int questionID) {
        Question.questions.get(questionID).getQuestionAnswers().clear();
        if(rbluachon1.isChecked())
        {
            Question.questions.get(questionID).getQuestionAnswers().add(0);
        }
        if(rbluachon2.isChecked())
        {
            Question.questions.get(questionID).getQuestionAnswers().add(1);
        }
        if(rbluachon3.isChecked())
        {
            Question.questions.get(questionID).getQuestionAnswers().add(2);
        }
        if(rbluachon4.isChecked())
        {
            Question.questions.get(questionID).getQuestionAnswers().add(3);
        }
    }
}
