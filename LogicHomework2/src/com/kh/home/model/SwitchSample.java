package com.kh.home.model;
import java.util.Scanner;
public class SwitchSample {
	Scanner sc = new Scanner(System.in);
	public void calculator() {
		System.out.print("���� �ϳ� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ٸ� ���� �ϳ� �Է� :");
		int num2 = sc.nextInt();
		System.out.print("���� ��ȣ �Է� (+,-,*,/,%) :");
		char op = sc.next().charAt(0);	
		switch(op) {
		case '+' : System.out.println(num1+" + "+num2+" = "+(num1+num2));;break;
		case '-' : System.out.println(num1+" - "+num2+" = "+(num1-num2));;break;
		case '*' : System.out.println(num1+" * "+num2+" = "+(num1*num2));;break;
		case '/' : System.out.println(num1+" / "+num2+" = "+(num1/num2));;break;
		case '%' : System.out.println(num1+" % "+num2+" = "+(num1%num2));;break;
		default : System.out.println("���� �����ȣ�Դϴ�.");break;
		}
	}
	public void fruitPrice() {
		System.out.println("���,�ٳ���,����,ü��,����");
		System.out.print("������ �˰� ���� ���� �̸��� �Է��ϼ��� : ");
		String fruit = sc.nextLine();
		int charge=0;
		switch(fruit) {
		case "���": charge = 3000;break;
		case "�ٳ���" : charge = 2000;break;
		case "����" : charge = 3500;break;
		case "ü��" : charge = 5000;break;
		case "����" : charge = 4500;break;
		default : System.out.println("�߸��Է��ϼ̽��ϴ�.");break;
		}
		System.out.println("\n"+fruit+"�� ������ "+charge+"���Դϴ�.");
	}
}
