package com.lambda;

import java.util.*;

/*
Lambda ���ʽ��Ҳ�ɳ�Ϊ�հ��������ƶ� Java 8 ����������Ҫ�����ԡ�
Lambda ����Ѻ�����Ϊһ�������Ĳ�����������Ϊ�������ݽ������У���
ʹ�� Lambda ���ʽ����ʹ�����ĸ��Ӽ����ա�
�﷨
lambda ���ʽ���﷨��ʽ���£�
(parameters) -> expression
��
(parameters) ->{ statements; }
������lambda���ʽ����Ҫ����:
��ѡ��������������Ҫ�����������ͣ�����������ͳһʶ�����ֵ��
��ѡ�Ĳ���Բ���ţ�һ���������趨��Բ���ţ������������Ҫ����Բ���š�
��ѡ�Ĵ����ţ�������������һ����䣬�Ͳ���Ҫʹ�ô����š�
��ѡ�ķ��عؼ��֣��������ֻ��һ�����ʽ����ֵ����������Զ�����ֵ��
��������Ҫָ�������ʽ������һ����ֵ
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
		
		// lambdaд��
		list.forEach(e -> {
			int num = e + 1;
			System.out.println(num);
		});
		
	}

}
