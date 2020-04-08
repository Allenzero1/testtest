package com.zqq.mapper;

import com.zqq.pojo.Student;

import java.util.List;

/**
 * @Author zqq
 * @Date 2020/4/7 8:12
 * @Version 1.0
 */

public interface StudentMapper {

    Student getStuById(int sid);

    List<Student> getList();

    void delById(int id);

    Student queryById(int id);

    void updateStu(int id);

    void updateStu(Student student);

}
