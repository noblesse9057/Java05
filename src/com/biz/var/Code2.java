package com.biz.var;

public class Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  for(int i = 2; i <=100;i++){
			   for(int j = 2; j <= i ; j++){
			    if(i !=j && i % j ==0)break;
			    if(i == j){
			     System.out.println(i + "는 소수입니다 ");
			    }
			   }
			  }

			 }

			

}
