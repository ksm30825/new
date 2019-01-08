package com.kh.home.model;
public class NonStaticMethodSample {
	public void testScanner() {
		/*"1. Scanner 클래스 사용 : 자료형 종류별로 값 입력받아 출력하기\r\n"*/
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.print("byte : ");
		byte bnum= sc.nextByte();
		System.out.print("short : ");
		short snum = sc.nextShort();
		System.out.print("int : ");
		int inum = sc.nextInt();
		System.out.print("long : ");
		long lnum = sc.nextLong();
		System.out.print("double : ");
		double dnum = sc.nextDouble();
		System.out.print("float : ");
		float fnum = sc.nextFloat();
		System.out.print("char : ");
		char ch = sc.next().charAt(0);
		sc.nextLine();
		System.out.print("String : ");
		String str = sc.nextLine();
		System.out.println("byte 입력 값 : "+bnum);
		System.out.println("short 입력 값 : "+snum);
		System.out.println("int 입력 값 : "+inum);
		System.out.println("long 입력 값 : "+lnum);
		System.out.println("double 입력 값 : "+dnum);
		System.out.println("float 입력 값 : "+fnum);
		System.out.println("char 입력 값 : "+ch);
		System.out.println("String 입력 값 : "+str);
	}
	public void testDate() {
		System.out.println("Data클래스를 배우지 않았습니다.");
		/*int year = new java.util.Date().getYear();
		int month = new java.util.Date().getMonth();
		알 수 없는 숫자 발생*/
		int date = new java.util.Date().getDate();
		int  hours = new java.util.Date().getHours();
		int  minutes = new java.util.Date().getMinutes();
		System.out.println(/*year+"년 "+month+"월 "+*/date+"일 "+hours+"시 "+minutes+"분");
	}
	public void testRandom() {
		double ranD = new java.util.Random().nextInt();
		int ranI = new java.util.Random().nextInt();
		System.out.println("정수에 대한 난수 (범위지정x) : "+ranI);
		System.out.println("실수에 대한 난수 : "+ranD);
	}
}
