package com.toceansoft.common.pojo;

import java.util.List;
/**
 * 
 * @author zhf  2017年8月8日 下午1:26:30
 *courseItem返回实体
 */
public class ItemResult {
	//用于返回courseItemList
	private String groupname;
	private Integer courseGroupId;
	private List<Integer> name;
	//
	private Integer id;
	private String names;
	
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	public Integer getCourseGroupId() {
		return courseGroupId;
	}
	public void setCourseGroupId(Integer courseGroupId) {
		this.courseGroupId = courseGroupId;
	}
	public List<Integer> getName() {
		return name;
	}
	public void setName(List<Integer> name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	
}
