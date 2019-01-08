package com.kh.home.model;
import java.util.Scanner;
import java.util.Random;
public class WhileSample {
	Scanner sc = new Scanner(System.in);
	public void printUniCode() {
		char ch=' ';
		while(ch!='0') {
			System.out.print("문자 하나 입력하세요 : ");
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
		System.out.println("1부터 100까지의 정수들의 합 : "+sum);
	}
	public void numberGame() {
		int random = new Random().nextInt(100)+1;
		int num = 0;
		while(num!=random) {
			System.out.print("수 입력 : ");
			num=sc.nextInt();
			if(num!=random) {
				System.out.println("틀리셨습니다.");
				if(num>random) {
					System.out.println("입력한 값보다 작습니다.");
				}else {
					System.out.println("입력한 값보다 큽니다.");
				}
			}
		}System.out.println("맞추셨습니다.");
		sc.nextLine();
	}
	public void countCharacter() {
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		int index=0;
		while(index<str.length()) {
			index++;
		}System.out.print("입력하신 문자열의 글자갯수는 "+index+"개 입니다.");
	}
	public void countInChar() {
		System.out.print("문자열을 입력하세요 : ");
		String str= sc.nextLine();
		System.out.print("문자를 입력하세요 : ");
		char ch= sc.next().charAt(0);
		int index=0;
		int count=0;
		while(index<str.length()) {
			char ch2=str.charAt(index);
			if(ch2==ch) {
				count+=1;
			}
			index++;
		}System.out.println("문자열에서 "+ch+"의 갯수는 "+count+"개 입니다.");
	}
}
