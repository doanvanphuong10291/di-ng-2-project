package tdc.edu.vn.tracnghiem.data_models;

import java.util.ArrayList;

import tdc.edu.vn.tracnghiem.data_models.AbtractQuestion;

public class MultiQuestionOneChoice extends AbtractQuestion {
    private ArrayList<String> questionChoice;
    @Override
    public int getPoint() {
        int point = 0;
        if (this.questionCorrect.size() == this.questionAnswers.size()) {

                if (questionAnswers.get(0) == questionCorrect.get(0))
                {
                    point = 1;
                }
            }

        return point;
    }

    public MultiQuestionOneChoice() {
       this.questionChoice = new ArrayList<String>();
        this.questionAnswers = new ArrayList<Integer>();
        this.questionCorrect = new ArrayList<Integer>();
    }


    public ArrayList<String> getQuestionChoice() {
        return questionChoice;
    }

    public void setQuestionChoice(String... questionChoice) {
        for (String item:questionChoice)
        {
            this.questionChoice.add(item);
        }
    }
    @Override
    public String toString() {
        int i = Question.questions.indexOf(this) + 1;
        return "Cau" + i +":"+ getPoint();
    }

}
