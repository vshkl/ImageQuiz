package by.vshkl.android.imagequiz.mvp.model;

import java.util.Arrays;

import by.vshkl.android.imagequiz.utils.FIleNameUtils;

public class QuizItem {

    private int id;
    private String[] picNames;
    private int correct;
    private String correctDescription;

    public QuizItem() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        this.picNames = FIleNameUtils.getFileNames(id);
    }

    public String[] getPicNames() {
        return picNames;
    }

    public void setPicNames(String[] picNames) {
        this.picNames = picNames;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public String getCorrectDescription() {
        return correctDescription;
    }

    public void setCorrectDescription(String correctDescription) {
        this.correctDescription = correctDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QuizItem)) {
            return false;
        }

        QuizItem quizItem = (QuizItem) o;

        return getId() == quizItem.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QuizItem{");
        sb.append("id=").append(id);
        sb.append(", picNames=").append(Arrays.deepToString(picNames));
        sb.append(", correct=").append(correct);
        sb.append(", correctDescription='").append(correctDescription).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
