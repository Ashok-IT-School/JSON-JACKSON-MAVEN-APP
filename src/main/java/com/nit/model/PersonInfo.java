package com.nit.model;

import java.util.Date;

/**
 * This class is used to Person details
 * 
 * @author Ashok
 *
 */
public class PersonInfo {

	private Integer pid;

	private String name;

	private byte age;

	private String email;

	private Date dob;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", name=" + name + ", age=" + age + ", email=" + email + ", dob=" + dob + "]";
	}

}
