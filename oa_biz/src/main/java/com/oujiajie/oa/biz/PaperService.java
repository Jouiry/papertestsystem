package com.oujiajie.oa.biz;

import com.oujiajie.oa.entity.Paper;


import java.util.List;

public interface PaperService {
    void add(Paper paper);
    void edit(Paper paper);
    void remove(int id);
    Paper get(int id);
    List<Paper> getAll();
}
