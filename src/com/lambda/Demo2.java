package com.lambda;

/*
 * 
 */
public class Demo2 {

	public static void main(String[] args) {
		// ��������
		IMathOperation m1 = (int a,int b) ->  a + b ; // һ���� new ���� ��д����
		
		int num1 = m1.operation(12, 5);
		
		// ������������
		IMathOperation m2 = (a,b) ->  a + b ;
		/* ���Lambda���ʽ�е�����ֻ��һ�У�
		 * ����Բ���ʹ��return���
		 * �����з���ֵҪreturn
		 */
		IMathOperation m3 = (a,b) -> {
			 int num = a + b ;
			     num++;
			 return num ;
		};
		System.out.println(m3.operation(12, 1));
	}

}
