package com.oujiajie.oa.biz.impl;

import com.oujiajie.oa.biz.TeacherService;
import com.oujiajie.oa.dao.TeacherDao;
import com.oujiajie.oa.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By Jou
 * Date 2019/5/19 0019 Time 16:33
 */
@Service("teacherService")
public class TeacherServicesImpl implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    public void add(Teacher teacher) {
        teacherDao.insert(teacher);
    }

    public void edit(Teacher teacher) {
        teacherDao.update(teacher);
    }

    public void remove(int id) {
        teacherDao.delete(id);
    }

    public Teacher get(int id) {
        Teacher teacher = teacherDao.select(id);
        return teacher;
    }

    public List<Teacher> getAll() {
        List<Teacher> teachers = teacherDao.selectAll();
        return teachers;
    }
}
