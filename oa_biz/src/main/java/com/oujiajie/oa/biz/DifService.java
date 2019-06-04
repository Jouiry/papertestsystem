package com.oujiajie.oa.biz;

import com.oujiajie.oa.entity.Dif;

import java.util.List;

public interface DifService {

    Dif get(int id);
    List<Dif> getAll();
}
