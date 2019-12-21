package com.icss.oa.dept.dao;

import com.icss.oa.dept.pojo.Dept;

import java.util.List;

public interface DeptMapper {

    int insert(Dept dept);

    Dept selectByPrimaryKey(int id);

    List<Dept> findAllDept();


}