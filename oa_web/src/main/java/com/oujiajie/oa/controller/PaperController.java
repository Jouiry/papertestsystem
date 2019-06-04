package com.oujiajie.oa.controller;



import com.oujiajie.oa.biz.PaperQueService;
import com.oujiajie.oa.biz.PaperService;
import com.oujiajie.oa.biz.QuestionService;
import com.oujiajie.oa.entity.Paper;
import com.oujiajie.oa.entity.PaperQue;
import com.oujiajie.oa.entity.Question;
import com.oujiajie.oa.entity.Teacher;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller("paperController")
@RequestMapping("/paper")
public class PaperController {
    @Autowired
    private QuestionService questionService;
    @Autowired
    private PaperService paperService;
    @Autowired
    private PaperQueService paperQueService;
    @RequestMapping("/list")
    public String list(Map<String,Object> map){
        map.put("list",paperService.getAll());
        return "paper_list";
    }
    @RequestMapping("/to_add")
    public String toAdd(Map<String,Object> map){
        map.put("paper",new Paper());
        return "paper_add";
    }
    @RequestMapping("/add")
    public String add(HttpSession session, Paper paper){
        Teacher teacher = (Teacher) session.getAttribute("teacher");
        paper.setPaperTeacher(teacher.getTeaId());
        List<Question> questions = questionService.getAll();
        for (Question question : questions) {
            PaperQue paperQue = new PaperQue();
            paperQue.setPaperId(paper.getPaperId());
            paperQue.setQueId(question.getQueId());
            paperQueService.add(paperQue);
        }
        paperService.add(paper);
        return "redirect:list";
    }

    @RequestMapping(value = "/to_update",params = "id")
    public String toUpdate(int id,Map<String,Object> map){
        Paper paper = paperService.get(id);
        List<PaperQue> paperQues = paper.getPaperQues();
        List<Question> questions = new ArrayList<>();
        for (PaperQue paperQue : paperQues) {
            questions.add(paperQue.getQuestion());
        }


        map.put("questions",questions);
        return "paper_update";
    }
    @RequestMapping("/update")
    public String update(Paper paper){
        paperService.edit(paper);
        return "redirect:list";
    }


    @RequestMapping(value = "/remove",params = "id")
    public String remove(int id){
        paperService.remove(id);
        return "redirect:list";
    }

    @RequestMapping(value = "/delete",params = {"pid","qid"})
    public String delete(int pid, int qid){
        paperQueService.removeOne(pid,qid);
        return "redirect:list";
    }


    @RequestMapping(value = "/query",params = "id")
    public String query(int id, Model model){
        Paper paper = paperService.get(id);
        List<PaperQue> paperQues = paper.getPaperQues();
        List<Question> questions = new ArrayList<>();
        for (PaperQue paperQue : paperQues) {
            questions.add(paperQue.getQuestion());
        }
        List<Question> XuanZhes = new ArrayList<>();
        List<Question> TianKongs = new ArrayList<>();
        List<Question> JiSuans = new ArrayList<>();
        for (Question question : questions) {
            if(question.getQueType() == 1) {
                XuanZhes.add(question);
            } else if(question.getQueType() == 2) {
                TianKongs.add(question);
            } else if(question.getQueType() == 5){
                JiSuans.add(question);
            }

        }
        model.addAttribute("XuanZhes",XuanZhes);
        model.addAttribute("TianKongs",TianKongs);
        model.addAttribute("JiSuans",JiSuans);
        model.addAttribute("paper",paper);
        return "hello";
    }

    @RequestMapping(value = "/create",params = "id")
    public String createWord(int id, HttpSession session) throws IOException, TemplateException {
        //第一步：创建一个Configuration对象，直接new一个对象。构造方法的参数就是freemarker的版本号。
        Configuration configuration = new Configuration();
        //第二步：设置模板文件所在的路径。
        File file = new File("C:\\Users\\Administrator\\IdeaProjects\\spring\\oa\\oa_web\\src\\main\\webapp\\WEB-INF\\ftl");
        configuration.setDirectoryForTemplateLoading(file);
        //第三步：设置模板文件使用的字符集。一般就是utf-8.
        configuration.setDefaultEncoding("utf-8");
        //第四步：加载一个模板，创建一个模板对象。
        Template template = configuration.getTemplate("paper.ftl");
        //第五步：创建一个模板使用的数据集，Map对象。

        HashMap<String, Object> dataMap = new HashMap<>();
        Paper paper = paperService.get(id);
        List<PaperQue> paperQues = paper.getPaperQues();
        List<Question> questions = new ArrayList<>();
        for (PaperQue paperQue : paperQues) {
            questions.add(paperQue.getQuestion());
        }
        List<Question> XuanZhes = new ArrayList<>();
        List<Question> TianKongs = new ArrayList<>();
        List<Question> JiSuans = new ArrayList<>();
        for (Question question : questions) {
            if(question.getQueType() == 1) {
                XuanZhes.add(question);
            } else if(question.getQueType() == 2) {
                TianKongs.add(question);
            } else if(question.getQueType() == 5){
                JiSuans.add(question);
            }
        }
        dataMap.put("XuanZhes",XuanZhes);
        dataMap.put("TianKongs",TianKongs);
        dataMap.put("JiSuans",JiSuans);
        dataMap.put("paper",paper);
        File outFile = new File("D:\\Users\\Administrator\\Documents\\".concat(paper.getPaperName().concat(".doc")));
        Writer out = null;

        try {
            FileOutputStream fos = new FileOutputStream(outFile);
            OutputStreamWriter oWriter = new OutputStreamWriter(fos,"UTF-8");
            out = new BufferedWriter(oWriter);
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        //第六步：创建一个Writer对象，一般创建一FileWriter对象，指定生成的文件名。

        //		第七步：调用模板对象的process方法输出文件。
        template.process(dataMap,out);
        //		第八步：关闭流。
        out.close();
        session.setAttribute("fileName",paper.getPaperName());
        session.setAttribute("filePath","D:\\Users\\Administrator\\Documents\\");

        return "redirect:download";
    }



    @RequestMapping(value = "/download")
    public String download(HttpSession session,HttpServletRequest request, HttpServletResponse response){
        String fileName = (String) session.getAttribute("fileName");
        String filePath = (String) session.getAttribute("filePath");
        filePath = filePath.concat(fileName).concat(".doc");
        fileName = fileName.concat(".doc");
        response.setContentType("text/html;charset=utf-8");
        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        java.io.BufferedInputStream bis = null;
        java.io.BufferedOutputStream bos = null;

        String downLoadPath = filePath;  //注意不同系统的分隔符
        //	String downLoadPath =filePath.replaceAll("/", "\\\\\\\\");   //replace replaceAll区别 *****
        System.out.println(downLoadPath);

        try {
            long fileLength = new File(downLoadPath).length();
            response.setContentType("application/x-msdownload;");
            response.setHeader("Content-disposition", "attachment; filename=" + new String(fileName.getBytes("utf-8"), "ISO8859-1"));
            response.setHeader("Content-Length", String.valueOf(fileLength));
            bis = new BufferedInputStream(new FileInputStream(downLoadPath));
            bos = new BufferedOutputStream(response.getOutputStream());
            byte[] buff = new byte[2048];
            int bytesRead;
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bis != null)
                try {
                    bis.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            if (bos != null)
                try {
                    bos.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
        }
        session.removeAttribute("fileName");
        session.removeAttribute("filePath");
        return "redirect:list";
    }


}
