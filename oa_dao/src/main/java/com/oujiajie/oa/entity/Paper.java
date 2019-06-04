package com.oujiajie.oa.entity;

import java.util.Date;
import java.util.List;

/**
 * Created By Jou
 * Date 2019/5/20 0020 Time 14:39
 */
public class Paper {
    private int paperId;
    private String paperName;
    private int paperTeacher;
    private Date paperDate;
    private Teacher teacher;
    private List<PaperQue> paperQues;

    public List<PaperQue> getPaperQues() {
        return paperQues;
    }

    public void setPaperQues(List<PaperQue> paperQues) {
        this.paperQues = paperQues;
    }

    public int getPaperId() {
        return paperId;
    }

    public void setPaperId(int paperId) {
        this.paperId = paperId;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public int getPaperTeacher() {
        return paperTeacher;
    }

    public void setPaperTeacher(int paperTeacher) {
        this.paperTeacher = paperTeacher;
    }

    public Date getPaperDate() {
        return paperDate;
    }

    public void setPaperDate(Date paperDate) {
        this.paperDate = paperDate;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
