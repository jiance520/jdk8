package com.supplier;

import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++){
        	int rd = (int)(Math.random()*100);
        	list.add(rd);
        }
        System.out.println(list);
        
        //list.forEach(e ->{System.out.println(e);});
        list.forEach(System.out::println);
	}

}
