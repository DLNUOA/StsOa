package com.icss.test;

import com.icss.oa.dept.dao.DeptMapper;
import com.icss.oa.dept.pojo.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestDeptMapper {

    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    DeptMapper bean = context.getBean(DeptMapper.class);
    @Test
    public void findAllDept(){


        List<Dept> allDept = bean.findAllDept();
        for (Dept dept : allDept) {
            System.out.println(dept);
        }
    }



}

