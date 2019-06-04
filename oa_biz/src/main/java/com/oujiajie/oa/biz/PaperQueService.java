package com.oujiajie.oa.biz;

import com.oujiajie.oa.entity.PaperQue;

import java.util.List;

public interface PaperQueService {
    void add(PaperQue paperQue);
    void remove(int id);
    List<PaperQue> get(int id);
    void removeOne(int paperId, int queID);
    List<PaperQue> getAll();
}
