package com.kh.home.model;

public class ContinueSample {
	public void sumJumpThree() {
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%3==0)continue;
			sum+=i;
		}
		System.out.println("1부터 100까지 3의 배수를 뺀 합계 : "+sum);
	}
	public void rowColJump() {
		for(int r=1;r<=3;r++) {
			for(int c=1;c<=5;c++) {
				if(r==1) {
					if(c>=3&&c<=5)continue;
				}
				System.out.print(c);
			}System.out.println();
		}
	}
}
