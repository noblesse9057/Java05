package com.biz.myclass;

public class Oop_09 {

	public static void main(String[] args) {

		MyClass_02 mc = new MyClass_02();//mc��� ��ü�� �����ǰ�
		
		mc.num1 =30;					 // ������ü����
		mc.num2 = 50;
		mc.add(); //��������� ����	     //add��� �޼��带 ȣ��
		
		int ret = Integer.valueOf(mc.add(50, 20));
		System.out.println(ret);
		
		System.out.println(mc.add(100, 200));
		mc.times();
		mc.minus();
		
		
	}

}
