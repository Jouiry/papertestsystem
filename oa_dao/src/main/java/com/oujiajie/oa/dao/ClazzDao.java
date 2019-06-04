package com.oujiajie.oa.dao;

import com.oujiajie.oa.entity.Clazz;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created By Jou
 * Date 2019/5/19 0019 Time 15:56
 */
@Repository("clazzDao")
public interface ClazzDao {
    void insert(Clazz clazz);
    void update(Clazz clazz);
    void delete(int classId);
    Clazz select(int classId);
    List<Clazz> selectAll();
}
