package com.oujiajie.oa.dao;

import com.oujiajie.oa.entity.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created By Jou
 * Date 2019/5/19 0019 Time 14:13
 */
@Repository("teacherDao")
public interface TeacherDao {
    void insert(Teacher teacher);
    void update(Teacher teacher);
    void delete(int teacherId);
    Teacher select(int teacherId);
    List<Teacher> selectAll();
}
