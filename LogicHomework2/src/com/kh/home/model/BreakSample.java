package com.kh.home.model;

public class BreakSample {
	public void sumBreak() {
		int sum=0;
		for(int i=1;;i++){
			sum+=i;
			if(i==100)break;
		}
		System.out.println(sum);
	}
	public void guguDanBreak() {
		for(int dan=1;dan<10;dan++){
			for(int su=1;su<10;su++){
			if(su==5)break;
			System.out.println(dan+" * "+su+" = "+(dan*su));
			}
			System.out.println();
		}
	}
	
}
