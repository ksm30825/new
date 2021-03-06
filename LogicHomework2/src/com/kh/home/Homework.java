package com.kh.home;

public class Homework {
	/*[제어문 과제2]

	<과제 1>
	 => 프로젝트명 : LogicHomework2
	 => 패키지 구성 : com.kh.home.controller
			  com.kh.home.view
			  com.kh.home.model
	 => 클래스 구성 : 모두 public class 로 작성함
			com.kh.home.controller.TestMain.java
			(main() 메소드 포함)

			logic.home.view.Menu.java

		//11개 	com.kh.home.model.VariableSample.java
			com.kh.home.model.PrimitiveTypeSample.java
			com.kh.home.model.IfSample.java
			com.kh.home.model.SwitchSample.java
			com.kh.home.model.ForSample.java
			com.kh.home.model.WhileSample.java
			com.kh.home.model.DoWhileSample.java
			com.kh.home.model.BreakSample.java
			com.kh.home.model.ContinueSample.java
			com.kh.home.model.StaticMethodSample.java
			com.kh.home.model.NonStaticMethodSample.java

	<과제 2>
	 => TestMain 클래스의 main() 메소드 구현 내용
		1. import 선언함
		2. Menu 클래스의 static 메소드인 mainMenu() 실행되게 함.

	<과제 3>	
	 => Menu 클래스의 구현 내용
		=> com.kh.home.model 패키지의 모든 클래스를 import 함
		1. 필드로 Scanner 클래스에 대한 객체 선언함 : 앞에 static 붙임.
			static Scanner sc = new Scanner(System.in);
			- 아래의 메소드 안에서 키보드 입력용으로 사용함

		2. 메소드 구성 : 12 개
		 public static void mainMenu(){}
		 public static void subVarMenu(){}
		 public static void subPTypeMenu(){}
		 public static void subIfMenu(){}
		 public static void subSwitchMenu(){}
		 public static void subForMenu(){}
		 public static void subWhileMenu(){}
		 public static void subDoWhileMenu(){}
		 public static void subBreakMenu(){}
		 public static void subContinueMenu(){}
		 public static void subStaticMethodMenu(){}
		 public static void subNonStaticMethodMenu(){}

	<과제 4>
	 => mainMenu() 메소드의 구현 내용 : 
		1. 메인 메뉴가 화면에 출력되게 함
			: do~while 문으로 반복 출력되게 함
		2. 메뉴 번호를 입력하면 관련 부(sub)메뉴가 나타나게 
			switch 문 사용하여 각 메뉴메소드 실행되게 함
		3. 프로그램 종료 메뉴항목을 추가함
			메뉴 번호 입력시 
			"정말로 종료하시겠습니까? (예:y/아니오:n) : " 출력하고
			'y' 또는 'Y' 입력시 	프로그램이 종료되게 함

		4. 메뉴화면 출력형태 --------------------------------------------

		***** 프로그래밍 기본 기능 테스트 프로그램 *****

			1. 변수 테스트
			2. 기본 자료형 테스트
			3. if문 테스트
			4. switch문 테스트
			5. for문 테스트
			6. while문 테스트
			7. do~while문 테스트
			8. break문 테스트
			9. continue문 테스트
			10. static 메소드 사용 테스트
			11. non-static 메소드 사용 테스트
			12. 프로그램 종료
			메뉴 번호 입력 : 

		-----------------------------------------------------------------------

		5. switch 문으로 입력된 메뉴 번호에 따라 각 부메뉴가 실행되게 함
		 예>
		switch(no)
		{
		case 1:	subVarMenu();	break;
		....... 이하 생략
		case 12: 프로그램 종료에 대한 처리함
		default: 잘못된 번호가 입력되었을 때 메뉴 다시 출력되게 함
		}

	<과제 5>
	=> subVarMenu() 메소드 구현 내용
		1. VariableSample 클래스 지역변수로 선언/생성
		2. 변수테스트에 대한 메뉴 출력함 : do~while로 반복 출력 처리함
		3. 선택된 메뉴 번호에 따라 VariableSample 클래스의 메소드 실행시킴
			: switch 문 사용
		4. 메뉴 출력 형태 -------------------------------------------------------

		*** 변수 테스트 부메뉴 ***

		1. 내 신상정보 변수에 담아 출력하기
		2. 사원정보를 키보드로 입력받아 출력하기
		3. 기본 자료형 변수의 초기값 확인하기
		4. 이전 메뉴로 가기
		메뉴 선택 : 

		----------------------------------------------------------------------------

		5. switch 문 사용 예
		switch(no)
		{
		case 1:	VariableSample 클래스의 myProfile() 실행; break;
		case 2:	VariableSample 클래스의 empInformation() 실행; break;
		case 3:	VariableSample 클래스의 defaultValue() 실행; break;
		case 4:	System.out.println("메인 메뉴로 돌아갑니다.");
			return;	//이전 메뉴로 되돌아감.
		default:	잘못된 값 입력시 메뉴 다시 출력되게 처리
		}

	<과제 6>		
	=> subPTypeMenu() 메소드 구현 내용
		1. PrimitiveTypeSample 클래스 지역변수로 선언/생성
		2. 기본자료형에 대한 메뉴 출력함 : do~while로 반복 출력 처리함
		3. 선택된 메뉴 번호에 따라 PrimitiveTypeSample 클래스의 메소드 실행시킴
			: switch 문 사용
		4. 메뉴 출력 형태 -------------------------------------------------------

		*** 기본자료형 테스트 부메뉴 ***

		1. 기본자료형 메모리 할당크기 확인하기
		2. 기본자료형 값의 최소값, 최대값 출력하기
		3. 기본자료형 비트갯수 확인하기
		4. 이전 메뉴로 가기
		메뉴 선택 : 

		----------------------------------------------------------------------------

		5. switch 문 사용 예
		switch(no)
		{
		case 1:	PrimitiveTypeSample 클래스의 typeSize() 실행; break;
		case 2:	PrimitiveTypeSample 클래스의 minMaxValue() 실행; break;
		case 3:	PrimitiveTypeSample 클래스의 bitSize() 실행; break;
		case 4:	System.out.println("메인 메뉴로 돌아갑니다.");
			return;	//이전 메뉴로 되돌아감.
		default:	잘못된 값 입력시 메뉴 다시 출력되게 처리
		}

			
	<과제 7>
	=> subIfMenu() 메소드 구현 내용
		1. IfSample 클래스 지역변수로 선언/생성
		2. if문 테스트에 대한 메뉴 출력함 : do~while로 반복 출력 처리함
		3. 선택된 메뉴 번호에 따라 IfSample 클래스의 메소드 실행시킴
			: switch 문 사용
		4. 메뉴 출력 형태 -------------------------------------------------------

		*** if문 테스트 부메뉴 ***

		1. 두 개의 정수를 입력받아, 두 수중 큰 값 출력하기
		2. 두 개의 정수를 입력받아, 두 수중 작은 값 출력하기
		3. 세 개의 정수를 입력받아, 세 수중 가장 큰수와 가장 작은수 출력하기
		4. 한 개의 정수를 입력받아, 짝수인지 홀수인지 출력하기
		5. 국,영,수 세 과목의 점수를 입력받아, 합격/불합격 확인하기
		6. 점수를 입력받아, 학점 확인하기
		7. 한 개의 정수를 입력받아, 양수인지 0인지 음수인지 확인하기
		8. 문자 하나를 입력받아, 영어대문자인지 소문자인지 숫자문자인지 기타문자인지 확인하기
		9. 이전 메뉴로 가기
		메뉴 선택 : 

		----------------------------------------------------------------------------

		5. switch 문 사용 예
		switch(no)
		{
		case 1:	IfSample 클래스의 maxNumber() 실행; break;
		case 2:	IfSample 클래스의 minNumber() 실행; break;
		case 3:	IfSample 클래스의 threeMaxMin() 실행; break;
		case 4:	IfSample 클래스의 checkEven() 실행; break;
		case 5:	IfSample 클래스의 isPassFail() 실행; break;
		case 6:	IfSample 클래스의 scoreGrade() 실행; break;
		case 7:	IfSample 클래스의 checkPlusMinusZero() 실행; break;
		case 8:	IfSample 클래스의 whatCaracter() 실행; break;
		case 9:	System.out.println("메인 메뉴로 돌아갑니다.");
			return;	//이전 메뉴로 되돌아감.
		default:	잘못된 값 입력시 메뉴 다시 출력되게 처리
		}

	<과제 8>		
	=> subSwitchMenu() 메소드 구현 내용
		1. SwitchSample 클래스 지역변수로 선언/생성
		2. switch문 테스트에 대한 메뉴 출력함 : do~while로 반복 출력 처리함
		3. 선택된 메뉴 번호에 따라 SwitchSample 클래스의 메소드 실행시킴
			: switch 문 사용
		4. 메뉴 출력 형태 -------------------------------------------------------

		*** switch문 테스트 부메뉴 ***

		1. 두 개의 정수와 한 개의 연산문자를 입력받아 계산한 결과 확인하기
		2. 과일이름을 문자열로 입력받아, 그 과일의 가격 출력하기
		3. 이전 메뉴로 가기
		메뉴 선택 : 

		----------------------------------------------------------------------------

		5. switch 문 사용 예
		switch(no)
		{
		case 1:	SwitchSample 클래스의 calculator() 실행; break;
		case 2:	SwitchSample 클래스의 fruitPrice() 실행; break;
		case 3:	System.out.println("메인 메뉴로 돌아갑니다.");
			return;	//이전 메뉴로 되돌아감.
		default:	잘못된 값 입력시 메뉴 다시 출력되게 처리
		}
			
	<과제 9>
	=> subForMenu() 메소드 구현 내용
		1. ForSample 클래스 지역변수로 선언/생성
		2. for문 테스트에 대한 메뉴 출력함 : do~while로 반복 출력 처리함
		3. 선택된 메뉴 번호에 따라 ForSample 클래스의 메소드 실행시킴
			: switch 문 사용
		4. 메뉴 출력 형태 -------------------------------------------------------

		*** for문 테스트 부메뉴 ***

		1. 1~10까지 정수들의 합계 구하기
		2. 1~100사이의 짝수들의 합게 구하기
		3. 정수 하나 입력받아, 그 수의 구구단 출력하기
		4. 두 개의 정수를 입력받아, 두 수중 작은 값에서 큰 값까지의 합계 구하기
		5. 줄수와 칸수 입력받아, 입력된 줄수/칸수만큼 별표문자 출력하기
		6. 7줄에 7칸에 별표문자 출력하되, 각 줄에 줄번호와 같은 칸에 숫자 출력하기
		7. 줄수를 입력받아, 삼각형 모양으로 별표문자 출력하기(양수:직각삼각형, 음수:역삼각형)
		8. 구구단 2단부터 9단까지 출력하기
		9. 이전 메뉴로 가기
		메뉴 선택 : 

		----------------------------------------------------------------------------

		5. switch 문 사용 예
		switch(no)
		{
		case 1:	ForSample 클래스의 sum1To10() 실행; break;
		case 2:	ForSample 클래스의 sumEven1To100() 실행; break;
		case 3:	ForSample 클래스의 oneGugudan() 실행; break;
		case 4:	ForSample 클래스의 sumMinToMax() 실행; break;
		case 5:	ForSample 클래스의 printStar() 실행; break;
		case 6:	ForSample 클래스의 printNumberStar() 실행; break;
		case 7:	ForSample 클래스의 printTriangleStar() 실행; break;
		case 8:	ForSample 클래스의 guguDan() 실행; break;
		case 9:	System.out.println("메인 메뉴로 돌아갑니다.");
			return;	//이전 메뉴로 되돌아감.
		default:	잘못된 값 입력시 메뉴 다시 출력되게 처리
		}
			

	<과제 10>
	=> subWhileMenu() 메소드 구현 내용
		1. WhileSample 클래스 지역변수로 선언/생성
		2. while문 테스트에 대한 메뉴 출력함 : do~while로 반복 출력 처리함
		3. 선택된 메뉴 번호에 따라 WhileSample 클래스의 메소드 실행시킴
			: switch 문 사용
		4. 메뉴 출력 형태 -------------------------------------------------------

		*** while문 테스트 부메뉴 ***

		1. 문자 하나 입력받아, 그 문자의 유니코드 출력 반복('0' 입력되면 반복종료)
		2. 1~100까지 정수들의 합계 출력하기(while 문으로 작성)
		3. 1~100사이의 임의의 정수를 발생시켜, 숫자 알아맞추기
		4. 문자열을 입력받아, 글자 갯수 알아내어 출력하기
		5. 문자열값과 문자 하나를 입력받아, 문자열에 문자가 몇 개 있는지 확인하기
		6. 이전 메뉴로 가기
		메뉴 선택 : 

		----------------------------------------------------------------------------

		5. switch 문 사용 예
		switch(no)
		{
		case 1:	WhileSample 클래스의 printUniCode() 실행; break;
		case 2:	WhileSample 클래스의 sum1To100() 실행; break;
		case 3:	WhileSample 클래스의 numberGame() 실행; break;
		case 4:	WhileSample 클래스의 countCharacter() 실행; break;
		case 5:	WhileSample 클래스의 countInChar() 실행; break;
		case 6:	System.out.println("메인 메뉴로 돌아갑니다.");
			return;	//이전 메뉴로 되돌아감.
		default:	잘못된 값 입력시 메뉴 다시 출력되게 처리
		}
			
	<과제 11>
	=> subDoWhileMenu() 메소드 구현 내용
		1. DoWhileSample 클래스 지역변수로 선언/생성
		2. do~while문 테스트에 대한 메뉴 출력함 : do~while로 반복 출력 처리함
		3. 선택된 메뉴 번호에 따라 DoWhileSample 클래스의 메소드 실행시킴
			: switch 문 사용
		4. 메뉴 출력 형태 -------------------------------------------------------

		*** do~while문 테스트 부메뉴 ***

		1. 문자열값 입력받아, 문자 사이에 '-' 끼워넣어 출력하기
		2. 버거킹 메뉴 주문 테스트
		3. 문자열 입력받아, "모든 글자 영문자다"/"영문자 아니다." 출력하기
		4. 이전 메뉴로 가기
		메뉴 선택 : 

		----------------------------------------------------------------------------

		5. switch 문 사용 예
		switch(no)
		{
		case 1:	DoWhileSample 클래스의 addDashToken() 실행; break;
		case 2:	DoWhileSample 클래스의 burgerKingMenu() 실행; break;
		case 3:	DoWhileSample 클래스의 isStringAlphabet() 실행; break;
		case 4:	System.out.println("메인 메뉴로 돌아갑니다.");
			return;	//이전 메뉴로 되돌아감.
		default:	잘못된 값 입력시 메뉴 다시 출력되게 처리
		}

			
	<과제 12>
	=> subBreakMenu() 메소드 구현 내용
		1. BreakSample 클래스 지역변수로 선언/생성
		2. break문 테스트에 대한 메뉴 출력함 : do~while로 반복 출력 처리함
		3. 선택된 메뉴 번호에 따라 BreakSample 클래스의 메소드 실행시킴
			: switch 문 사용
		4. 메뉴 출력 형태 -------------------------------------------------------

		*** break문 테스트 부메뉴 ***

		1. 1~100까지 정수들의 합계 출력하기(break문 사용)
		2. 구구단 1단~9단까지 출력하되, * 5 계산에서 반복문 빠지기(break 이름 사용)
		3. 이전 메뉴로 가기
		메뉴 선택 : 

		----------------------------------------------------------------------------

		5. switch 문 사용 예
		switch(no)
		{
		case 1:	BreakSample 클래스의 sumBreak() 실행; break;
		case 2:	BreakSample 클래스의 guguDanBreak() 실행; break;
		case 3:	System.out.println("메인 메뉴로 돌아갑니다.");
			return;	//이전 메뉴로 되돌아감.
		default:	잘못된 값 입력시 메뉴 다시 출력되게 처리
		}
			
	<과제 13>
	=> subContinueMenu() 메소드 구현 내용
		1. ContinueSample 클래스 지역변수로 선언/생성
		2. continue문 테스트에 대한 메뉴 출력함 : do~while로 반복 출력 처리함
		3. 선택된 메뉴 번호에 따라 ContinueSample 클래스의 메소드 실행시킴
			: switch 문 사용
		4. 메뉴 출력 형태 -------------------------------------------------------

		*** continue문 테스트 부메뉴 ***

		1. 1~100까지의 정수 중 3의 배수를 뺀 정수들의 합계 출력하기
		2. 3행 5열의 행열값 출력하되, 1행 3열부터 1행 5열까지 생략하고 출력하기
		3. 이전 메뉴로 가기
		메뉴 선택 : 

		----------------------------------------------------------------------------

		5. switch 문 사용 예
		switch(no)
		{
		case 1:	ContinueSample 클래스의 sumJumpThree() 실행; break;
		case 2:	ContinueSample 클래스의 rowColJump() 실행; break;
		case 3:	System.out.println("메인 메뉴로 돌아갑니다.");
			return;	//이전 메뉴로 되돌아감.
		default:	잘못된 값 입력시 메뉴 다시 출력되게 처리
		}
			
	<과제 14>
	=> subStaticMethodMenu() 메소드 구현 내용
		1. StaticMethodSample 클래스 지역변수로 선언/생성
		2. static 메소드 사용 테스트에 대한 메뉴 출력함 : do~while로 반복 출력 처리함
		3. 선택된 메뉴 번호에 따라 StaticMethodSample 클래스의 메소드 실행시킴
			: switch 문 사용
		4. 메뉴 출력 형태 -------------------------------------------------------

		*** static 메소드 사용 테스트 부메뉴 ***

		1. Math 클래스의 랜덤값 구하는 메소드 : 1~45사이의 임의의 정수 출력
		2. Math 클래스의 실수값에 대한 절대값 구하는 메소드 : -12.77 절대값 출력하기
		3. Math 클래스의 두 정수중 큰값 구하는 메소드 : 120, 54 중 큰값 출력하기
		4. 이전 메뉴로 가기
		메뉴 선택 : 

		----------------------------------------------------------------------------

		5. switch 문 사용 예
		switch(no)
		{
		case 1:	StaticMethodSample 클래스의 testMathRandom() 실행; break;
		case 2:	StaticMethodSample 클래스의 testMathAbs() 실행; break;
		case 3:	StaticMethodSample 클래스의 testMathMax() 실행; break;
		case 4:	System.out.println("메인 메뉴로 돌아갑니다.");
			return;	//이전 메뉴로 되돌아감.
		default:	잘못된 값 입력시 메뉴 다시 출력되게 처리
		}
			
	<과제 15>
	=> subNonStaticMethodMenu() 메소드 구현 내용
		1. NonStaticMethodSample 클래스 지역변수로 선언/생성
		2. non-static 메소드 사용 테스트에 대한 메뉴 출력함 : do~while로 반복 출력 처리함
		3. 선택된 메뉴 번호에 따라 NonStaticMethodSample 클래스의 메소드 실행시킴
			: switch 문 사용
		4. 메뉴 출력 형태 -------------------------------------------------------

		*** non-static 메소드 사용 테스트 부메뉴 ***

		1. Scanner 클래스 사용 : 자료형 종류별로 값 입력받아 출력하기
		2. Date 클래스 사용 : 오늘 날짜, 현재 시간 정보 출력하기
		3. Random 클래스 사용 : 정수와 실수에 대한 난수 출력하기
		4. 이전 메뉴로 가기
		메뉴 선택 : 

		----------------------------------------------------------------------------

		5. switch 문 사용 예
		switch(no)
		{
		case 1:	NonStaticMethodSample 클래스의 testScanner() 실행; break;
		case 2:	NonStaticMethodSample 클래스의 testDate() 실행; break;
		case 3:	NonStaticMethodSample 클래스의 testRandom() 실행; break;
		case 4:	System.out.println("메인 메뉴로 돌아갑니다.");
			return;	//이전 메뉴로 되돌아감.
		default:	잘못된 값 입력시 메뉴 다시 출력되게 처리
		}

	<과제 16>
	 : VariableSample 클래스 구현
		1. 필드로 Scanner 클래스에 대한 변수 선언/생성 
		2. 메소드 작성
		  public void myProfile(){}
		  public void empInformation(){}
		  public void defaultValue(){}
		3. 각 메소드의 구현 내용은 수업 중에 작성된 소스를 참조하면 됩니다.

	<과제 17>
	 : PrimitiveTypeSample 클래스 구현
		1. 필드로 Scanner 클래스에 대한 변수 선언/생성 
		2. 메소드 작성
	 	  public void typeSize(){}
		  public void minMaxValue(){}
		  public void bitSize(){}
		3. java.lang 패키지의 기본자료형에 대한 각 래퍼클래스의 필드를 사용함.



	<과제 18>
	 : IfSample 클래스 구현
		1. 필드로 Scanner 클래스에 대한 변수 선언/생성 
		2. 메소드 작성
	 	  public void maxNumber(){}
		  public void minNumber(){}
		  public void threeMaxMin(){}
		  public void checkEven(){}
		  public void isPassFail(){}
		  public void scoreGrade(){}
		  public void checkPlusMinusZero(){}
		  public void whatCaracter(){}


	<과제 19>
	 : SwitchSample 클래스 구현
		1. 필드로 Scanner 클래스에 대한 변수 선언/생성 
		2. 메소드 작성
	 	  public void calculator(){}
		  public void fruitPrice(){}


	<과제 20>
	 : ForSample 클래스의 구현
		1. 필드로 Scanner 클래스에 대한 변수 선언/생성 
		2. 메소드 작성
	 	  public void sum1To10(){}
		  public void sumEven1To100(){}
		  public void oneGugudan(){}
		  public void sumMinToMax(){}
		  public void printStar(){}
		  public void printNumberStar(){}
		  public void printTriangleStar(){}
		  public void guguDan(){}


	<과제 21>
	 : WhileSample 클래스 구현
		1. 필드로 Scanner 클래스에 대한 변수 선언/생성 
		2. 메소드 작성
	 	  public void printUniCode(){}
		  public void sum1To100(){}
		  public void numberGame(){}
		  public void countCharacter(){}
		  public void countInChar(){}


	<과제 22>
	 : DoWhileSample 클래스 구현
		1. 필드로 Scanner 클래스에 대한 변수 선언/생성 
		2. 메소드 작성
	 	  public void addDashToken(){}
		  public void burgerKingMenu(){}
			=> "프로그램 종료"를 "이전메뉴로 이동"으로 변경할 것
		  public void isStringAlphabet(){}


	<과제 23>
	 : BreakSample 클래스 구현
		1. 필드로 Scanner 클래스에 대한 변수 선언/생성 
		2. 메소드 작성
	 	  public void sumBreak(){}
		  public void guguDanBreak(){}

	<과제 24>
	 : ContinueSample 클래스 구현
		1. 필드로 Scanner 클래스에 대한 변수 선언/생성 
		2. 메소드 작성
	 	  public void sumJumpThree(){}
		  public void rowColJump(){}


	<과제 25>
	 : StaticMethodSample 클래스 구현
		1. 필드로 Scanner 클래스에 대한 변수 선언/생성 
		2. 메소드 작성
	 	  public void testMathRandom(){}
		  public void testMathAbs(){}
		  public void testMathMax(){}

	<과제 26>
	 : NonStaticMethodSample 클래스 구현
		1. 필드로 Scanner 클래스에 대한 변수 선언/생성 
		2. 메소드 작성
	 	  public void testScanner(){}
		  public void testDate(){}
		  public void testRandom(){}

*/
}
