package com.biz.myclass;

public class Oop_09 {

	public static void main(String[] args) {

		MyClass_02 mc = new MyClass_02();//mc라는 객체가 생성되고
		
		mc.num1 =30;					 // 변수객체셋팅
		mc.num2 = 50;
		mc.add(); //멤버변수를 참조	     //add라는 메서드를 호출
		
		int ret = Integer.valueOf(mc.add(50, 20));
		System.out.println(ret);
		
		System.out.println(mc.add(100, 200));
		mc.times();
		mc.minus();
		
		
	}

}
