package com.lambda;

import java.util.*;

/*
Lambda 表达式，也可称为闭包，它是推动 Java 8 发布的最重要新特性。
Lambda 允许把函数作为一个方法的参数（函数作为参数传递进方法中）。
使用 Lambda 表达式可以使代码变的更加简洁紧凑。
语法
lambda 表达式的语法格式如下：
(parameters) -> expression
或
(parameters) ->{ statements; }
以下是lambda表达式的重要特征:
可选类型声明：不需要声明参数类型，编译器可以统一识别参数值。
可选的参数圆括号：一个参数无需定义圆括号，但多个参数需要定义圆括号。
可选的大括号：如果主体包含了一个语句，就不需要使用大括号。
可选的返回关键字：如果主体只有一个表达式返回值则编译器会自动返回值，
大括号需要指定明表达式返回了一个数值
 */
public class Demo1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList();
		
		for(int i = 0;i<5;i++){
			list.add(i);
		}
		//System.out.println(list);
		// for each
		/*for(int i:list){
			System.out.println(i+1);
		}*/
		
		//list.forEach(e -> System.out.println(e));
		
		// lambda写法
		list.forEach(e -> {
			int num = e + 1;
			System.out.println(num);
		});
		
	}

}
