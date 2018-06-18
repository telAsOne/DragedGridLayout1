package com.yidu.EmpServer;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.yidu.EmpDao.EmpDao;
import com.yidu.entity.Dept;
import com.yidu.entity.Emp;

public interface EmpServer {
	public Collection<Emp> getAllEmp();
	public Collection<Dept> getAllDept();
	public void insertEmp(Emp emp);
	public void empDeleteById(Integer id);
	public  Emp getEmpById(Integer id);
	public void updateEmp(Emp emp);
}
