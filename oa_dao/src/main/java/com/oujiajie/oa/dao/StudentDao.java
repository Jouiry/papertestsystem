package com.oujiajie.oa.dao;

import com.oujiajie.oa.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created By Jou
 * Date 2019/5/19 0019 Time 14:14
 */
@Repository("studentDao")
public interface StudentDao {
    void insert(Student student);
    void update(Student student);
    void delete(int studentId);
    Student select(int studentId);
    List<Student> selectAll();
}
