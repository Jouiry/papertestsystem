package com.oujiajie.oa.biz.impl;

import com.oujiajie.oa.biz.PaperQueService;
import com.oujiajie.oa.dao.PaperQueDao;
import com.oujiajie.oa.entity.PaperQue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By Jou
 * Date 2019/5/22 0022 Time 16:48
 */
@Service("paperQueService")
public class PaperQueServiceImpl implements PaperQueService {

    @Autowired
    private PaperQueDao paperQueDao;

    public void add(PaperQue paperQue) {
        paperQueDao.insert(paperQue);
    }

    public void remove(int id) {
        paperQueDao.delete(id);
    }

    public List<PaperQue> get(int id) {
        List<PaperQue> paperQues = paperQueDao.select(id);
        return paperQues;
    }

    public void removeOne(int paperId, int queID) {
        paperQueDao.deleteOne(paperId,queID);
    }



    public List<PaperQue> getAll() {
        List<PaperQue> paperQues = paperQueDao.selectAll();
        return paperQues;
    }
}
