package com.example.springbootmybatis;

import com.example.mapper.EmpMapper;
import com.example.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sound.sampled.FloatControl;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class SpringBootMybatisApplicationTests {

    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testDelete() {
//        删除根据id删除员工信息
     /* empMapper.delete(7);*/

/*//        构建员工对象
        Emp emp=new Emp();
        emp.setUsername("Jerry2");
        emp.setName("杰瑞2");
        emp.setImage("1.jpg");
        emp.setGender(1);
        emp.setJob((short)1);
        emp.setEntrydate(LocalDate.of(2000,1,1));
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1);

        //执行新增员工操作
        empMapper.insert(emp);
        System.out.println(emp.getId());*/


 /*       // 构建员工对象
        Emp emp=new Emp();
        emp.setId(14);
        emp.setUsername("Jerry3");
        emp.setName("杰瑞3");
        emp.setImage("1.jpg");
        emp.setGender(1);
        emp.setJob((short)1);
        emp.setEntrydate(LocalDate.of(2000,1,1));
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1);

        //执行更新员工操作

        empMapper.update(emp);*/



//        根据id查询用户信息
      /*  Emp emp = empMapper.getByID(10);
        System.out.println(emp);*/


    }

    @Test
    public void testSelect(){
        //查询信息：根据条件进行查询
//        List<Emp> list = empMapper.list("杰瑞", 1, LocalDate.of(2000, 1, 1), LocalDate.of(2025, 1, 2));
        List<Emp> empList =empMapper.list(null,1,null,null);
        System.out.println(empList);
    }

    //动态更新员工信息 -- 更新ID为8的员工。 username 更新为 Tom111, name更新为：汤姆111，gender更新为2
    @Test
    public void  testUpdate(){
        //构造员工对象
        Emp emp = new Emp();
        emp.setId(15);
        emp.setUsername("jerry666");

        emp.setUpdateTime(LocalDateTime.now());


        //执行更新员工操作
        empMapper.update(emp);


    }

    //批量删除员工 ---  9，10
    @Test
    public void testDeleteByIds(){
        List<Integer> ids= Arrays.asList(9,10);
        empMapper.deleteByIds(ids);
    }
}
