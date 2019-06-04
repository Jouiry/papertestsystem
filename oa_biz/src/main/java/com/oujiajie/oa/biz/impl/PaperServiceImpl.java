package com.oujiajie.oa.biz.impl;

import com.oujiajie.oa.biz.PaperService;
import com.oujiajie.oa.dao.PaperDao;
import com.oujiajie.oa.entity.Paper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created By Jou
 * Date 2019/5/20 0020 Time 18:37
 */
@Service("paperService")
public class PaperServiceImpl implements PaperService {

    @Autowired
    private PaperDao paperDao;

    public void add(Paper paper) {
        Date date = new Date();
        paper.setPaperDate(date);
        paperDao.insert(paper);
    }

    public void edit(Paper paper) {
        paperDao.update(paper);
    }

    public void remove(int id) {
        paperDao.delete(id);
    }

    public Paper get(int id) {
        Paper paper = paperDao.select(id);
        return paper;
    }

    public List<Paper> getAll() {
        List<Paper> papers = paperDao.selectAll();
        return papers;
    }
}
