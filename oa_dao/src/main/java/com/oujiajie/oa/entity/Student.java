package com.oujiajie.oa.entity;

/**
 * Created By Jou
 * Date 2019/5/19 0019 Time 14:00
 */
public class Student {
    private int stuId;
    private String stuName;
    private String stuPwd;
    private String stuGender;
    private int stuClass;
    private Clazz clazz;

    public Student() {
    }

    public Student(int stuId, String stuName, String stuPwd, String stuGender, int stuClass) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuPwd = stuPwd;
        this.stuGender = stuGender;
        this.stuClass = stuClass;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuPwd='" + stuPwd + '\'' +
                ", stuGender='" + stuGender + '\'' +
                ", stuClass=" + stuClass +
                '}';
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuPwd() {
        return stuPwd;
    }

    public void setStuPwd(String stuPwd) {
        this.stuPwd = stuPwd;
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    public int getStuClass() {
        return stuClass;
    }

    public void setStuClass(int stuClass) {
        this.stuClass = stuClass;
    }
}
