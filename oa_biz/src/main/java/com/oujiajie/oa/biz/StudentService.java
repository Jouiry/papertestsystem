package com.oujiajie.oa.biz;



import com.oujiajie.oa.entity.Student;

import java.util.List;

public interface StudentService {
    void add(Student student);
    void edit(Student student);
    void remove(int id);
    Student get(int id);
    List<Student> getAll();
}
