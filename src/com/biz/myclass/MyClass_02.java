package com.biz.myclass;

public class MyClass_02 {
	
	// MyClass_02�� �������
	public int num1 = 0;
	public int num2 = 0;
	
	// void�� �޼���
	// void�� �޼���� ���� return�� �����Ѵ�
	// ���� return�� ����Ϸ��� �ƹ��� ���� ���� ����Ѵ�.
	public void add() {
		System.out.println(num1 + num2);
		return ;
	}
	// return type�� �ִ� �޼��� 
	// return type�� �ִ� �޼���� �ݵ�� return���� �־�� �Ѵ�.
	// return�Ǵ� ���������� return type�� ��ġ�ؾ��Ѵ�.
	// ���� ȣ���Ѱ����� return�Ǵ� ���� ����Ϸ���
	// ����type�� ������ �޾ƾ� �Ѵ�
		public String add(int num1, int num2) {
		//System.out.println(num1 + num2);
		return ""+ (num1 + num2);
	}
	
	public String add(String s1, String s2) {
		return s1+ s2;
	}
	
	public float add(float f1, float f2) {
		return f1+ f2;
	}
	
	public void times() {
		System.out.println(num1 * num2);
		return ;
	}
	public void minus() {
		System.out.println(num1 - num2);
		return ;
	}


	
}
