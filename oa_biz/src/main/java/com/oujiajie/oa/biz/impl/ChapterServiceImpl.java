package com.oujiajie.oa.biz.impl;

import com.oujiajie.oa.biz.ChapterService;
import com.oujiajie.oa.dao.ChapterDao;
import com.oujiajie.oa.entity.Chapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By Jou
 * Date 2019/5/20 0020 Time 18:30
 */
@Service("chapterService")
public class ChapterServiceImpl implements ChapterService {

    @Autowired
    private ChapterDao chapterDao;

    public Chapter get(int id) {
        Chapter chapter = chapterDao.select(id);
        return chapter;
    }

    public List<Chapter> getAll() {
        List<Chapter> chapters = chapterDao.selectAll();
        return chapters;
    }
}
