package com.oujiajie.oa.biz;

import com.oujiajie.oa.entity.Clazz;


import java.util.List;

public interface ClazzService {
    void add(Clazz clazz);
    void edit(Clazz clazz);
    void remove(int id);
    Clazz get(int id);
    List<Clazz> getAll();
}
