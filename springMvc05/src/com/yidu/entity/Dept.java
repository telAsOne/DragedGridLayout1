package com.yidu.entity;
/**
 * 部门实体类
 * TODO 对该类总结性的描述
 * 
 * @ClassName: Dept 
 * @author 黄杰
 * @date 2018年6月14日 上午9:10:08
 * @version V1.0 
 *
 */
public class Dept {
	private Integer deptId;
	private String deptName;
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Dept(Integer deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	public Dept() {
		super();
	}
	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
}
