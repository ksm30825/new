package com.kh.home.model;
import java.util.Scanner;
import java.util.Random;
public class WhileSample {
	Scanner sc = new Scanner(System.in);
	public void printUniCode() {
		char ch=' ';
		while(ch!='0') {
			System.out.print("���� �ϳ� �Է��ϼ��� : ");
			ch = sc.next().charAt(0);
			int intch = (int)ch;
			System.out.println(intch);
		}
	}
	public void sum1To100() {
		int i=0;
		int sum=0;
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println("1���� 100������ �������� �� : "+sum);
	}
	public void numberGame() {
		int random = new Random().nextInt(100)+1;
		int num = 0;
		while(num!=random) {
			System.out.print("�� �Է� : ");
			num=sc.nextInt();
			if(num!=random) {
				System.out.println("Ʋ���̽��ϴ�.");
				if(num>random) {
					System.out.println("�Է��� ������ �۽��ϴ�.");
				}else {
					System.out.println("�Է��� ������ Ů�ϴ�.");
				}
			}
		}System.out.println("���߼̽��ϴ�.");
		sc.nextLine();
	}
	public void countCharacter() {
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		int index=0;
		while(index<str.length()) {
			index++;
		}System.out.print("�Է��Ͻ� ���ڿ��� ���ڰ����� "+index+"�� �Դϴ�.");
	}
	public void countInChar() {
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str= sc.nextLine();
		System.out.print("���ڸ� �Է��ϼ��� : ");
		char ch= sc.next().charAt(0);
		int index=0;
		int count=0;
		while(index<str.length()) {
			char ch2=str.charAt(index);
			if(ch2==ch) {
				count+=1;
			}
			index++;
		}System.out.println("���ڿ����� "+ch+"�� ������ "+count+"�� �Դϴ�.");
	}
}
