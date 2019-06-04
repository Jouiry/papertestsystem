package com.oujiajie.oa.biz.impl;

import com.oujiajie.oa.biz.GlobalBiz;
import com.oujiajie.oa.dao.AdminDao;
import com.oujiajie.oa.dao.StudentDao;
import com.oujiajie.oa.dao.TeacherDao;
import com.oujiajie.oa.entity.Admin;
import com.oujiajie.oa.entity.Student;
import com.oujiajie.oa.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("globalBiz")
public class GlobalBizImpl implements GlobalBiz {
    @Autowired
    private AdminDao adminDao;
    @Autowired
    private StudentDao studentDao;
    @Autowired
    private TeacherDao teacherDao;



    public Admin loginByAdmin(int id, String password) {
        Admin admin = adminDao.select(id);
        if(admin!=null&&admin.getAdminPwd().equals(password)){
            return admin;
        }
        return null;
    }

    public Teacher loginByTeacher(int id, String password) {
        Teacher teacher = teacherDao.select(id);
        if(teacher!=null&&teacher.getTeaPwd().equals(password)){
            return teacher;
        }
        return null;
    }

    public Student loginByStudent(int id, String password) {
        Student student = studentDao.select(id);
        if(student!=null&&student.getStuPwd().equals(password)){
            return student;
        }return null;
    }

    public void changeAdminPassword(Admin admin) {
        adminDao.update(admin);
    }

    public void changeStudentPassword(Student student) {
        studentDao.update(student);
    }

    public void changeTeacherPassword(Teacher teacher) {
        teacherDao.update(teacher);
    }



}
