package com.test;

@FunctionalInterface
public interface IFly {

	void fly();
	
	default String test(){
		return "test";
	}
	
	static int add(int n1,int n2){
		return n1 + n2;
	}
}
