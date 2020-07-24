package tdc.edu.vn.tracnghiem.data_models;

import java.util.ArrayList;

import tdc.edu.vn.tracnghiem.data_models.AbtractQuestion;

public class MultiQuestionMultiChoices extends AbtractQuestion {
    protected ArrayList<String > questionChoices;

    public MultiQuestionMultiChoices() {
        this.questionChoices = new ArrayList<String>();
        this.questionCorrect= new ArrayList<Integer>();
        this.questionAnswers= new ArrayList<Integer>();
    }

    @Override
    public int getPoint() {
        int point = 0 ;
        if (this.questionCorrect.size() == this.questionAnswers.size())
        {
            int i = 0;
            for ( i = 0;i < this.questionCorrect.size();i++)
            {
                if (questionAnswers.get(i) != questionCorrect.get(i))
                {
                    break;
                }
            }
            if( i == questionCorrect.size())
            {
                point = 1;
            }
        }
        return  point;
    }



    public ArrayList<String> getQuestionChoices() {
        return questionChoices;
    }

    public void setQuestionChoices(String... questionChoices) {
       for(String item:questionChoices)
       {
           this.questionChoices.add(item);
       }
    }


    @Override
    public String toString() {
        int i = Question.questions.indexOf(this) + 1;
        return "Cau" + i +":"+ getPoint();
    }
}
