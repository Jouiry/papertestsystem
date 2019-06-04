package com.oujiajie.oa.biz.impl;

import com.oujiajie.oa.biz.TypeService;
import com.oujiajie.oa.dao.TypeDao;
import com.oujiajie.oa.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By Jou
 * Date 2019/5/20 0020 Time 18:29
 */
@Service("typeService")
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeDao typeDao;

    public Type get(int id) {
        Type type = typeDao.select(id);
        return type;
    }

    public List<Type> getAll() {
        List<Type> types = typeDao.selectAll();
        return types;
    }
}
