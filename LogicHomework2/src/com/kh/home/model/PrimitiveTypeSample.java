package com.kh.home.model;

public class PrimitiveTypeSample {
	public void typeSize() {
		System.out.println("byte�� �޸� �Ҵ�ũ�� : "+Byte.BYTES);
		System.out.println("short�� �޸� �Ҵ�ũ�� : "+Short.BYTES);
		System.out.println("int�� �޸� �Ҵ�ũ�� : "+Integer.BYTES);
		System.out.println("long�� �޸� �Ҵ�ũ�� : "+Long.BYTES);
		System.out.println("double�� �޸� �Ҵ�ũ�� : "+Double.BYTES);
		System.out.println("float�� �޸� �Ҵ�ũ�� : "+Float.BYTES);
		System.out.println("char�� �޸� �Ҵ�ũ�� : "+Character.BYTES);
		//System.out.println("String�� �޸� �Ҵ�ũ�� : "+String.BYTES);//����
		//System.out.println("boolean�� �޸� �Ҵ�ũ�� : "+Boolean.BYTES);//����
	}
	public void minMaxValue() {
		System.out.println("�⺻�ڷ��� ���� �ּҰ�, �ִ밪 ����ϴ� ���� ����� �ʾҽ��ϴ�.");
		//����� �ʾ����� ���۸� ���
		System.out.println("Byte�� �ּҰ� : "+Byte.MIN_VALUE+"\n Byte�� �ִ밪 : "+Byte.MAX_VALUE);
		System.out.println("Short�� �ּҰ� : "+Short.MIN_VALUE+"\n Short�� �ִ밪 : "+Short.MAX_VALUE);
		System.out.println("Int�� �ּҰ� : "+Integer.MIN_VALUE+"\n Int�� �ִ밪 : "+Integer.MAX_VALUE);
		System.out.println("Long�� �ּҰ� : "+Long.MIN_VALUE+"\n byte�� �ִ밪 : "+Long.MAX_VALUE);
		System.out.println("Double�� �ּҰ� : "+Double.MIN_VALUE+"\n Double�� �ִ밪 : "+Double.MAX_VALUE);
		System.out.println("Float�� �ּҰ� : "+Float.MIN_VALUE+"\n Float�� �ִ밪 : "+Float.MAX_VALUE);
		System.out.println("Char�� �ּҰ� : "+Character.MIN_VALUE+"\n Char�� �ִ밪 : "+Character.MAX_VALUE);//�� �� �� ���� ���ڰ� �ߴ��� �𸣰ڽ��ϴ�.
		//System.out.println("String�� �޸� �Ҵ�ũ�� : "+String.BYTES+"\n String�� �ִ밪");//����
		//System.out.println("boolean�� �޸� �Ҵ�ũ�� : "+Boolean.BYTES+"\n boolean�� �ִ밪");//����
	}
	public void bitSize() {
		//1����Ʈ�� 8��Ʈ�ϱ� ���� ���ϱ� 8
		System.out.println("Byte�� ��Ʈ���� : "+Byte.BYTES*8);
		System.out.println("Short�� ��Ʈ���� : "+Short.BYTES*8);
		System.out.println("Integer�� ��Ʈ���� : "+Integer.BYTES*8);
		System.out.println("Long�� ��Ʈ���� : "+Long.BYTES*8);
		System.out.println("Double�� ��Ʈ���� : "+Double.BYTES*8);
		System.out.println("Float�� ��Ʈ���� : "+Float.BYTES*8);
		System.out.println("Character�� ��Ʈ���� : "+Character.BYTES*8);
		//System.out.println("byte�� ��Ʈ���� : "+Byte.BYTES*8);
		//System.out.println("byte�� ��Ʈ���� : "+Byte.BYTES*8);
	}
}
