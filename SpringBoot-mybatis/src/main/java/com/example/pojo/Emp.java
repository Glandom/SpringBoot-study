package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data  //get set toString等方法
@NoArgsConstructor  //无参构造方法
@AllArgsConstructor //有参构造方法
public class Emp {
    private Integer id;  //ID
    private String username;  //用户名
    private String password;  //密码
    private String name;      //姓名
    private Integer gender;   //性别 1男  2女
    private String image;     //图像url
    private Short job;        //职位：说明 1.班主任 2.讲师 3.学工主管 4.教研主管 5咨询师
    private LocalDate entrydate; //入职日期
    private Integer deptId;      //部门ID
    private LocalDateTime createTime; //创建时间
    private LocalDateTime updateTime; //修改时间
}
