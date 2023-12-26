package com.excelupload.sample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tutorialnew")
public class Tutorial {
	
	@Id
	private int tid;
	private String tname;
	private int age;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Tutorial [tid=" + tid + ", tname=" + tname + ", age=" + age + "]";
	}
	public Tutorial(int tid, String tname, int age) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.age = age;
	}
	public Tutorial() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
