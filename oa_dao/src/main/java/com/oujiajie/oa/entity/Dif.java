package com.oujiajie.oa.entity;

/**
 * Created By Jou
 * Date 2019/5/20 0020 Time 14:13
 */
public class Dif {
    private int difId;
    private String difName;

    public Dif() {
    }

    public int getDifId() {
        return difId;
    }

    public void setDifId(int difId) {
        this.difId = difId;
    }

    public String getDifName() {
        return difName;
    }

    public void setDifName(String difName) {
        this.difName = difName;
    }

    public Dif(int difId, String difName) {
        this.difId = difId;
        this.difName = difName;
    }
}
