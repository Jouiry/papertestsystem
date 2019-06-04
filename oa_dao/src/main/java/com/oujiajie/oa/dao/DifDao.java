package com.oujiajie.oa.dao;


import com.oujiajie.oa.entity.Dif;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created By Jou
 * Date 2019/5/19 0019 Time 14:11
 */
@Repository("DifDao")
public interface DifDao {
    Dif select(int difId);
    List<Dif> selectAll();
}
