package com.kh.home.model;
public class NonStaticMethodSample {
	public void testScanner() {
		/*"1. Scanner Ŭ���� ��� : �ڷ��� �������� �� �Է¹޾� ����ϱ�\r\n"*/
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
		System.out.println("byte �Է� �� : "+bnum);
		System.out.println("short �Է� �� : "+snum);
		System.out.println("int �Է� �� : "+inum);
		System.out.println("long �Է� �� : "+lnum);
		System.out.println("double �Է� �� : "+dnum);
		System.out.println("float �Է� �� : "+fnum);
		System.out.println("char �Է� �� : "+ch);
		System.out.println("String �Է� �� : "+str);
	}
	public void testDate() {
		System.out.println("DataŬ������ ����� �ʾҽ��ϴ�.");
		/*int year = new java.util.Date().getYear();
		int month = new java.util.Date().getMonth();
		�� �� ���� ���� �߻�*/
		int date = new java.util.Date().getDate();
		int  hours = new java.util.Date().getHours();
		int  minutes = new java.util.Date().getMinutes();
		System.out.println(/*year+"�� "+month+"�� "+*/date+"�� "+hours+"�� "+minutes+"��");
	}
	public void testRandom() {
		double ranD = new java.util.Random().nextInt();
		int ranI = new java.util.Random().nextInt();
		System.out.println("������ ���� ���� (��������x) : "+ranI);
		System.out.println("�Ǽ��� ���� ���� : "+ranD);
	}
}
