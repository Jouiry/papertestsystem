package com.oujiajie.oa.controller;


import com.oujiajie.oa.biz.TeacherService;
import com.oujiajie.oa.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller("teacherController")
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @RequestMapping("/list")
    public String list(Map<String,Object> map){
        map.put("list",teacherService.getAll());
        return "teacher_list";
    }
    @RequestMapping("/to_add")
    public String toAdd(Map<String,Object> map){
        map.put("teacher",new Teacher());
        return "teacher_add";
    }
    @RequestMapping("/add")
    public String add(Teacher teacher){
        teacherService.add(teacher);
        return "redirect:list";
    }

    @RequestMapping(value = "/to_update",params = "id")
    public String toUpdate(int id,Map<String,Object> map){
        map.put("teacher",teacherService.get(id));
        return "teacher_update";
    }
    @RequestMapping("/update")
    public String update(Teacher teacher){
        teacherService.edit(teacher);
        return "redirect:list";
    }
    @RequestMapping(value = "/remove",params = "id")
    public String remove(int id){
        teacherService.remove(id);
        return "redirect:list";
    }

}
