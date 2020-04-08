package com.zqq.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @ClassName Student
 * @Author zqq
 * @Date 2020/4/7 8:29
 * @Version 1.0
 */
@Data
@Accessors(chain = true)
public class Student {
    private  int id;
    private  String sname;
    private  String password;
    private  String ssex;
    private  String shobby;
    private  String scity;



}
