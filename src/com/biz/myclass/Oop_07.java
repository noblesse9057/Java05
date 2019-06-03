package com.biz.myclass;

public class Oop_07 {

	public static void main(String[] args) {

		String strNation = "대한민국";
		int intNum = 30;
		
		String strName = new String("홍길동");
		System.out.println(strName.length());
		// strNation.
		// intNum.

		Integer inum1 = new Integer(100);
		Integer inum2 = 100;
		Integer.valueOf("30");
		// class이름.valueOf(""); 바로사용할수 있음
		
		
		// Integer, Float, Double, Boolean 같은 
		// 클래스들은 기본형 변수의 기능을 모두 포함하고 있다.
		// 그래서 이런 클래스를 wrapper 클래스라고 한다.
		int a1 =0 ;
		Integer a11 = 0;
		Integer a111 = new Integer(0);
		
		float f1 = 0.0f;
		Float f11 = 0.0f;
		Float f111 = new Float(0.0f);
		
	
	}

}
