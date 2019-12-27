package com.mindtree.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@Column(name="mid")
	private String mId;
	@Column(name="name")
	private String name;
	@Column(name="salary")
	private int salary;
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	public Employee(String mId, String name, int salary) {
		super();
		this.mId = mId;
		this.name = name;
		this.salary = salary;
	}

}
