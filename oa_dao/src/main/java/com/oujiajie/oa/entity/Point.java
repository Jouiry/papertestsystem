package com.oujiajie.oa.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created By Jou
 * Date 2019/5/20 0020 Time 14:30
 */
public class Point {

    private int pointId;
    private String pointName;
    private int chapterId;
    @JsonIgnore
    private Chapter chapter;

    public int getPointId() {
        return pointId;
    }

    public void setPointId(int pointId) {
        this.pointId = pointId;
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public int getChapterId() {
        return chapterId;
    }

    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }
}
