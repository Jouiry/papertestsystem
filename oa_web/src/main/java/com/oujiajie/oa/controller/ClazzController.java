package com.oujiajie.oa.controller;

import com.oujiajie.oa.biz.ClazzService;

import com.oujiajie.oa.entity.Clazz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller("clazzController")
@RequestMapping("/clazz")
public class ClazzController {
    @Autowired
    private ClazzService clazzService;
    @RequestMapping("/list")
    public String list(Map<String,Object> map){
        map.put("list",clazzService.getAll());
        return "clazz_list";
    }
    @RequestMapping("/to_add")
    public String toAdd(Map<String,Object> map){
        map.put("clazz",new Clazz());
        return "clazz_add";
    }
    @RequestMapping("/add")
    public String add(Clazz clazz){
        clazzService.add(clazz);
        return "redirect:list";
    }

    @RequestMapping(value = "/to_update",params = "id")
    public String toUpdate(int id,Map<String,Object> map){
        map.put("clazz",clazzService.get(id));
        return "clazz_update";
    }
    @RequestMapping("/update")
    public String update(Clazz clazz){
        clazzService.edit(clazz);
        return "redirect:list";
    }
    @RequestMapping(value = "/remove",params = "id")
    public String remove(int id){
        clazzService.remove(id);
        return "redirect:list";
    }

}
