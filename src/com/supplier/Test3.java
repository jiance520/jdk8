package com.supplier;

import java.util.*;

public class Test3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++){
        	int rd = (int)(Math.random()*100);
        	list.add(rd);
        }
        
        // lambdaд��
     	/*list.forEach(e -> {
     		System.out.println(" num = "+e);
     	});*/
     	
        //��̬�������� :�Զ� �� 
        list.forEach(Person::showNum);
	}

}
