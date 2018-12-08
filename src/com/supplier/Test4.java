package com.supplier;

import java.util.*;
import java.util.function.Supplier;

public class Test4 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++){
        	int rd = (int)(Math.random()*100);
        	list.add(rd);
        }
        
        Supplier<Person> p2 = Person::new ;
        Person p3 = p2.get();
        //方法引用
        list.forEach(p3::add);
	}

}
