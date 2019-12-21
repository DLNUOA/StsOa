package com.icss.oa.emp.service;

import com.icss.oa.emp.dao.EmpMapper;
import com.icss.oa.emp.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Transactional(readOnly = true)
    public int checkLogin(String loginName,String password){
        Emp emp = empMapper.queryByName(loginName);
        if (emp==null){
            return 1;
        }else {
            if (password.equals(emp.getEmpPwd())){
                return 0;
            }
            else {
                return -1;
            }
        }
    }
}
