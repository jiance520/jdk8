package com.supplier;

public class Person{

	private String name;
	private String sex;
	private int age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person() {
		
	}
	public Person(String name, String sex, int age) {
		this();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	public void say(){
		System.out.println("-----------person say");
	}
	
	public static void showNum(Integer a){
		System.out.println(" num = "+a);
	}
	
	public void add(Integer a) {
		System.out.println(" num + 1 = "+(a+1));
	}
	
}
