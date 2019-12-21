package com.icss.oa.emp.dao;

import com.icss.oa.emp.pojo.Emp;

public interface EmpMapper {
    Emp queryByName(String empLoginName);
}