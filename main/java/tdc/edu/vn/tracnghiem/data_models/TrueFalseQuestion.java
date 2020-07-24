package tdc.edu.vn.tracnghiem.data_models;

import java.util.ArrayList;

import tdc.edu.vn.tracnghiem.data_models.AbtractQuestion;

public class TrueFalseQuestion extends AbtractQuestion {
    private ArrayList<String>TFQuestionchoise;
    public TrueFalseQuestion()
    {
        this.TFQuestionchoise = new ArrayList<String>();
        this.questionCorrect = new ArrayList<Integer>();
        this.questionAnswers = new ArrayList<Integer>();

    }
    @Override
    public int getPoint() {
        int point = 0 ;
        if(this.questionCorrect.size() == this.questionAnswers.size())
        {
            int i = 0;
            for(  i = 0;i<this.questionCorrect.size();i++)
            {
                if(this.questionCorrect.get(i) != this.questionAnswers.get(i))
                {
                    break;
                }
            }
            if(i == this.questionCorrect.size())
            {
                point = 1;
            }
        }
        return point;

    }

    public ArrayList<String> getTFQuestionchoise() {
        return TFQuestionchoise;
    }

    public void setTFQuestionchoise(String... TFQuestionchoise) {
       for(String item:TFQuestionchoise)
       {
           this.TFQuestionchoise.add(item);
       }
    }
    @Override
    public String toString() {
        int i = Question.questions.indexOf(this) + 1;
        return "Cau" + i +":"+ getPoint();
    }
}
