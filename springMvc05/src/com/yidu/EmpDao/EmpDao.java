package com.yidu.EmpDao;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yidu.entity.Dept;
import com.yidu.entity.Emp;
/**
 * DAO层
 * TODO 对该类总结性的描述
 * 
 * @ClassName: EmpDao 
 * @author 黄杰
 * @date 2018年6月14日 下午8:07:50
 * @version V1.0 
 *
 */
@Repository
public interface EmpDao {
	/**
	 * 方法描述: 查询所有员工信息
	 * 业务逻辑说明: TODO(总结性的归纳方法业务逻辑)
	 * @Title: getAllEmp 
	 * @date 2018年6月15日 上午11:27:26
	 * @author 黄杰
	 * @modifier 无
	 * @modifydate 无
	 * @return
	 */
	public Collection<Emp> getAllEmp();
	/**
	 * 
	 * 方法描述: 查询所有部门
	 * 业务逻辑说明: TODO(总结性的归纳方法业务逻辑)
	 * @Title: getAllDept 
	 * @date 2018年6月15日 上午11:26:42
	 * @author 黄杰
	 * @modifier 无
	 * @modifydate 无
	 * @return
	 */
	public Collection<Dept> getAllDept();
	/**
	 * 
	 * 方法描述: 新增员工
	 * 业务逻辑说明: TODO(总结性的归纳方法业务逻辑)
	 * @Title: insertEmp 
	 * @date 2018年6月15日 上午11:35:28
	 * @author 黄杰
	 * @modifier 无
	 * @modifydate 无
	 * @param emp
	 */
	public void insertEmp(Emp emp);
	/**
	 * 
	 * 方法描述: 根据id删除员工信息
	 * 业务逻辑说明: TODO(总结性的归纳方法业务逻辑)
	 * @Title: empDeleteById 
	 * @date 2018年6月18日 下午2:53:02
	 * @author 黄杰
	 * @modifier 无
	 * @modifydate 无
	 * @param id
	 */
	public void empDeleteById(Integer id);
	
	public  Emp getEmpById(Integer id);
	
	public void updateEmp(Emp emp);
	//巴拉拉小魔仙
}
