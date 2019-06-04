package com.oujiajie.oa.dao;


import com.oujiajie.oa.entity.Question;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created By Jou
 * Date 2019/5/19 0019 Time 14:11
 */
@Repository("questionDao")
public interface QuestionDao {
    void insert(Question question);
    void update(Question Question);
    void delete(int queId);
    Question select(int queId);
    List<Question> selectAll();
    List<Question> selectBy(Question question);
}
