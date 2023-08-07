package com.example.mapper;


import com.example.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {
    //根据ID删除
/*    @Delete("delete from emp where id=#{id}")
    public void delete(Integer id);*/

    //查询全部用户信息
/*    @Select("select * from emp")
    public List<Emp> list();*/

    //新增用户信息
    @Options(keyProperty = "id",useGeneratedKeys = true)  //返回插入内容的主键信息
    @Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time)\n" +
            "values(#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
    public  void insert(Emp emp);

    //更新员工信息
    @Update("update emp set username =#{username},name=#{name},gender=#{gender},image=#{image},job=#{job},\n" +
            "entrydate=#{entrydate},dept_id=#{deptId},update_time=#{updateTime} where id=#{id}")
    public void update(Emp emp);


  /*  //查询用户信息（根据id）
    @Select("select * from emp where id=#{id}")
    public Emp getByID(Integer id);*/

    //将后面 实体类与 数据库查询的返回的字段名不一致，不能封装的 进行封装。方案一:起别名
    /*@Select("select id, username, password, name, gender, image, job, " +
            "entrydate, dept_id deptId, create_time createTime, update_time updateTime from emp where id=#{id}")
    public Emp getByID(Integer id);*/


    //方案二：通过@Results,@Result注解手动映射封装
  /*  @Results({
            @Result(column = "dept_id",property = "deptId"),
            @Result(column = "create_time",property = "createTime"),
            @Result(column = "update_time",property = "updateTime")
    })

    @Select("select * from emp where id=#{id}")
    public Emp getByID(Integer id);*/


    //方案三：开启mybatis的驼峰命名自动映射开关 ---- a_cloumn ------->aCloumn
    //需要在application.properties 中开启
/*    @Select("select * from emp where id=#{id}")
    public Emp getByID(Integer id);*/


//    查询用户信息（根据条件），存在漏洞，可能会有sql注入问题。
    /*@Select("select * from  emp where name like '%${name}%' and gender = #{gender} and" +
            " entrydate between #{begin} and #{end} order by update_time desc")
    public List<Emp> list(String name, Integer gender, LocalDate begin,LocalDate end);*/


//   改良后的代码
//    @Select("select * from  emp where name like concat('%',#{name},'%') and gender = #{gender} and" +
//        " entrydate between #{begin} and #{end} order by update_time desc")
    public List<Emp> list(String name, Integer gender, LocalDate begin, LocalDate end);


    //动态更新员工
    public void update2(Emp emp);


    //批量删除
    public void deleteByIds(List<Integer> ids);
}
