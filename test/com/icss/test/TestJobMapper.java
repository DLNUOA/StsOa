package com.icss.test;

import com.icss.oa.dept.dao.DeptMapper;
import com.icss.oa.dept.pojo.Dept;
import com.icss.oa.dept.service.DeptService;
//import com.icss.oa.job.dao.JobMapper;
import com.icss.oa.job.pojo.Job;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestJobMapper {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    DeptService bean = context.getBean(DeptService.class);

    @Test
    public void selectByPrimaryKey(){
        List<Dept> depts = bean.get();
        for (Dept dept : depts) {
            System.out.println(dept);
        }

    }
}
