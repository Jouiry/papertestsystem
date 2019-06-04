package com.oujiajie.oa.biz.impl;

import com.oujiajie.oa.biz.ClazzService;
import com.oujiajie.oa.dao.ClazzDao;
import com.oujiajie.oa.entity.Clazz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By Jou
 * Date 2019/5/19 0019 Time 16:29
 */
@Service("clazzService")
public class ClazzServiceImpl implements ClazzService {

    @Autowired
    private ClazzDao clazzDao;

    public void add(Clazz clazz) {
        clazzDao.insert(clazz);
    }

    public void edit(Clazz clazz) {
        clazzDao.update(clazz);
    }

    public void remove(int id) {
        clazzDao.delete(id);
    }

    public Clazz get(int id) {
        Clazz clazz = clazzDao.select(id);
        return clazz;
    }

    public List<Clazz> getAll() {
        List<Clazz> clazzes = clazzDao.selectAll();
        return clazzes;
    }
}
