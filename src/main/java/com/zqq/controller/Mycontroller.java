package com.zqq.controller;

import com.zqq.mapper.StudentMapper;
import com.zqq.pojo.Student;
import jdk.nashorn.internal.ir.ReturnNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import javax.validation.constraints.Null;
import java.util.List;

/**
 * @ClassName Mycontroller
 * @Author zqq
 * @Date 2020/4/7 8:08
 * @Version 1.0
 */
@Controller
@RequestMapping("/get")
public class Mycontroller {

    @Autowired
    StudentMapper studentMapper;

    Logger logge = LoggerFactory.getLogger(Mycontroller.class);
    @RequestMapping("/{id}")
    String getStr(@PathVariable String id){

        logge.info("今天是个好日子，今天的幸运编号是"+id);
        String a="我来自黑夜，但黑夜不会带来光明";
        return  a;
    }
    @RequestMapping("/stu/{sid}")
    public String getStuById(@PathVariable  int sid , ModelMap map){
        Student stuById = studentMapper.getStuById(sid);
        map.addAttribute("stu",stuById);
        System.out.println(stuById);
        return "index";
    }

    @RequestMapping("/stu1")
    public String getStuById( ModelMap map){
        List<Student> stuById = studentMapper.getList();
        map.addAttribute("stu",stuById);
        System.out.println(stuById);
        return "index";
    }
    @RequestMapping("/del/{id}")
    public String delStu(@PathVariable int id){
        studentMapper.delById(id);
        return "redirect:/get/stu1";
    }

    @RequestMapping("/qy/{id}")
    public String queryById(@PathVariable int id, Model model){
       Student student= studentMapper.queryById(id);
        model.addAttribute("student", student);
        return "update";

    }

    @RequestMapping("/update")
    public String updateStu(Student student){
         studentMapper.updateStu(student);
        System.out.println(student+"");
        return "redirect:/get/stu1";
    }



    @RequestMapping("/topage")
    public  String redirectToIndex(){


        return "index";
    }

}
