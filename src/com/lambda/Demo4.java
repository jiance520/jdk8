package com.lambda;

public class Demo4 {

	public static int num2 = 10 ;
	
	public static void main(String[] args) {
		/*
		 * �� Lambda ���ʽ���в���������һ����ֲ�����ͬ���Ĳ������߾ֲ�������
		 * ambda ���ʽ�����������ֲ�������
		 * ���ǲ����� lambda �ڲ��޸Ķ���������ľֲ������������������
		 * ��ð����õ����ֲ��������Ϊ final 
		 */
		int num = 10 ;
		final int num3 = 40 ;
		IGreetingService  g1 = (e) -> {
			//int num = 20 ;
			//System.out.println(e+"---"+num++);
			System.out.println(e+"---"+num3);
		} ;

		g1.sayMessage("hello world");
	}

}
