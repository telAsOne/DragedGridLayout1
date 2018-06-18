package com.yidu.web.controller;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.yidu.EmpServer.EmpServer;
import com.yidu.entity.Emp;
@Controller
public class EmpController {
	@Autowired
	private EmpServer empServer;
	/**
	 * 方法描述: 查询所有员工
	 * 业务逻辑说明: TODO(总结性的归纳方法业务逻辑)
	 * @Title: getAllEmp 
	 * @date 2018年6月15日 上午11:39:31
	 * @author 黄杰
	 * @modifier 无
	 * @modifydate 无
	 * @param map
	 * @return
	 */
	@RequestMapping("/getAllEmp")
	public String getAllEmp(Map<String,Object> map){
		map.put("emp", empServer.getAllEmp());
		return "selectAllEmp";
	}
	@RequestMapping("/getAllEmp/view")
	public String addEmpView(Map<String,Object> map){
		Map<String,String> m=new HashMap<>();
		m.put("M", "男");
		m.put("F", "女");
		map.put("sexs",m);
		map.put("emps", new Emp());
		map.put("depts",empServer.getAllDept());
		return "insertEmp";
	}
	@RequestMapping(value="/addEmp",method=RequestMethod.POST)
	public String addEmp(Emp emp){
		empServer.insertEmp(emp);
		return "redirect:/getAllEmp";
	}
	@RequestMapping(value="/emp",method=RequestMethod.DELETE)
	public String delete(@PathVariable("id") Integer id){
		empServer.empDeleteById(id);
		return "redirect:/getAllEmp";
	}
	@RequestMapping(value="/emp/{id}",method=RequestMethod.GET)
	public String updateGetEmpById(@PathVariable("id") Integer id,Map<String,Object> map){
		Map<String,String> m=new HashMap<>();
		m.put("M", "男");
		m.put("F", "女");
		map.put("sexs",m);
		map.put("emps", empServer.getEmpById(id));
		map.put("depts",empServer.getAllDept());
		return "insertEmp";
	}
	@RequestMapping(value="/addEmp",method=RequestMethod.PUT)
	public String updateEmp(Emp emp){
		empServer.updateEmp(emp);
		return "redirect:/getAllEmp";
	}
}