package tdc.edu.vn.tracnghiem.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import tdc.edu.vn.tracnghiem.R;
import tdc.edu.vn.tracnghiem.data_models.AbtractQuestion;
import tdc.edu.vn.tracnghiem.data_models.MatchingQuestion;
import tdc.edu.vn.tracnghiem.data_models.MultiQuestionOneChoice;
import tdc.edu.vn.tracnghiem.data_models.Question;


public class MatchingQuestionFragment extends AbstractsFragment {


    EditText edtluachon1;
    EditText edtluachon2;
    EditText edtluachon3;
    Spinner snluachon1;
    Spinner snluachon2;
    Spinner snluachon3;
    TextView txtcauhoi;

    MatchingQuestion question;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentMultil = null;
        fragmentMultil = inflater.inflate(R.layout.matching_question_fragment,container,false);
        txtcauhoi = fragmentMultil.findViewById(R.id.txtcauhoi);
        edtluachon1 = fragmentMultil.findViewById(R.id.edtluachon1);
        edtluachon2 = fragmentMultil.findViewById(R.id.edtluachon2);
        edtluachon3 = fragmentMultil.findViewById(R.id.edtluachon3);
        snluachon1= fragmentMultil.findViewById(R.id.snluachon1);
        snluachon2= fragmentMultil.findViewById(R.id.snluachon2);
        snluachon3= fragmentMultil.findViewById(R.id.snluachon3);
        txtcauhoi = fragmentMultil.findViewById(R.id.txtcauhoi);


        txtcauhoi.setText(question.getQuestionDrscription());
        edtluachon1.setText(question.getQuestionchoiseA().get(0));
        edtluachon2.setText(question.getQuestionchoiseA().get(1));
        edtluachon3.setText(question.getQuestionchoiseA().get(2));
        ArrayAdapter<String> adaptermatching  = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_spinner_item,question.getQuestionchoiseB());
        snluachon1.setAdapter(adaptermatching);
        snluachon2.setAdapter(adaptermatching);
        snluachon3.setAdapter(adaptermatching);


        return fragmentMultil;
    }

    public void setQuestion(AbtractQuestion question)
    {
        this.question = (MatchingQuestion) question;
    }

    @Override
    public void updatePoint(int questionID) {
        Question.questions.get(questionID).getQuestionAnswers().clear();
        Question.questions.get(questionID).getQuestionAnswers().add(snluachon1.getSelectedItemPosition());
        Question.questions.get(questionID).getQuestionAnswers().add(snluachon2.getSelectedItemPosition());
        Question.questions.get(questionID).getQuestionAnswers().add(snluachon3.getSelectedItemPosition());
    }
}
