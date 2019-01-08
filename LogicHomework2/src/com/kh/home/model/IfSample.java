package com.kh.home.model;
import java.util.Scanner;
public class IfSample {
	Scanner sc = new Scanner(System.in);
	public void maxNumber() {
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		/* 삼항연산자 이용 코드
		 * int maximum = (num1>=num2)?num1:num2;
		System.out.println("최대값 : "+maximum);*/
		if(num1>num2) {
			System.out.println("최대값 : "+num1);
		}
		if(num1<num2) {
			System.out.println("최대값 : "+num2);
		}
		if(num1==num2) {
			System.out.println("두 정수는 같습니다.");
		}
	}
	/* Math클래스를 이용해서 비교적 더 간단한 코딩 가능
	 * public void maxNumber() {
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
			System.out.println("최대값 : "+Math.max(num1, num2));
	}*/
	public void minNumber() {
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		/*삼항연산자 이용
		 * int minimum = (num1>=num2)?num2:num1;
		System.out.println("최소값 : "+minimum);*/
		if(num1>num2) {
			System.out.println("최소값 : "+num2);
		}
		if(num1<num2) {
			System.out.println("최소값 : "+num1);
			
		}else {
			System.out.println("두 수는 같습니다.");
		}
	}
	/* Math클래스를 이용하여 비교적 더 간단한 코딩 가능
	 * public void minNumber() {
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
			System.out.println("최소값 : "+Math.min(num1, num2));
	}*/
	public void threeMaxMin() {
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 정수를 입력하세요 : ");
		int num3 = sc.nextInt();
		/*//중복삼항연산자 이용해서 간단하게 코드 짜기
		int maximum = (num1>=num2)?((num1>=num3)?num1:num3):((num2>=num3)?num2:num3);
		System.out.println("최대값 : "+maximum);
		int minimum = (num1>=num2)?((num2>=num3)?num3:num2):((num1>=num3)?num3:num1);
		System.out.println("최소값 : "+minimum);*/
		if(num1>num2&&num1>num3) {
			if(num2>num3) {
				System.out.println("최대값 : "+num1+"\n최소값 : "+num3);
			}
			else if(num2<num3){
				System.out.println("최대값 : "+num1+"\n최소값 : "+num2);
			}
		}
		if(num2>num1&&num2>num3) {
			if(num1>num3) {
				System.out.println("최대값 : "+num2+"\n최소값 : "+num3);
			}
			else if(num1<num3){
				System.out.println("최대값 : "+num2+"\n최소값 : "+num1);
			}
		}
		if(num3>num1&&num3>num2) {
			if(num1>num2) {
				System.out.println("최대값 : "+num3+"\n최소값 : "+num2);
			}
			else if(num1<num2){
				System.out.println("최대값 : "+num3+"\n최소값 : "+num1);
			}
		}
	}
	public void checkEven() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("입력하신 정수는 짝수입니다.");
		}else {
			System.out.println("입력하신 정수는 홀수입니다.");
		}
	}
	public void isPassFail() {
		System.out.println("각 과목이 40점 이상이고 평균이 60점 이상이면 합격입니다.");
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		int sum=kor+eng+math;
		double avg = sum/3;
		if(avg<60) {
			if(kor<40&&eng<40&&math<40) {
				System.out.print("평균 미달, 세과목 40점 미만 : 불합격");
			}else {
				System.out.println("평균미달 : 불합격");
			}
		}else {
			if(kor<40||eng<40||math<40) {
				System.out.print("한과목 40점 미만 : 불합격");
			}else if(kor>=40&&eng>=40&&math>=40) {
				
				System.out.println("평균 60점이상, 세과목 40점 이상 :합격");
			}
		}
	}
	public void scoreGrade() {
		System.out.print("점수를 입력하세요 : ");
		int grade = sc.nextInt();
		String level="";
		//char형으로는 문자 아스키코드값에 +연산을 한다.
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
		System.out.println("점수 : "+grade+"\n학점 : "+level);
	}
	public void checkPlusMinusZero() {
		System.out.print("정수 입력 : ");
		int num=sc.nextInt();
		if(num>0) {
			System.out.println("입력하신 정수는 양수입니다.");
		}else if(num<0) {
			System.out.println("입력하신 정수는 음수입니다.");
		}else {
			System.out.println("입력하신 정수는 0입니다.");
		}
	}
	public void whatCaracter() {
		System.out.print("문자 하나 입력 : ");
		char ch = sc.next().charAt(0);
		if(ch>='A'&&ch<='Z') {
			System.out.println("입력하신 문자는 영어 대문자 입니다.");
		}else if(ch>='a'&&ch<='z') {
			System.out.println("입력하신 문자는 영어 소문자 입니다.");
		}else if(ch>='0'&&ch<='9') {
			System.out.println("입력하신 문자는 숫자입니다.");
		}else {
			System.out.println("입력하신 문자는 영어, 숫자가 아닌 기타문자입니다.");
		}
	}
}
