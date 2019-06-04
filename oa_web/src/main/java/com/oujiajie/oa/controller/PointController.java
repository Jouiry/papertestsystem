package com.oujiajie.oa.controller;


import com.oujiajie.oa.biz.ChapterService;
import com.oujiajie.oa.biz.PointService;
import com.oujiajie.oa.entity.Chapter;
import com.oujiajie.oa.entity.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller("pointController")
@RequestMapping("/point")
public class PointController {
    @Autowired
    private PointService pointService;
    @Autowired
    private ChapterService chapterService;
    @RequestMapping("/list")
    public String list(Map<String,Object> map){
        map.put("list",pointService.getAll());
        return "point_list";
    }
    @RequestMapping("/to_add")
    public String toAdd(Map<String,Object> map){
        map.put("point",new Point());
        List<Chapter> chapters = chapterService.getAll();
        map.put("chapters",chapters);
        return "point_add";
    }
    @RequestMapping("/add")
    public String add(Point point){
        pointService.add(point);
        return "redirect:list";
    }

    @RequestMapping(value = "/to_update",params = "id")
    public String toUpdate(int id,Map<String,Object> map){
        map.put("point",pointService.get(id));
        List<Chapter> chapters = chapterService.getAll();
        map.put("chapters",chapters);
        return "point_update";
    }
    @RequestMapping("/update")
    public String update(Point point){
        pointService.edit(point);
        return "redirect:list";
    }
    @RequestMapping(value = "/remove",params = "id")
    public String remove(int id){
        pointService.remove(id);
        return "redirect:list";
    }

}
