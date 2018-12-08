package com.inner;

public class Test1 {

	public static void main(String[] args) {
		Aa  a1 = new Aa();
		
		Aa.Ba  b1 = a1.new Ba();
		
		Aa.Ba  b2 = new Aa().new Ba();

		Aa.Da  d1 = new Aa.Da();
	}

}
