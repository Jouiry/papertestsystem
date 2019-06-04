package com.oujiajie.oa.dao;


import com.oujiajie.oa.entity.Chapter;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created By Jou
 * Date 2019/5/19 0019 Time 14:11
 */
@Repository("chapterDao")
public interface ChapterDao {
//    void insert(Chapter chapter);
//    void update(Chapter chapter);
//    void delete(int chapterId);
    Chapter select(int chapterId);
    List<Chapter> selectAll();
}
