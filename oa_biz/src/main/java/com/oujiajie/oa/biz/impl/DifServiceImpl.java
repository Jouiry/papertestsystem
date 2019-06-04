package com.oujiajie.oa.biz.impl;

import com.oujiajie.oa.biz.DifService;
import com.oujiajie.oa.dao.DifDao;
import com.oujiajie.oa.entity.Dif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By Jou
 * Date 2019/5/19 0019 Time 16:35
 */
@Service("difService")
public class DifServiceImpl implements DifService {

    @Autowired
    private DifDao difDao;


    public Dif get(int id) {
        Dif dif = difDao.select(id);
        return dif;
    }

    public List<Dif> getAll() {
        List<Dif> difs = difDao.selectAll();
        return difs;
    }
}
