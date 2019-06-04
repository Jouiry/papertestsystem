package com.oujiajie.oa.controller;

import com.oujiajie.oa.biz.GlobalBiz;
import com.oujiajie.oa.entity.Admin;
import com.oujiajie.oa.entity.Student;
import com.oujiajie.oa.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
@Controller("globalController")
public class GloablController {
    @Autowired
    private GlobalBiz globalBiz;

    @RequestMapping("/to_login")
    public String toLogin(){
        return "login";
    }

    @ResponseBody
    @RequestMapping("/login")
    public String login(HttpSession session,@RequestParam String role, @RequestParam int id, @RequestParam String password,@RequestParam String code){
        String getCode = (String) session.getAttribute("randCheckCode");
        if(!getCode.trim().equalsIgnoreCase(code)){
            return "wrongCode";
        }
       if(role.equals("admin")) {
           Admin admin = globalBiz.loginByAdmin(id,password);
           if (admin == null) {
               return "wrong";
           }
           session.setAttribute("admin",admin);
           return "admin";
       }
       if(role.equals("student")) {
           Student student = globalBiz.loginByStudent(id, password);
           if (student == null) {
               return "wrong";
           }
           session.setAttribute("student",student);
           return "student";
       }
       if(role.equals("teacher")) {
           Teacher teacher = globalBiz.loginByTeacher(id, password);
           if (teacher == null) {
               return "wrong";
           }
           session.setAttribute("teacher",teacher);
           return "teacher";
       }
        return "wrong";
    }

    @RequestMapping("/adminself")
    public String adminself(){
        return "adminself";
    }

    @RequestMapping("/studentself")
    public String studentself(){
        return "studentself";
    }

    @RequestMapping("/teacherself")
    public String teacherself(){
        return "teacherself";
    }

    @RequestMapping("/quit")
    public String quit(HttpSession session){
        session.invalidate();
        return "redirect:to_login";
    }

    @RequestMapping("/to_change_admin_password")
    public String toChangeAdminPassword(){
        return "change_admin_password";
    }

    @RequestMapping("/change_admin_password")
    public String changeAdminPassword(HttpSession session, @RequestParam String old, @RequestParam String new1 ,@RequestParam String new2){
        Admin admin = (Admin) session.getAttribute("admin");
        if(admin.getAdminPwd().equals(old)){
            if(new1.equals(new2)){
                admin.setAdminPwd(new1);
                globalBiz.changeAdminPassword(admin);
                return "redirect:adminself";
            }
        }
        return "redirect:to_change_admin_password";
    }

    @RequestMapping("/to_change_student_password")
    public String toChangeStudentPassword(){
        return "change_student_password";
    }

    @RequestMapping("/change_student_password")
    public String changeStudentPassword(HttpSession session, @RequestParam String old, @RequestParam String new1 ,@RequestParam String new2){
        Student student = (Student) session.getAttribute("student");
        if(student.getStuPwd().equals(old)){
            if(new1.equals(new2)){
                student.setStuPwd(new1);
                globalBiz.changeStudentPassword(student);
                return "redirect:studentself";
            }
        }
        return "redirect:to_change_student_password";
    }



    @RequestMapping("/to_change_teacher_password")
    public String toChangeTeacherPassword(){
        return "change_teacher_password";
    }

    @RequestMapping("/change_teacher_password")
    public String changeTeacherPassword(HttpSession session, @RequestParam String old, @RequestParam String new1 ,@RequestParam String new2){
        Teacher teacher = (Teacher) session.getAttribute("teacher");
        if(teacher.getTeaPwd().equals(old)){
            if(new1.equals(new2)){
                teacher.setTeaPwd(new1);
                globalBiz.changeTeacherPassword(teacher);
                return "redirect:teacherself";
            }
        }
        return "redirect:to_change_teacher_password";
    }




}
