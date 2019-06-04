package com.oujiajie.oa.biz;

import com.oujiajie.oa.entity.Question;

import java.util.List;

public interface QuestionService {
    void add(Question question);
    void edit(Question question);
    void remove(int id);
    Question get(int id);
    List<Question> getAll();
    List<Question> getBy(Question question);
}
