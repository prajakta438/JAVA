package oop;

public class Student {
	private String name;
	private Integer registerNo;
	
	Student(String name, Integer registerNo) {
		this.name = name;
		this.registerNo = registerNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRegisterNo() {
		return registerNo;
	}
	public void setRegisterNo(Integer registerNo) {
		this.registerNo = registerNo;
	}
	
	void display(Course obj) {
		System.out.println(name + " is learning the " + obj.getName() + " course");
	}
}