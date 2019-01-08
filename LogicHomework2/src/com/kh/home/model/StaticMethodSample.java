package com.kh.home.model;

public class StaticMethodSample {
	public void testMathRandom() {
		int num=(int)(Math.random()*45+1);
		System.out.println("1에서 45사이의 임의의 난수 : "+num);
	}
	public void testMathAbs() {
		double num = Math.abs(-12.77);
		System.out.println("-12.77의 절대값 : "+num);
	}
	public void testMathMax() {
		System.out.println("Math클래스에서 두 수중 가장 큰값 구하는 메소드 호출 방식을 배우지 않았습니다.");
		int max= Math.max(120,54);
		System.out.println("120과 54중 큰 값 : "+max);
	}
}
