package com.icss.test;

import com.icss.oa.dept.dao.DeptMapper;
import com.icss.oa.dept.pojo.Dept;
import com.icss.oa.emp.service.EmpService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class EmpServiceTest {

    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    EmpService bean = context.getBean(EmpService.class);
    @Test
    public void findAllDept(){

        int wsd = bean.checkLogin("apple", "-1");
        System.out.println(wsd);
    }


}
