package com.icss.test;

import com.icss.oa.dept.dao.DeptMapper;
import com.icss.oa.emp.dao.EmpMapper;
import com.icss.oa.emp.pojo.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmpMapper {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    EmpMapper bean = context.getBean(EmpMapper.class);
    @Test
    public void show(){
        Emp apple = bean.queryByName("apple");
        System.out.println(apple);
    }
}
