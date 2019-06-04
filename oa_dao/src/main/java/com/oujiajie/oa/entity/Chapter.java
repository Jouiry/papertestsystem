package com.oujiajie.oa.entity;

import java.util.List;

/**
 * Created By Jou
 * Date 2019/5/20 0020 Time 14:10
 */
public class Chapter {
    private int chapterId;
    private String chapterName;
    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public int getChapterId() {
        return chapterId;
    }

    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public Chapter() {
    }

    public Chapter(int chapterId, String chapterName) {
        this.chapterId = chapterId;
        this.chapterName = chapterName;
    }
}
