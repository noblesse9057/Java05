package com.biz.algo;

import java.util.Random;

public class Star_04 {

	public static void main(String[] args) {

		int intNum = 0 ;
		// Random type�� ������ ����
		// Random type�� ������ �ʱ�ȭ�� �ϴµ�
		// new ��� Ű���带 �̿��ؼ� �ʱ�ȭ�� �Ѵ�
		Random rnd = new Random();
		// Random type�� �̿��ؼ� ������ rnd��� ������
		// Random type���� �����ϴ� �پ��� ��ɵ��� �����ϴ�
		// Ư���� ������ �ȴ�.
		// �̷��� �������� ��ü��� �Ѵ�.
		// 		�Ǵ� �ν��Ͻ� ����Ѵ�.
		intNum = rnd.nextInt(10);
		
		System.out.println(intNum);
		
		for(int i = 1; i <= intNum + 1;i++) {
			for(int j =1; j<=i ; j++) {
				System.out.println("* ");
			}
		}System.out.println();
	}

}
