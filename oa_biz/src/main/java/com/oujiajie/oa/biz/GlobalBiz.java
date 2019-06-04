package com.oujiajie.oa.biz;

import com.oujiajie.oa.entity.Admin;
import com.oujiajie.oa.entity.Student;
import com.oujiajie.oa.entity.Teacher;

public interface GlobalBiz {

    Admin loginByAdmin(int id, String password);
    Teacher loginByTeacher(int id, String password);
    Student loginByStudent(int id, String password);
    void changeAdminPassword(Admin admin);
    void changeStudentPassword(Student student);
    void changeTeacherPassword(Teacher teacher);
}
