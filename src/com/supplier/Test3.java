package com.supplier;

import java.util.*;

public class Test3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++){
        	int rd = (int)(Math.random()*100);
        	list.add(rd);
        }
        
        // lambda写法
     	/*list.forEach(e -> {
     		System.out.println(" num = "+e);
     	});*/
     	
        //静态方法引用 :自动 传 
        list.forEach(Person::showNum);
	}

}
