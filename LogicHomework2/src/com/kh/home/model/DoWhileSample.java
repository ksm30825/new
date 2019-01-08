package com.kh.home.model;
import java.util.Scanner;
public class DoWhileSample {
	Scanner sc = new Scanner(System.in);
	public void addDashToken() {
		/*System.out.print("문자열 입력 : ");
		String str=sc.nextLine();
		int index=0;
		do {
			
		}while(index<str.length());*/
		System.out.println("문자사이에 다른 문자, 글자 끼워넣는것을 안배운것 같습니다.");
	}
	public void burgerKingMenu() {
		String menu = "";
		int charge = 0;
		int pay=0;
		int amount=0;
		int totalPay=0;
		String totalMenu="";
		do {
			System.out.println("=======Menu======");
			System.out.println("1.불고기버거 ---1000원");
			System.out.println("2.새우버거 -----1000원");
			System.out.println("3.데리버거 -----1000원");
			System.out.println("4.치즈버거 -----1000원");
			System.out.println("5.콜라 --------1000원");
			System.out.println("6.레몬에이드 ---1000원");
			System.out.println("7.커피 --------1000원");
			System.out.print("메뉴 번호 입력 : ");
			int menuNum = sc.nextInt();
			switch(menuNum) {
			case 1 : menu="불고기버거";charge=1000;break;
			case 2 : menu="새우버거";charge=2000;break;
			case 3 : menu="데리버거";charge=1500;break;
			case 4 : menu="치즈버거";charge=2500;break;
			case 5 : menu="콜라";charge=500;break;
			case 6 : menu="레몬에이드";charge=1500;break;
			case 7 : menu="커피";charge=1000;break;
			}
			System.out.print("수량 입력 : ");
			amount=sc.nextInt();
			pay=charge*amount;
			totalPay+=pay;
			totalMenu+=menu+" : "+amount+"개 = "+pay+"원\n";
			System.out.print("추가주문하시겠습니까? (Y/N) : ");
			char ans=sc.next().charAt(0);
			if(ans=='n'||ans=='N')break;
		}while(true);
		System.out.println("=================");
		System.out.println(totalMenu);
		System.out.println("=================");
		System.out.println("총 금액 -----"+totalPay+"원");
		//프로그램 종료를 이전메뉴로 이동 이라는 말이 이해 안갑니다.
		//출력하지 않고 이전메뉴로 가란 말씀이신지..?
	}
	public void isStringAlphabet() {
		System.out.println("모르겠어요..");
		/*System.out.print("문자열 입력 : ");
		String str=sc.nextLine();
		int i=0;
		do {
			char ch= str.charAt(i);
			if(ch<'A'||ch>'Z'&&ch<'a'||ch>'z') {
				break;
			}
			i++;
		}while(i<str.length());
		System.out.println("모든 글자가 영문자입니다.");
		System.out.println("모든 글자가 영문자가 아니다.");*/
	}

}
