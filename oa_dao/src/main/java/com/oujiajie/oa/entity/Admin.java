package com.oujiajie.oa.entity;

/**
 * Created By Jou
 * Date 2019/5/19 0019 Time 14:05
 */
public class Admin {
    private int adminId;
    private String adminName;
    private String adminPwd;

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", adminName='" + adminName + '\'' +
                ", adminPwd='" + adminPwd + '\'' +
                '}';
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }

    public Admin() {
    }

    public Admin(int adminId, String adminName, String adminPwd) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPwd = adminPwd;
    }
}
