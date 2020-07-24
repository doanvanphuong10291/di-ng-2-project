package tdc.edu.vn.tracnghiem.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

import tdc.edu.vn.tracnghiem.R;
import tdc.edu.vn.tracnghiem.data_models.AbtractQuestion;
import tdc.edu.vn.tracnghiem.data_models.MatchingQuestion;
import tdc.edu.vn.tracnghiem.data_models.Question;
import tdc.edu.vn.tracnghiem.data_models.TrueFalseQuestion;


public class TrueFalseQuestionFragment extends AbstractsFragment {


    EditText edtluachon1;
    EditText edtluachon2;
    EditText edtluachon3;
    ToggleButton tlgluachon1;
    ToggleButton tlgluachon2;
    ToggleButton tlgluachon3;
    TextView txtcauhoi;
    TrueFalseQuestion question;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentMultil = null;
        fragmentMultil = inflater.inflate(R.layout.true_false_question_fragment,container,false);
        txtcauhoi = fragmentMultil.findViewById(R.id.txtcauhoi);
        edtluachon1 = fragmentMultil.findViewById(R.id.edtluachon1);
        edtluachon2 = fragmentMultil.findViewById(R.id.edtluachon2);
        edtluachon3 = fragmentMultil.findViewById(R.id.edtluachon3);
        tlgluachon1= fragmentMultil.findViewById(R.id.tlgluachon1);
        tlgluachon2= fragmentMultil.findViewById(R.id.tlgluachon2);
        tlgluachon3= fragmentMultil.findViewById(R.id.tlgluachon3);
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
        if(tlgluachon1.isChecked())
        {
            Question.questions.get(questionID).getQuestionAnswers().add(1);
        }
        else{
            Question.questions.get(questionID).getQuestionAnswers().add(0);
        }
        if(tlgluachon2.isChecked())
        {
            Question.questions.get(questionID).getQuestionAnswers().add(1);
        }
        else{
            Question.questions.get(questionID).getQuestionAnswers().add(0);
        }
        if(tlgluachon3.isChecked())
        {
            Question.questions.get(questionID).getQuestionAnswers().add(1);
        }
        else{
            Question.questions.get(questionID).getQuestionAnswers().add(0);
        }
    }
}
