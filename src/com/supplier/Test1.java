package com.supplier;

import java.util.function.*;

/*
 * �µĺ���ʽ�ӿ�--Supplier������������˼Ϊ��Ӧ�̡��ṩ��
 */
public class Test1 {

	public static void main(String[] args) {
		
		String s2 = new String("hello world"); 
		Supplier<String> s1 = () -> "hello world" ;
		System.out.println(s1.get());
		
		//Supplier<Person> p1 = () -> new Person() ;
		//p1.get().say();
		//���������� ���������û�в���
		Supplier<Person> p2 = Person::new ;
		p2.get().say();
	}

}
