package com.oujiajie.oa.entity;

/**
 * Created By Jou
 * Date 2019/5/19 0019 Time 14:08
 */
public class Teacher {
    private int teaId;
    private String teaName;
    private String teaPwd;

    public int getTeaId() {
        return teaId;
    }

    public void setTeaId(int teaId) {
        this.teaId = teaId;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public String getTeaPwd() {
        return teaPwd;
    }

    public void setTeaPwd(String teaPwd) {
        this.teaPwd = teaPwd;
    }

    public Teacher() {
    }

    public Teacher(int teaId, String teaName, String teaPwd) {
        this.teaId = teaId;
        this.teaName = teaName;
        this.teaPwd = teaPwd;
    }
}
