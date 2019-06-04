package com.oujiajie.oa.biz;

import com.oujiajie.oa.entity.Type;

import java.util.List;

public interface TypeService {

    Type get(int id);
    List<Type> getAll();
}
