package com.lambda;

/*
 * �����ӿ�ָ����ֻ��һ�������Ľӿڣ�
 * �����Ľӿڿ�����ʽת��ΪLambda���ʽ
 * Ĭ�Ϸ����;�̬���������ƻ�����ʽ�ӿڵĶ���
 */
@FunctionalInterface
public interface IGreetingService {
	void sayMessage(String message);
}
