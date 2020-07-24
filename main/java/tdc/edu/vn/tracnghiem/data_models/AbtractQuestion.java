package tdc.edu.vn.tracnghiem.data_models;

import java.util.ArrayList;

public abstract class AbtractQuestion {
   protected String questionDrscription;
    protected ArrayList<Integer> questionCorrect;
    protected ArrayList<Integer> questionAnswers;
    public abstract int getPoint();

    public void setQuestionDrscription(String questionDrscription) {
        this.questionDrscription = questionDrscription;
    }

    public void setQuestionCorrect(Integer... questionCorrect) {
        for (Integer items: questionCorrect)
        {
            this.questionCorrect.add(items);
        }

    }

    public void setQuestionAnswers(Integer... questionAnswers) {
        for (Integer items: questionAnswers)
        {
            this.questionAnswers.add(items);
        }
    }

    public String getQuestionDrscription() {
        return questionDrscription;
    }

    public ArrayList<Integer> getQuestionCorrect() {
        return questionCorrect;
    }

    public ArrayList<Integer> getQuestionAnswers() {
        return questionAnswers;
    }
}
