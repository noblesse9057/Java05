package com.biz.var;

public class Var_03 {

	public static void main(String[] args) {

		float fNum1 = 0;
		float fNum2 = 0;
		
		int intNum1 = 30;
		int intNum2 = 40;
		
		// ����+������ �Ǽ��� ������ �����ϸ�
		// �ڵ����� �Ǽ������� ��ȯ�Ǿ� ����ȴ�.
		fNum1 = intNum1 + intNum2;
		System.out.println(fNum1);
		
		// ����+�Ǽ��� �Ǽ��������� ������ �ϸ�
		// �ڵ����� �Ǽ������� ��ȯ�Ǿ� ����ȴ�.
		fNum1 = intNum1 + fNum2;
		// �Ǽ�+������ ������ ������ ������ �Ϸ��� 
		// �����Ǽ����� ���������� ���� ����ȯ �ؾ��Ѵ�.
		intNum2 =(int) fNum1+ intNum1;
		
		
		
		
	}

}
