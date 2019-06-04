package com.oujiajie.oa.entity;

/**
 * Created By Jou
 * Date 2019/5/22 0022 Time 16:37
 */
public class PaperQue {
    private int paperId;
    private int queId;
    private Question question;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public int getPaperId() {
        return paperId;
    }

    public void setPaperId(int paperId) {
        this.paperId = paperId;
    }

    public int getQueId() {
        return queId;
    }

    public void setQueId(int queId) {
        this.queId = queId;
    }
}
