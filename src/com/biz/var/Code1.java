package com.biz.var;

public class Code1 {

	public static void main(String[] args) {
			// ���� i �� 9�ΰ��
			for(int i =2; i<=100; i++) {
				

				int index = 2;
				for(index = 2; index<i; index++) {
					// index�� 3�� �Ǵ� ���
					// 9%3 == 0�� ���ǹ��� true�� �ǰ�
					// 9%4 ���Ĵ� ����� �ʿ䰡 ����.
					if(i%index==0) {
						break;
				}
			} if (index >= i) {
				System.out.println(i + "�� �Ҽ��Դϴ�");
			}
				// break ���� ����Ǵ� ��
				// i ���� �Ҽ��̸�
				//		index >= i
				// i���� �Ҽ��� �ƴϸ�
				//		index <  i
		}
	}

}


