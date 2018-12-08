package com.inner;

public class Demo {

	public void test(){
		// 方法内部类
		class Ts{
			
			void t1(){
				System.out.println("---------t1");
			}
		}
		
		Ts  t1 = new Ts();
		    t1.t1();
		
	}
}
