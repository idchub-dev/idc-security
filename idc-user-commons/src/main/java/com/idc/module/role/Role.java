package com.idc.module.role;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7608204369771819311L;

	private int id;
	
	@NotEmpty(message="角色名称不能为空")
	@Size(min=2,max=10,message="角色名称长度不能少于两个字符且不能超过十个字符")
	@Pattern(regexp="^[A-Za-z0-9\\u4e00-\\u9fa5]*$",message="角色名称不能包含英文特殊字符")
	private String name;
	
	@Size(min=0,max=30,message="角色描述信息不能超过三十个字符")
	private String description;
	
	private String grantedAuthority;
	
	private int type;
	
	private Date createTime;
	
	private Date updateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGrantedAuthority() {
		return grantedAuthority;
	}

	public void setGrantedAuthority(String grantedAuthority) {
		this.grantedAuthority = grantedAuthority;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
