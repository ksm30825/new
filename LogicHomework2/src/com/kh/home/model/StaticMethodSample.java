package com.kh.home.model;

public class StaticMethodSample {
	public void testMathRandom() {
		int num=(int)(Math.random()*45+1);
		System.out.println("1���� 45������ ������ ���� : "+num);
	}
	public void testMathAbs() {
		double num = Math.abs(-12.77);
		System.out.println("-12.77�� ���밪 : "+num);
	}
	public void testMathMax() {
		System.out.println("MathŬ�������� �� ���� ���� ū�� ���ϴ� �޼ҵ� ȣ�� ����� ����� �ʾҽ��ϴ�.");
		int max= Math.max(120,54);
		System.out.println("120�� 54�� ū �� : "+max);
	}
}
