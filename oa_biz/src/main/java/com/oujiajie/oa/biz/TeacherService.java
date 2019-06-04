package com.oujiajie.oa.biz;



import com.oujiajie.oa.entity.Teacher;

import java.util.List;

public interface TeacherService {
    void add(Teacher teacher);
    void edit(Teacher teacher);
    void remove(int id);
    Teacher get(int id);
    List<Teacher> getAll();
}
