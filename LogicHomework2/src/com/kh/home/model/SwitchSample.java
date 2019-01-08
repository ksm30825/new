package com.kh.home.model;
import java.util.Scanner;
public class SwitchSample {
	Scanner sc = new Scanner(System.in);
	public void calculator() {
		System.out.print("정수 하나 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("다른 정수 하나 입력 :");
		int num2 = sc.nextInt();
		System.out.print("연산 기호 입력 (+,-,*,/,%) :");
		char op = sc.next().charAt(0);	
		switch(op) {
		case '+' : System.out.println(num1+" + "+num2+" = "+(num1+num2));;break;
		case '-' : System.out.println(num1+" - "+num2+" = "+(num1-num2));;break;
		case '*' : System.out.println(num1+" * "+num2+" = "+(num1*num2));;break;
		case '/' : System.out.println(num1+" / "+num2+" = "+(num1/num2));;break;
		case '%' : System.out.println(num1+" % "+num2+" = "+(num1%num2));;break;
		default : System.out.println("없는 연산기호입니다.");break;
		}
	}
	public void fruitPrice() {
		System.out.println("사과,바나나,망고,체리,딸기");
		System.out.print("가격을 알고 싶은 과일 이름을 입력하세요 : ");
		String fruit = sc.nextLine();
		int charge=0;
		switch(fruit) {
		case "사과": charge = 3000;break;
		case "바나나" : charge = 2000;break;
		case "망고" : charge = 3500;break;
		case "체리" : charge = 5000;break;
		case "딸기" : charge = 4500;break;
		default : System.out.println("잘못입력하셨습니다.");break;
		}
		System.out.println("\n"+fruit+"의 가격은 "+charge+"원입니다.");
	}
}
