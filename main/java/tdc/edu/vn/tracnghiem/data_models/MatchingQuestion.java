package tdc.edu.vn.tracnghiem.data_models;

import java.util.ArrayList;

import tdc.edu.vn.tracnghiem.data_models.AbtractQuestion;

public class MatchingQuestion extends AbtractQuestion {
    @Override
    public int getPoint() {
        int  point = 0;
        if(this.questionCorrect.size() == this.questionAnswers.size())
        {
            int i = 0;
            for( i = 0;i<this.questionCorrect.size();i++ )
            {
                if (this.questionCorrect.get(i)!= this.questionAnswers.get(i)) {
                    break;
                }
            }
            if(i == questionCorrect.size())
            {
                point = 1;
            }
        }
        return point;
    }

    protected ArrayList<String> questionchoiseA;
    protected ArrayList<String> questionchoiseB;

    public MatchingQuestion(){
        this.questionchoiseA = new ArrayList<String>();
        this.questionchoiseB = new ArrayList<String>();
        this.questionAnswers = new ArrayList<Integer>();
        this.questionCorrect = new ArrayList<Integer>();
    }

    public void setQuestionchoiseA(String... questionchoiseA) {
        for(String item: questionchoiseA)
        {
            this.questionchoiseA.add(item);
        }
    }

    public void setQuestionchoiseB(String... questionchoiseB) {
        for(String item:questionchoiseB)
        {
            this.questionchoiseB.add(item);
        }
    }

    public ArrayList<String> getQuestionchoiseA() {
        return questionchoiseA;
    }

    public ArrayList<String> getQuestionchoiseB() {
        return questionchoiseB;
    }
    @Override
    public String toString() {
        int i = Question.questions.indexOf(this) + 1;
        return "Cau" + i +":"+ getPoint();
    }
}
