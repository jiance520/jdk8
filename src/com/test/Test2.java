package com.test;

public class Test2 {

	public static void main(String[] args) {
		
		IFly a3 = () -> {
			System.out.println("-------fly");
		};
		
		IFly a1 = () -> new Aa();
		a1.fly();
		
		IFly a2 = Aa::new;//���������á�
		a2.fly();
		
		
	}

}
