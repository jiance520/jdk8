package com.test;

public class Test1 {

	public static void main(String[] args) {
		IFly a1 = new Aa();
		a1.fly();
		a1.test();
		
		int num = IFly.add(12, 2);
		
		
		//IFly a2 = Aa::new;
	}

}
