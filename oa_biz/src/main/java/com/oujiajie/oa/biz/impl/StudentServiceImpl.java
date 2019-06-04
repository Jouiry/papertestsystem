package com.oujiajie.oa.biz.impl;

import com.oujiajie.oa.biz.StudentService;
import com.oujiajie.oa.dao.StudentDao;
import com.oujiajie.oa.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By Jou
 * Date 2019/5/19 0019 Time 16:31
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    public void add(Student student) {
        studentDao.insert(student);
    }

    public void edit(Student student) {
        studentDao.update(student);
    }

    public void remove(int id) {
        studentDao.delete(id);
    }

    public Student get(int id) {
        Student student = studentDao.select(id);
        return student;
    }

    public List<Student> getAll() {
        List<Student> students = studentDao.selectAll();
        return students;
    }
}
