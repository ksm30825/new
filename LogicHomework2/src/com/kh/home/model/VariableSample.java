package com.kh.home.model;
import java.util.Scanner;
public class VariableSample {
	Scanner sc = new Scanner(System.in);
	byte b;
	short s;
	int i;
	long l;
	double d;
	float f;
	char c;
	String str;
	public void  myProfile() {
		String name = "�����";
		int age = 31;
		double height = 152.3;
		System.out.println(name+"�� "+age+"���̸�, Ű�� "+height+"cm�Դϴ�.");
	}
	public void empInformation() {
		System.out.println("====�������====");
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.print("�б��� �Է��ϼ��� : ");
		String school = sc.nextLine();
		System.out.print("������ �Է��ϼ��� (F/M) : ");
		char gender = sc.next().charAt(0);
		sc.nextLine();
		String changeGender=(gender=='f'||gender=='F')?"����":"����";
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		System.out.println(changeGender+" "+name+"���� "+school+"�б� ����̰�, "+age+"�� �Դϴ�.");
		sc.nextLine();
	}
	public void defaultValue() {
		System.out.println("byte�� �ʱⰪ : "+b);
		System.out.println("short�� �ʱⰪ : "+s);
		System.out.println("int�� �ʱⰪ : "+i);
		System.out.println("long�� �ʱⰪ : "+l);
		System.out.println("double�� �ʱⰪ : "+d);
		System.out.println("float�� �ʱⰪ : "+f);
		System.out.println("char�� �ʱⰪ : "+c);
		System.out.println("string �ʱⰪ : "+str);
	}

}
