package com.icss.oa.emp.pojo;

import java.util.Date;

public class Emp {
    private Integer empId;

    private String empName;

    private String empLoginName;

    private String empPwd;

    private String empEmail;

    private String empPhone;

    private Date empHiredate;

    private Integer empSalary;

    private Integer empDeptId;

    private Integer empJobId;

    public Emp() {
    }

    public Emp(String empName, String empLoginName, String empPwd, String empEmail, String empPhone, Date empHiredate, Integer empSalary, Integer empDeptId, Integer empJobId) {
        this.empName = empName;
        this.empLoginName = empLoginName;
        this.empPwd = empPwd;
        this.empEmail = empEmail;
        this.empPhone = empPhone;
        this.empHiredate = empHiredate;
        this.empSalary = empSalary;
        this.empDeptId = empDeptId;
        this.empJobId = empJobId;
    }

    public Emp(Integer empId, String empName, String empLoginName, String empPwd, String empEmail, String empPhone, Date empHiredate, Integer empSalary, Integer empDeptId, Integer empJobId) {
        this.empId = empId;
        this.empName = empName;
        this.empLoginName = empLoginName;
        this.empPwd = empPwd;
        this.empEmail = empEmail;
        this.empPhone = empPhone;
        this.empHiredate = empHiredate;
        this.empSalary = empSalary;
        this.empDeptId = empDeptId;
        this.empJobId = empJobId;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empLoginName='" + empLoginName + '\'' +
                ", empPwd='" + empPwd + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empTel='" + empPhone + '\'' +
                ", empHiredate=" + empHiredate +
                ", empSal=" + empSalary +
                ", empDeptId=" + empDeptId +
                ", empJobId=" + empJobId +
                '}';
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getEmpLoginName() {
        return empLoginName;
    }

    public void setEmpLoginName(String empLoginName) {
        this.empLoginName = empLoginName == null ? null : empLoginName.trim();
    }

    public String getEmpPwd() {
        return empPwd;
    }

    public void setEmpPwd(String empPwd) {
        this.empPwd = empPwd == null ? null : empPwd.trim();
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail == null ? null : empEmail.trim();
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone == null ? null : empPhone.trim();
    }

    public Date getEmpHiredate() {
        return empHiredate;
    }

    public void setEmpHiredate(Date empHiredate) {
        this.empHiredate = empHiredate;
    }

    public Integer getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Integer empSalary) {
        this.empSalary = empSalary;
    }

    public Integer getEmpDeptId() {
        return empDeptId;
    }

    public void setEmpDeptId(Integer empDeptId) {
        this.empDeptId = empDeptId;
    }

    public Integer getEmpJobId() {
        return empJobId;
    }

    public void setEmpJobId(Integer empJobId) {
        this.empJobId = empJobId;
    }
}