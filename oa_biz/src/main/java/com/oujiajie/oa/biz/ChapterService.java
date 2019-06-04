package com.oujiajie.oa.biz;

import com.oujiajie.oa.entity.Chapter;

import java.util.List;

public interface ChapterService {

    Chapter get(int id);
    List<Chapter> getAll();
}
