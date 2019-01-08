package com.kh.home.view;
import com.kh.home.model.VariableSample;
import com.kh.home.model.PrimitiveTypeSample;
import com.kh.home.model.IfSample;
import com.kh.home.model.SwitchSample;
import com.kh.home.model.ForSample;
import com.kh.home.model.WhileSample;
import com.kh.home.model.DoWhileSample;
import com.kh.home.model.BreakSample;
import com.kh.home.model.ContinueSample;
import com.kh.home.model.StaticMethodSample;
import com.kh.home.model.NonStaticMethodSample;
import java.util.Scanner;
public class Menu {
	static Scanner sc= new Scanner(System.in);
	public static void mainMenu() {
		label:
		do{
			System.out.print("\n***** 프로그래밍 기본 기능 테스트 프로그램 *****\r\n" + 
					"\r\n" + 
					"1. 변수 테스트\r\n" + 
					"2. 기본 자료형 테스트\r\n" + 
					"3. if문 테스트\r\n" + 
					"4. switch문 테스트\r\n" + 
					"5. for문 테스트\r\n" + 
					"6. while문 테스트\r\n" + 
					"7. do~while문 테스트\r\n" + 
					"8. break문 테스트\r\n" + 
					"9. continue문 테스트\r\n" + 
					"10. static 메소드 사용 테스트\r\n" + 
					"11. non-static 메소드 사용 테스트\r\n" + 
					"12. 프로그램 종료\r\n\n");
			System.out.print("메뉴 번호 입력 : ");
			int menu=sc.nextInt();
			System.out.println();
			switch(menu){
			case 1 : System.out.println("1. 변수 테스트");subVarMenu();break;
			case 2 : System.out.println("2. 기본 자료형 테스트");subPTypeMenu();break;
			case 3 : System.out.println("3. if문 테스트");subIfMenu();break;
			case 4 : System.out.println("4. switch문 테스트");subSwitchMenu();break;
			case 5 : System.out.println("5. for문 테스트");subForMenu();break;
			case 6 : System.out.println("6. while문 테스트");subWhileMenu();break;
			case 7 : System.out.println("7. do~while문 테스트");subDoWhileMenu();break;
			case 8 : System.out.println("8. break문 테스트");subBreakMenu();break;
			case 9 : System.out.println("9. continue문 테스트");subContinueMenu();break;
			case 10 : System.out.println("10. static 메소드 사용 테스트");subStaticMethodMenu();break;
			case 11 : System.out.println("11. non-static 메소드 사용 테스트");subNonStaticMethodMenu();break;
			case 12 : System.out.println("12. 프로그램 종료");
			System.out.print("정말로 종료하시겠습니까? (Y/N) : ");
			char ans = sc.next().charAt(0);
			if(ans=='y'||ans=='Y')break label;
			default : System.out.println("잘못입력하셨습니다.");mainMenu();break;
			}
		}while(true);
	}
	public static void subVarMenu(){
		VariableSample variable = new VariableSample();
		do { 
			System.out.println("\n*** 변수 테스트 부메뉴 ***\r\n" + 
					"\r\n" + 
					"1. 내 신상정보 변수에 담아 출력하기\r\n" + 
					"2. 사원정보를 키보드로 입력받아 출력하기\r\n" + 
					"3. 기본 자료형 변수의 초기값 확인하기\r\n" + 
					"4. 이전 메뉴로 가기\r\n");
			System.out.print("메뉴 번호 입력 : ");
			int menu=sc.nextInt();
			System.out.println();
			switch(menu) {
			case 1 : System.out.println("1. 내 신상정보 변수에 담아 출력하기");variable.myProfile();break;
			case 2 : System.out.println("2. 사원정보를 키보드로 입력받아 출력하기");variable.empInformation();break;
			case 3 : System.out.println("3. 기본 자료형 변수의 초기값 확인하기");variable.defaultValue();break;
			case 4 : System.out.println("메인 메뉴로 돌아갑니다.");return;
			default : System.out.println("잘못입력하셨습니다.");subVarMenu();break;
			}
		}while(true);
	}
	public static void subPTypeMenu(){
		PrimitiveTypeSample primitive = new PrimitiveTypeSample(); 
		do { 
			System.out.println("\r\n" + 
					"*** 기본자료형 테스트 부메뉴 ***\r\n" + 
					"\r\n" + 
					"1. 기본자료형 메모리 할당크기 확인하기\r\n" + 
					"2. 기본자료형 값의 최소값, 최대값 출력하기\r\n" + 
					"3. 기본자료형 비트갯수 확인하기\r\n" + 
					"4. 이전 메뉴로 가기\r\n");
			System.out.print("메뉴 번호 입력 : ");
			int menu=sc.nextInt();
			System.out.println();
			switch(menu) {
			case 1 : System.out.println("1. 기본자료형 메모리 할당크기 확인하기");primitive.typeSize();break;
			case 2 : System.out.println("2. 기본자료형 값의 최소값, 최대값 출력하기");primitive.minMaxValue();break;
			case 3 : System.out.println("3. 기본자료형 비트갯수 확인하기");primitive.bitSize();break;
			case 4 : System.out.println("4. 이전 메뉴로 가기");return;
			default : System.out.println("잘못입력하셨습니다.");subPTypeMenu();break;
			}
		}while(true);
	}
	public static void subIfMenu(){
		IfSample ifS = new IfSample();
		do { 
			System.out.println("\r\n" + 
					"*** if문 테스트 부메뉴 ***\r\n" + 
					"\r\n" + 
					"1. 두 개의 정수를 입력받아, 두 수중 큰 값 출력하기\r\n" + 
					"2. 두 개의 정수를 입력받아, 두 수중 작은 값 출력하기\r\n" + 
					"3. 세 개의 정수를 입력받아, 세 수중 가장 큰수와 가장 작은수 출력하기\r\n" + 
					"4. 한 개의 정수를 입력받아, 짝수인지 홀수인지 출력하기\r\n" + 
					"5. 국,영,수 세 과목의 점수를 입력받아, 합격/불합격 확인하기\r\n" + 
					"6. 점수를 입력받아, 학점 확인하기\r\n" + 
					"7. 한 개의 정수를 입력받아, 양수인지 0인지 음수인지 확인하기\r\n" + 
					"8. 문자 하나를 입력받아, 영어대문자인지 소문자인지 숫자문자인지 기타문자인지 확인하기\r\n" + 
					"9. 이전 메뉴로 가기");
			System.out.print("메뉴 번호 입력 : ");
			int menu=sc.nextInt();
			System.out.println();
			switch(menu) {
			case 1 : System.out.println("1. 두 개의 정수를 입력받아, 두 수중 큰 값 출력하기");ifS.maxNumber();break;
			case 2 : System.out.println("2. 두 개의 정수를 입력받아, 두 수중 작은 값 출력하기");ifS.minNumber();break;
			case 3 : System.out.println("3. 세 개의 정수를 입력받아, 세 수중 가장 큰수와 가장 작은수 출력하기");ifS.threeMaxMin();break;
			case 4 : System.out.println("4. 한 개의 정수를 입력받아, 짝수인지 홀수인지 출력하기");ifS.checkEven();break;
			case 5 : System.out.println("5. 국,영,수 세 과목의 점수를 입력받아, 합격/불합격 확인하기");ifS.isPassFail();break;
			case 6 : System.out.println("6. 점수를 입력받아, 학점 확인하기");ifS.scoreGrade();break;
			case 7 : System.out.println("7. 한 개의 정수를 입력받아, 양수인지 0인지 음수인지 확인하기");ifS.checkPlusMinusZero();break;
			case 8 : System.out.println("8. 문자 하나를 입력받아, 영어대문자인지 소문자인지 숫자문자인지 기타문자인지 확인하기");ifS.whatCaracter();break;
			case 9 : System.out.println("9. 이전 메뉴로 가기");return;
			default : System.out.println("잘못입력하셨습니다.");subIfMenu();break;
			}
		}while(true);
	}
	public static void subSwitchMenu(){
		SwitchSample switchS= new SwitchSample();
		//1번 수행뒤 2번 수행하려하면 입력하기도 전에 입력이 되면서 다시 메뉴가 뜸
		//sc.nextLine(); 를 중간중간에 붙여보았으나 오히려 엔터를 안누르면 다음 글이 안나옴
		//해결 방법을 모르겠음
		do { 
			System.out.println("\r\n" + 
					"*** switch문 테스트 부메뉴 ***\r\n" + 
					"\r\n" + 
					"1. 두 개의 정수와 한 개의 연산문자를 입력받아 계산한 결과 확인하기\r\n" + 
					"2. 과일이름을 문자열로 입력받아, 그 과일의 가격 출력하기\r\n" + 
					"3. 이전 메뉴로 가기");
			System.out.print("메뉴 번호 입력 : ");
			String menu=sc.nextLine();
			System.out.println();
			switch(menu) {
			case "1" : System.out.println("1. 두 개의 정수와 한 개의 연산문자를 입력받아 계산한 결과 확인하기");switchS.calculator();break;
			case "2" : System.out.println("2. 과일이름을 문자열로 입력받아, 그 과일의 가격 출력하기");switchS.fruitPrice();break;
			case "3" : System.out.println("3. 이전 메뉴로 가기");return;
			default : System.out.println("잘못입력하셨습니다.");subSwitchMenu();break;
			}
		}while(true);
	}
	public static void subForMenu(){
		ForSample forS = new ForSample();
		do { 
			System.out.println("\r\n" + 
					"*** for문 테스트 부메뉴 ***\r\n" + 
					"\r\n" + 
					"1. 1~10까지 정수들의 합계 구하기\r\n" + 
					"2. 1~100사이의 짝수들의 합계 구하기\r\n" + 
					"3. 정수 하나 입력받아, 그 수의 구구단 출력하기\r\n" + 
					"4. 두 개의 정수를 입력받아, 두 수중 작은 값에서 큰 값까지의 합계 구하기\r\n" + 
					"5. 줄수와 칸수 입력받아, 입력된 줄수/칸수만큼 별표문자 출력하기\r\n" + 
					"6. 7줄에 7칸에 별표문자 출력하되, 각 줄에 줄번호와 같은 칸에 숫자 출력하기\r\n" + 
					"7. 줄수를 입력받아, 삼각형 모양으로 별표문자 출력하기(양수:직각삼각형, 음수:역삼각형)\r\n" + 
					"8. 구구단 2단부터 9단까지 출력하기\r\n" + 
					"9. 이전 메뉴로 가기");
			System.out.print("메뉴 번호 입력 : ");
			int menu=sc.nextInt();
			System.out.println();
			switch(menu) {
			case 1 : System.out.println("1. 1~10까지 정수들의 합계 구하기");forS.sum1To10();break;
			case 2 : System.out.println("2. 1~100사이의 짝수들의 합계 구하기");forS.sumEven1To100();break;
			case 3 : System.out.println("3. 정수 하나 입력받아, 그 수의 구구단 출력하기");forS.oneGugudan();break;
			case 4 : System.out.println("4. 두 개의 정수를 입력받아, 두 수중 작은 값에서 큰 값까지의 합계 구하기");forS.sumMinToMax();break;
			case 5 : System.out.println("5. 줄수와 칸수 입력받아, 입력된 줄수/칸수만큼 별표문자 출력하기");forS.printStar();break;
			case 6 : System.out.println("6. 7줄에 7칸에 별표문자 출력하되, 각 줄에 줄번호와 같은 칸에 숫자 출력하기");forS.printNumberStar();break;
			case 7 : System.out.println("7. 줄수를 입력받아, 삼각형 모양으로 별표문자 출력하기(양수:직각삼각형, 음수:역삼각형)");forS.printTriangleStar();break;
			case 8 : System.out.println("8. 구구단 2단부터 9단까지 출력하기");forS.guguDan();break;
			case 9 : System.out.println("9. 이전 메뉴로 가기");return;
			default : System.out.println("잘못입력하셨습니다.");subForMenu();break;
			}
		}while(true);
	}
	public static void subWhileMenu(){
		WhileSample whileS = new WhileSample();
		do { 
			System.out.println("\r\n" + 
					"\n*** while문 테스트 부메뉴 ***\r\n" + 
					"\r\n" + 
					"1. 문자 하나 입력받아, 그 문자의 유니코드 출력 반복('0' 입력되면 반복종료)\r\n" + 
					"2. 1~100까지 정수들의 합계 출력하기(while 문으로 작성)\r\n" + 
					"3. 1~100사이의 임의의 정수를 발생시켜, 숫자 알아맞추기\r\n" + 
					"4. 문자열을 입력받아, 글자 갯수 알아내어 출력하기\r\n" + 
					"5. 문자열값과 문자 하나를 입력받아, 문자열에 문자가 몇 개 있는지 확인하기\r\n" + 
					"6. 이전 메뉴로 가기");
			System.out.print("메뉴 번호 입력 : ");
			int menu=sc.nextInt();
			System.out.println();
			switch(menu) {
			case 1 : System.out.println("1. 문자 하나 입력받아, 그 문자의 유니코드 출력 반복('0' 입력되면 반복종료)");whileS.printUniCode();break;
			case 2 : System.out.println("2. 1~100까지 정수들의 합계 출력하기(while 문으로 작성)");whileS.sum1To100();break;
			case 3 : System.out.println("3. 1~100사이의 임의의 정수를 발생시켜, 숫자 알아맞추기");whileS.numberGame();break;
			case 4 : System.out.println("4. 문자열을 입력받아, 글자 갯수 알아내어 출력하기");whileS.countCharacter();break;
			case 5 : System.out.println("5. 문자열값과 문자 하나를 입력받아, 문자열에 문자가 몇 개 있는지 확인하기");whileS.countInChar();break;
			case 6 : System.out.println("6. 이전 메뉴로 가기");return;
			default : System.out.println("잘못입력하셨습니다.");subWhileMenu();break;
			}
		}while(true);
	}
	public static void subDoWhileMenu(){
		DoWhileSample dowhileS = new DoWhileSample();
		do { 
			System.out.println("\r\n" + 
					"*** do~while문 테스트 부메뉴 ***\r\n" + 
					"\r\n" + 
					"1. 문자열값 입력받아, 문자 사이에 '-' 끼워넣어 출력하기\r\n" + 
					"2. 버거킹 메뉴 주문 테스트\r\n" + 
					"3. 문자열 입력받아, \"모든 글자 영문자다\"/\"영문자 아니다.\" 출력하기\r\n" + 
					"4. 이전 메뉴로 가기");
			System.out.print("메뉴 번호 입력 : ");
			int menu=sc.nextInt();
			System.out.println();
			switch(menu) {
			case 1 : System.out.println("1. 문자열값 입력받아, 문자 사이에 '-' 끼워넣어 출력하기");dowhileS.addDashToken();break;
			case 2 : System.out.println("2. 버거킹 메뉴 주문 테스트");dowhileS.burgerKingMenu();break;
			case 3 : System.out.println("3. 문자열 입력받아, \\\"모든 글자 영문자다\\\"/\\\"영문자 아니다.\\\" 출력하기");dowhileS.isStringAlphabet();break;
			case 4 : System.out.println("4. 이전 메뉴로 가기");return;
			default : System.out.println("잘못입력하셨습니다.");subDoWhileMenu();break;
			}
		}while(true);
	}
	public static void subBreakMenu(){
		BreakSample breakS = new BreakSample();
		do { 
			System.out.println("\r\n" + 
					"*** break문 테스트 부메뉴 ***\r\n" + 
					"\r\n" + 
					"1. 1~100까지 정수들의 합계 출력하기(break문 사용)\r\n" + 
					"2. 구구단 1단~9단까지 출력하되, * 5 계산에서 반복문 빠지기(break 이름 사용)\r\n" + 
					"3. 이전 메뉴로 가기");
			System.out.print("메뉴 번호 입력 : ");
			int menu=sc.nextInt();
			System.out.println();
			switch(menu) {
			case 1 : System.out.println("1. 1~100까지 정수들의 합계 출력하기(break문 사용)");breakS.sumBreak();break;
			case 2 : System.out.println("2. 구구단 1단~9단까지 출력하되, * 5 계산에서 반복문 빠지기(break 이름 사용)");breakS.guguDanBreak();break;
			case 3 : System.out.println("3. 이전 메뉴로 가기");return;
			default : System.out.println("잘못입력하셨습니다.");subBreakMenu();break;
			}
		}while(true);
	}
	public static void subContinueMenu(){
		ContinueSample conS = new ContinueSample();
		do { 
			System.out.println("\r\n" + 
					"*** continue문 테스트 부메뉴 ***\r\n" + 
					"\r\n" + 
					"1. 1~100까지의 정수 중 3의 배수를 뺀 정수들의 합계 출력하기\r\n" + 
					"2. 3행 5열의 행열값 출력하되, 1행 3열부터 1행 5열까지 생략하고 출력하기\r\n" + 
					"3. 이전 메뉴로 가기");
			System.out.print("메뉴 번호 입력 : ");
			int menu=sc.nextInt();
			System.out.println();
			switch(menu) {
			case 1 : System.out.println("1. 1~100까지의 정수 중 3의 배수를 뺀 정수들의 합계 출력하기");conS.sumJumpThree();break;
			case 2 : System.out.println("2. 3행 5열의 행열값 출력하되, 1행 3열부터 1행 5열까지 생략하고 출력하기");conS.rowColJump();break;
			case 3 : System.out.println("3. 이전 메뉴로 가기");return;
			default : System.out.println("잘못입력하셨습니다.");subContinueMenu();break;
			}
		}while(true);
	}
	public static void subStaticMethodMenu(){
		StaticMethodSample staticS = new StaticMethodSample();
		do { 
			System.out.println("\r\n" + 
					"*** static 메소드 사용 테스트 부메뉴 ***\r\n" + 
					"\r\n" + 
					"1. Math 클래스의 랜덤값 구하는 메소드 : 1~45사이의 임의의 정수 출력\r\n" + 
					"2. Math 클래스의 실수값에 대한 절대값 구하는 메소드 : -12.77 절대값 출력하기\r\n" + 
					"3. Math 클래스의 두 정수중 큰값 구하는 메소드 : 120, 54 중 큰값 출력하기\r\n" + 
					"4. 이전 메뉴로 가기");
			System.out.print("메뉴 번호 입력 : ");
			int menu=sc.nextInt();
			System.out.println();
			switch(menu) {
			case 1 : System.out.println("1. Math 클래스의 랜덤값 구하는 메소드 : 1~45사이의 임의의 정수 출력");staticS.testMathRandom();break;
			case 2 : System.out.println("2. Math 클래스의 실수값에 대한 절대값 구하는 메소드 : -12.77 절대값 출력하기");staticS.testMathAbs();break;
			case 3 : System.out.println("3. Math 클래스의 두 정수중 큰값 구하는 메소드 : 120, 54 중 큰값 출력하기");staticS.testMathMax();break;
			case 4 : System.out.println("4. 이전 메뉴로 가기");return;
			default : System.out.println("잘못입력하셨습니다.");subStaticMethodMenu();break;
			}
		}while(true);
	}
	public static void subNonStaticMethodMenu(){
		NonStaticMethodSample nonstaticS =new NonStaticMethodSample();
		do { 
			System.out.println("\r\n" + 
					"*** non-static 메소드 사용 테스트 부메뉴 ***\r\n" + 
					"\r\n" + 
					"1. Scanner 클래스 사용 : 자료형 종류별로 값 입력받아 출력하기\r\n" + 
					"2. Date 클래스 사용 : 오늘 날짜, 현재 시간 정보 출력하기\r\n" + 
					"3. Random 클래스 사용 : 정수와 실수에 대한 난수 출력하기\r\n" + 
					"4. 이전 메뉴로 가기");
			System.out.print("메뉴 번호 입력 : ");
			int menu=sc.nextInt();
			System.out.println();
			switch(menu) {
			case 1 : System.out.println("1. Scanner 클래스 사용 : 자료형 종류별로 값 입력받아 출력하기");nonstaticS.testScanner();break;
			case 2 : System.out.println("2. Date 클래스 사용 : 오늘 날짜, 현재 시간 정보 출력하기");nonstaticS.testDate();break;
			case 3 : System.out.println("3. Random 클래스 사용 : 정수와 실수에 대한 난수 출력하기");nonstaticS.testRandom();break;
			case 4 : System.out.println("4. 이전 메뉴로 가기");return;
			default : System.out.println("잘못입력하셨습니다.");subNonStaticMethodMenu();break;
			}
		}while(true);
	}

}
