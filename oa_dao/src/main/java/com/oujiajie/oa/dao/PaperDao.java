package com.oujiajie.oa.dao;

import com.oujiajie.oa.entity.Paper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created By Jou
 * Date 2019/5/19 0019 Time 14:11
 */
@Repository("paperDao")
public interface PaperDao {
    void insert(Paper paper);
    void update(Paper paper);
    void delete(int paperId);
    Paper select(int paperId);
    List<Paper> selectAll();
}
