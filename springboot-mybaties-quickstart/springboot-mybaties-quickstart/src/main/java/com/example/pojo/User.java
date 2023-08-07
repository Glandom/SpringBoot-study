package com.example.pojo;

import lombok.*;

//存放实体类
//用来存储
@Data   //lambok中的 @Data ，自动生成 get,set,tostring等方法
@NoArgsConstructor  //无参构造器方法
@AllArgsConstructor //有参构造器方法
public class User {
    //定义的类型必须使用 包装类
    private Integer id;
    private String name;
    private  Integer age;
    private  Integer gender;
    private  String phone;

/*    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                '}';
    }*/
}
