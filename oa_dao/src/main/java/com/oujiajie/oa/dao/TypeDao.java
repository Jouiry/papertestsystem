package com.oujiajie.oa.dao;

import com.oujiajie.oa.entity.Type;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created By Jou
 * Date 2019/5/19 0019 Time 14:11
 */
@Repository("typeDao")
public interface TypeDao {
    Type select(int typeId);
    List<Type> selectAll();
}
