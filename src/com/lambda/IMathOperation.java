package com.lambda;

/*
 * �����ӿ�ָ����ֻ��һ�������Ľӿڣ�
 * �����Ľӿڿ�����ʽת��ΪLambda���ʽ
 * Ĭ�Ϸ����;�̬���������ƻ�����ʽ�ӿڵĶ���
 */
@FunctionalInterface
public interface IMathOperation {
	int operation(int a, int b);
	
	default int test(){;
	
	    return 10 ;
	}
}
