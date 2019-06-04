package com.oujiajie.oa.entity;

/**
 * Created By Jou
 * Date 2019/5/20 0020 Time 14:36
 */
public class Question {

    private int queId;
    private int queType;
    private int queDif;
    private int queChap;
    private int pointId;
    private String queItem;
    private String queAns;
    private String queA;
    private String queB;
    private String queC;
    private String queD;
    private Dif dif;
    private Chapter chapter;
    private Point point;
    private Type type;
    public int getQueId() {
        return queId;
    }

    public void setQueId(int queId) {
        this.queId = queId;
    }

    public int getQueType() {
        return queType;
    }

    public void setQueType(int queType) {
        this.queType = queType;
    }

    public int getQueDif() {
        return queDif;
    }

    public void setQueDif(int queDif) {
        this.queDif = queDif;
    }

    public int getQueChap() {
        return queChap;
    }

    public void setQueChap(int queChap) {
        this.queChap = queChap;
    }

    public int getPointId() {
        return pointId;
    }

    public void setPointId(int pointId) {
        this.pointId = pointId;
    }

    public String getQueItem() {
        return queItem;
    }

    public void setQueItem(String queItem) {
        this.queItem = queItem;
    }

    public String getQueAns() {
        return queAns;
    }

    public void setQueAns(String queAns) {
        this.queAns = queAns;
    }

    public String getQueA() {
        return queA;
    }

    public void setQueA(String queA) {
        this.queA = queA;
    }

    public String getQueB() {
        return queB;
    }

    public void setQueB(String queB) {
        this.queB = queB;
    }

    public String getQueC() {
        return queC;
    }

    public void setQueC(String queC) {
        this.queC = queC;
    }

    public String getQueD() {
        return queD;
    }

    public void setQueD(String queD) {
        this.queD = queD;
    }

    public Dif getDif() {
        return dif;
    }

    public void setDif(Dif dif) {
        this.dif = dif;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }




}
