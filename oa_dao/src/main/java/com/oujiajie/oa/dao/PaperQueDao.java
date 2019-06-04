package com.oujiajie.oa.dao;

import com.oujiajie.oa.entity.PaperQue;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created By Jou
 * Date 2019/5/19 0019 Time 14:11
 */
@Repository("paperQueDao")
public interface PaperQueDao {
    void insert(PaperQue paperQue);
    void delete(int papaerId);
    void deleteOne(@Param("paperId")int paperId, @Param("queId") int queId);
    List<PaperQue> select(int paperId);
    List<PaperQue> selectAll();
}
