package com.oujiajie.oa.biz.impl;

import com.oujiajie.oa.biz.QuestionService;
import com.oujiajie.oa.dao.QuestionDao;
import com.oujiajie.oa.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By Jou
 * Date 2019/5/20 0020 Time 18:34
 */
@Service("questionService")
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionDao questionDao;

    public void add(Question question) {
        questionDao.insert(question);
    }

    public void edit(Question question) {
        questionDao.update(question);
    }

    public void remove(int id) {
        questionDao.delete(id);
    }

    public Question get(int id) {
        Question question = questionDao.select(id);
        return question;
    }

    public List<Question> getAll() {
        List<Question> questions = questionDao.selectAll();
        return questions;
    }

    public List<Question> getBy(Question question) {
        List<Question> questions = questionDao.selectBy(question);
        System.out.println(questions.size());
        return questions;
    }
}
