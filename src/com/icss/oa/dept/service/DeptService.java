package com.icss.oa.dept.service;

import com.icss.oa.dept.dao.DeptMapper;
import com.icss.oa.dept.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptService {

    @Autowired
    private DeptMapper deptMapper;
    @Transactional(rollbackFor = Exception.class)
    public List<Dept> get(){
        return deptMapper.findAllDept();
    }
}
