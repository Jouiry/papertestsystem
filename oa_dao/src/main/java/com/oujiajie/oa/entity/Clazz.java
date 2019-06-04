package com.oujiajie.oa.entity;

/**
 * Created By Jou
 * Date 2019/5/19 0019 Time 15:55
 */
public class Clazz {
    private int classId;
    private String className;

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Clazz() {
    }

    public Clazz(int classId, String className) {
        this.classId = classId;
        this.className = className;
    }
}
