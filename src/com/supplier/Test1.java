package com.supplier;

import java.util.function.*;

/*
 * 新的函数式接口--Supplier，它的中文意思为供应商、提供者
 */
public class Test1 {

	public static void main(String[] args) {
		
		String s2 = new String("hello world"); 
		Supplier<String> s1 = () -> "hello world" ;
		System.out.println(s1.get());
		
		//Supplier<Person> p1 = () -> new Person() ;
		//p1.get().say();
		//构造器引用 这个构造器没有参数
		Supplier<Person> p2 = Person::new ;
		p2.get().say();
	}

}
