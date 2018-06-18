package com.yidu.entity;
/**
 * 员工类
 * TODO 对该类总结性的描述
 * 
 * @ClassName: Emp 
 * @author 黄杰
 * @date 2018年6月14日 上午9:08:42
 * @version V1.0 
 *
 */
public class Emp {
	private Integer empId;
	private String name;
	private String sex;
	private Integer age;
	private Integer deptId;
	private Dept dept;
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Emp [age=" + age + ", dept=" + dept + ", deptId=" + deptId
				+ ", empId=" + empId + ", name=" + name + ", sex=" + sex + "]";
	}

	public Emp(Integer empId, String name, String sex, Integer age,
			Integer deptId, Dept dept) {
		super();
		this.empId = empId;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.deptId = deptId;
		this.dept = dept;
	}

	public Emp() {}
}
