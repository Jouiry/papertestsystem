package com.oujiajie.oa.controller;



import com.oujiajie.oa.biz.*;
import com.oujiajie.oa.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;
import java.util.Map;

@Controller("questionController")
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;
    @Autowired
    private ChapterService chapterService;
    @Autowired
    private PointService pointService;
    @Autowired
    private TypeService typeService;
    @Autowired
    private DifService difService;
    @RequestMapping("/list")
    public String list(Map<String,Object> map){
        map.put("list",questionService.getAll());
        return "question_list";
    }
    @RequestMapping("/to_add")
    public String toAdd(Map<String,Object> map){
        map.put("question",new Question());
        List<Type> types = typeService.getAll();
        List<Dif> difs = difService.getAll();
        List<Chapter> chapters = chapterService.getAll();
        List<Point> points = pointService.getAll();
        map.put("types",types);
        map.put("difs",difs);
        map.put("chapters",chapters);
        map.put("points",points);
        return "question_add";
    }
    @RequestMapping("/add")
    public String add(Question question){
        questionService.add(question);
        return "redirect:list";
    }

    @RequestMapping(value = "/to_update",params = "id")
    public String toUpdate(int id,Map<String,Object> map){
        map.put("question",questionService.get(id));
        List<Type> types = typeService.getAll();
        List<Dif> difs = difService.getAll();
        List<Chapter> chapters = chapterService.getAll();
        List<Point> points = pointService.getAll();
        map.put("types",types);
        map.put("difs",difs);
        map.put("chapters",chapters);
        map.put("points",points);
        return "question_update";
    }
    @RequestMapping("/update")
    public String update(Question question){
        questionService.edit(question);
        return "redirect:list";
    }

    @RequestMapping("/to_query")
    public String toQuery(Map<String,Object> map){
        List<Type> types = typeService.getAll();
        List<Dif> difs = difService.getAll();
        List<Chapter> chapters = chapterService.getAll();
        List<Point> points = pointService.getAll();
        map.put("types",types);
        map.put("difs",difs);
        map.put("chapters",chapters);
        map.put("points",points);
        return "question_query";
    }

    @RequestMapping("/query")
    public String query(Map<String,Object> map, Question question){
        System.out.println(question.getQueItem());
        System.out.println(question.getPointId());
        System.out.println(question.getQueChap());
        System.out.println(question.getQueType());
        System.out.println(question.getQueDif());
        List<Question> questions = questionService.getBy(question);
        System.out.println(questions.size());
        map.put("list", questions);
        return "question_list";
    }

    @RequestMapping(value = "/remove",params = "id")
    public String remove(int id){
        questionService.remove(id);
        return "redirect:list";
    }

    @ResponseBody
    @RequestMapping(value = "/getPoints",params = "chapId")
    public List<Point> getPoints(int chapId){
        Chapter chapter = chapterService.get(chapId);
        List<Point> points = chapter.getPoints();
        System.out.println(points.size());
        return points;
    }



}
