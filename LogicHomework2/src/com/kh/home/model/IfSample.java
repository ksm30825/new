package com.kh.home.model;
import java.util.Scanner;
public class IfSample {
	Scanner sc = new Scanner(System.in);
	public void maxNumber() {
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		/* ���׿����� �̿� �ڵ�
		 * int maximum = (num1>=num2)?num1:num2;
		System.out.println("�ִ밪 : "+maximum);*/
		if(num1>num2) {
			System.out.println("�ִ밪 : "+num1);
		}
		if(num1<num2) {
			System.out.println("�ִ밪 : "+num2);
		}
		if(num1==num2) {
			System.out.println("�� ������ �����ϴ�.");
		}
	}
	/* MathŬ������ �̿��ؼ� ���� �� ������ �ڵ� ����
	 * public void maxNumber() {
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
			System.out.println("�ִ밪 : "+Math.max(num1, num2));
	}*/
	public void minNumber() {
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		/*���׿����� �̿�
		 * int minimum = (num1>=num2)?num2:num1;
		System.out.println("�ּҰ� : "+minimum);*/
		if(num1>num2) {
			System.out.println("�ּҰ� : "+num2);
		}
		if(num1<num2) {
			System.out.println("�ּҰ� : "+num1);
			
		}else {
			System.out.println("�� ���� �����ϴ�.");
		}
	}
	/* MathŬ������ �̿��Ͽ� ���� �� ������ �ڵ� ����
	 * public void minNumber() {
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
			System.out.println("�ּҰ� : "+Math.min(num1, num2));
	}*/
	public void threeMaxMin() {
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		System.out.print("����° ������ �Է��ϼ��� : ");
		int num3 = sc.nextInt();
		/*//�ߺ����׿����� �̿��ؼ� �����ϰ� �ڵ� ¥��
		int maximum = (num1>=num2)?((num1>=num3)?num1:num3):((num2>=num3)?num2:num3);
		System.out.println("�ִ밪 : "+maximum);
		int minimum = (num1>=num2)?((num2>=num3)?num3:num2):((num1>=num3)?num3:num1);
		System.out.println("�ּҰ� : "+minimum);*/
		if(num1>num2&&num1>num3) {
			if(num2>num3) {
				System.out.println("�ִ밪 : "+num1+"\n�ּҰ� : "+num3);
			}
			else if(num2<num3){
				System.out.println("�ִ밪 : "+num1+"\n�ּҰ� : "+num2);
			}
		}
		if(num2>num1&&num2>num3) {
			if(num1>num3) {
				System.out.println("�ִ밪 : "+num2+"\n�ּҰ� : "+num3);
			}
			else if(num1<num3){
				System.out.println("�ִ밪 : "+num2+"\n�ּҰ� : "+num1);
			}
		}
		if(num3>num1&&num3>num2) {
			if(num1>num2) {
				System.out.println("�ִ밪 : "+num3+"\n�ּҰ� : "+num2);
			}
			else if(num1<num2){
				System.out.println("�ִ밪 : "+num3+"\n�ּҰ� : "+num1);
			}
		}
	}
	public void checkEven() {
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("�Է��Ͻ� ������ ¦���Դϴ�.");
		}else {
			System.out.println("�Է��Ͻ� ������ Ȧ���Դϴ�.");
		}
	}
	public void isPassFail() {
		System.out.println("�� ������ 40�� �̻��̰� ����� 60�� �̻��̸� �հ��Դϴ�.");
		System.out.print("���� ���� : ");
		int kor = sc.nextInt();
		System.out.print("���� ���� : ");
		int eng = sc.nextInt();
		System.out.print("���� ���� : ");
		int math = sc.nextInt();
		int sum=kor+eng+math;
		double avg = sum/3;
		if(avg<60) {
			if(kor<40&&eng<40&&math<40) {
				System.out.print("��� �̴�, ������ 40�� �̸� : ���հ�");
			}else {
				System.out.println("��չ̴� : ���հ�");
			}
		}else {
			if(kor<40||eng<40||math<40) {
				System.out.print("�Ѱ��� 40�� �̸� : ���հ�");
			}else if(kor>=40&&eng>=40&&math>=40) {
				
				System.out.println("��� 60���̻�, ������ 40�� �̻� :�հ�");
			}
		}
	}
	public void scoreGrade() {
		System.out.print("������ �Է��ϼ��� : ");
		int grade = sc.nextInt();
		String level="";
		//char�����δ� ���� �ƽ�Ű�ڵ尪�� +������ �Ѵ�.
		if(grade>=90) {
			level = "A";
			if(grade>=95) {
				level+="+";
			}
		}else if(grade>=80) {
			level = "B";
			if(grade>=85) {
				level+="+";
			}
		}else if(grade>=70) {
			level = "C";
			if(grade>=75) {
				level+="+";
			}
		}else if(grade>=60) {
			level = "D";
			if(grade>=65) {
				level+="+";
			}
		}else {
			level = "F";
		}
		System.out.println("���� : "+grade+"\n���� : "+level);
	}
	public void checkPlusMinusZero() {
		System.out.print("���� �Է� : ");
		int num=sc.nextInt();
		if(num>0) {
			System.out.println("�Է��Ͻ� ������ ����Դϴ�.");
		}else if(num<0) {
			System.out.println("�Է��Ͻ� ������ �����Դϴ�.");
		}else {
			System.out.println("�Է��Ͻ� ������ 0�Դϴ�.");
		}
	}
	public void whatCaracter() {
		System.out.print("���� �ϳ� �Է� : ");
		char ch = sc.next().charAt(0);
		if(ch>='A'&&ch<='Z') {
			System.out.println("�Է��Ͻ� ���ڴ� ���� �빮�� �Դϴ�.");
		}else if(ch>='a'&&ch<='z') {
			System.out.println("�Է��Ͻ� ���ڴ� ���� �ҹ��� �Դϴ�.");
		}else if(ch>='0'&&ch<='9') {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
		}else {
			System.out.println("�Է��Ͻ� ���ڴ� ����, ���ڰ� �ƴ� ��Ÿ�����Դϴ�.");
		}
	}
}
