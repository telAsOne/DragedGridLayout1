package com.yidu.junit;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.yidu.EmpDao.EmpDao;
import com.yidu.entity.Emp;
import com.yidu.springUtils.SpringUtil;

public class JunitTest {
	@Test
	public void test1(){
		EmpDao empDao = SpringUtil.vessel("empDao");
		Collection<Emp> allEmp = empDao.getAllEmp();
		Iterator<Emp> iterator = allEmp.iterator();
		while(iterator.hasNext()){
			Emp next = iterator.next();
			System.out.println(next.toString());
		}
	}
}
