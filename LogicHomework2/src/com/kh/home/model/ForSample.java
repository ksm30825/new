package com.kh.home.model;
import java.util.Scanner;
public class ForSample {
	Scanner sc = new Scanner(System.in);
	public void sum1To10() {
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}System.out.println(sum);
	}
	public void sumEven1To100() {
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}System.out.println(sum);
	}
	public void oneGugudan() {
		System.out.print("정수 입력 :");
		int num= sc.nextInt();
		for(int su=1;su<10;su++) {
			System.out.println(num+" * "+su+ " = "+ (num*su));
		}
	}
	public void sumMinToMax() {
		System.out.print("첫번째수 입력 : ");
		int num1= sc.nextInt();
		System.out.print("두번째수 입력 : ");
		int num2= sc.nextInt();
		int sum=0;
		if(num1>=num2) {
			for(int i=num2;i<=num1;i++) {
				sum+=i;
			}
			System.out.println(num2+"부터 "+num1+"까지의 합 : "+sum);
		}else {
			for(int i=num1;i<=num2;i++) {
				sum+=i;
			}
			System.out.println(num1+"부터 "+num2+"까지의 합 : "+sum);
		}
	}
	public void printStar() {
		System.out.print("줄 수 입력 : ");
		int row = sc.nextInt();
		System.out.print("칸 수 입력 : ");
		int col = sc.nextInt();
		for(int r=1;r<=row;r++) {
			for(int c=1;c<=col;c++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	public void printNumberStar() {
		for(int r=1;r<=7;r++) {
			for(int c=1;c<=7;c++) {
				if(r==c) {
					System.out.print(r);
				}else {
					System.out.print("*");
				}
			}System.out.println();
		}
	}
	public void printTriangleStar() {
		System.out.print("줄 수 입력 : ");
		int row = sc.nextInt();
		if(row>0) {
			for(int r=1;r<=row;r++) {
				for(int c=1;c<=row;c++) {
					if(r==c) {
						System.out.print("*");
					}else if(r>c){
						System.out.print("*");
					}else {
						System.out.print("");
					}
				}System.out.println();
			}
		}else if(row<0) {
			row = Math.abs(row);
			int col = row;
			for(int r=1;r<=row;r++) {
				for(int c=1;c<=col;c++) {
					System.out.print("*");
				}
				col--;
				System.out.println();
			}
		}
	}
	public void guguDan() {
		for(int dan=2;dan<10;dan++) {
			for(int su=1;su<10;su++) {
				System.out.println(dan+" * "+su+ " = "+ (dan*su));
			}System.out.println();
		}
	}
}
