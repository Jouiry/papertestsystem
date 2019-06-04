package com.oujiajie.oa.controller;


import com.oujiajie.oa.biz.ClazzService;
import com.oujiajie.oa.biz.StudentService;
import com.oujiajie.oa.entity.Clazz;
import com.oujiajie.oa.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller("studentController")
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private ClazzService clazzService;
    @Autowired
    private StudentService studentService;
    @RequestMapping("/list")
    public String list(Map<String,Object> map){
        map.put("list",studentService.getAll());
        return "student_list";
    }
    @RequestMapping("/to_add")
    public String toAdd(Map<String,Object> map){
        map.put("student",new Student());
        List<Clazz> clazzes = clazzService.getAll();
        map.put("Clazzes",clazzes);
        return "student_add";
    }
    @RequestMapping("/add")
    public String add(Student student){
        studentService.add(student);
        return "redirect:list";
    }

    @RequestMapping(value = "/to_update",params = "id")
    public String toUpdate(int id,Map<String,Object> map){
        map.put("student",studentService.get(id));
        List<Clazz> clazzes = clazzService.getAll();
        map.put("Clazzes",clazzes);
        return "student_update";
    }
    @RequestMapping("/update")
    public String update(Student student){
        studentService.edit(student);
        return "redirect:list";
    }
    @RequestMapping(value = "/remove",params = "id")
    public String remove(int id){
        studentService.remove(id);
        return "redirect:list";
    }

}
