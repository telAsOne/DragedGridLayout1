package com.yidu.EmpServerImpl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yidu.EmpDao.EmpDao;
import com.yidu.EmpServer.EmpServer;
import com.yidu.entity.Dept;
import com.yidu.entity.Emp;
@Service
public class EmpServerImpl implements EmpServer{
	@Autowired
	private EmpDao empDao;
	@Override
	public Collection<Emp> getAllEmp() {
		Collection<Emp> allEmp = empDao.getAllEmp();
		return allEmp;
	}

	@Override
	public Collection<Dept> getAllDept() {
		Collection<Dept> allDept = empDao.getAllDept();
		return allDept;
	}

	@Override
	public void insertEmp(Emp emp) {
		empDao.insertEmp(emp);
	}

	@Override
	public void empDeleteById(Integer id) {
		empDao.empDeleteById(id);
	}

	@Override
	public Emp getEmpById(Integer id) {
		Emp empById = empDao.getEmpById(id);
		return empById;
	}

	@Override
	public void updateEmp(Emp emp) {
		empDao.updateEmp(emp);
	}
}
