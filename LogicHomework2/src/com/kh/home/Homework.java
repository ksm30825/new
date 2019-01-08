package com.kh.home;

public class Homework {
	/*[��� ����2]

	<���� 1>
	 => ������Ʈ�� : LogicHomework2
	 => ��Ű�� ���� : com.kh.home.controller
			  com.kh.home.view
			  com.kh.home.model
	 => Ŭ���� ���� : ��� public class �� �ۼ���
			com.kh.home.controller.TestMain.java
			(main() �޼ҵ� ����)

			logic.home.view.Menu.java

		//11�� 	com.kh.home.model.VariableSample.java
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

	<���� 2>
	 => TestMain Ŭ������ main() �޼ҵ� ���� ����
		1. import ������
		2. Menu Ŭ������ static �޼ҵ��� mainMenu() ����ǰ� ��.

	<���� 3>	
	 => Menu Ŭ������ ���� ����
		=> com.kh.home.model ��Ű���� ��� Ŭ������ import ��
		1. �ʵ�� Scanner Ŭ������ ���� ��ü ������ : �տ� static ����.
			static Scanner sc = new Scanner(System.in);
			- �Ʒ��� �޼ҵ� �ȿ��� Ű���� �Է¿����� �����

		2. �޼ҵ� ���� : 12 ��
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

	<���� 4>
	 => mainMenu() �޼ҵ��� ���� ���� : 
		1. ���� �޴��� ȭ�鿡 ��µǰ� ��
			: do~while ������ �ݺ� ��µǰ� ��
		2. �޴� ��ȣ�� �Է��ϸ� ���� ��(sub)�޴��� ��Ÿ���� 
			switch �� ����Ͽ� �� �޴��޼ҵ� ����ǰ� ��
		3. ���α׷� ���� �޴��׸��� �߰���
			�޴� ��ȣ �Է½� 
			"������ �����Ͻðڽ��ϱ�? (��:y/�ƴϿ�:n) : " ����ϰ�
			'y' �Ǵ� 'Y' �Է½� 	���α׷��� ����ǰ� ��

		4. �޴�ȭ�� ������� --------------------------------------------

		***** ���α׷��� �⺻ ��� �׽�Ʈ ���α׷� *****

			1. ���� �׽�Ʈ
			2. �⺻ �ڷ��� �׽�Ʈ
			3. if�� �׽�Ʈ
			4. switch�� �׽�Ʈ
			5. for�� �׽�Ʈ
			6. while�� �׽�Ʈ
			7. do~while�� �׽�Ʈ
			8. break�� �׽�Ʈ
			9. continue�� �׽�Ʈ
			10. static �޼ҵ� ��� �׽�Ʈ
			11. non-static �޼ҵ� ��� �׽�Ʈ
			12. ���α׷� ����
			�޴� ��ȣ �Է� : 

		-----------------------------------------------------------------------

		5. switch ������ �Էµ� �޴� ��ȣ�� ���� �� �θ޴��� ����ǰ� ��
		 ��>
		switch(no)
		{
		case 1:	subVarMenu();	break;
		....... ���� ����
		case 12: ���α׷� ���ῡ ���� ó����
		default: �߸��� ��ȣ�� �ԷµǾ��� �� �޴� �ٽ� ��µǰ� ��
		}

	<���� 5>
	=> subVarMenu() �޼ҵ� ���� ����
		1. VariableSample Ŭ���� ���������� ����/����
		2. �����׽�Ʈ�� ���� �޴� ����� : do~while�� �ݺ� ��� ó����
		3. ���õ� �޴� ��ȣ�� ���� VariableSample Ŭ������ �޼ҵ� �����Ŵ
			: switch �� ���
		4. �޴� ��� ���� -------------------------------------------------------

		*** ���� �׽�Ʈ �θ޴� ***

		1. �� �Ż����� ������ ��� ����ϱ�
		2. ��������� Ű����� �Է¹޾� ����ϱ�
		3. �⺻ �ڷ��� ������ �ʱⰪ Ȯ���ϱ�
		4. ���� �޴��� ����
		�޴� ���� : 

		----------------------------------------------------------------------------

		5. switch �� ��� ��
		switch(no)
		{
		case 1:	VariableSample Ŭ������ myProfile() ����; break;
		case 2:	VariableSample Ŭ������ empInformation() ����; break;
		case 3:	VariableSample Ŭ������ defaultValue() ����; break;
		case 4:	System.out.println("���� �޴��� ���ư��ϴ�.");
			return;	//���� �޴��� �ǵ��ư�.
		default:	�߸��� �� �Է½� �޴� �ٽ� ��µǰ� ó��
		}

	<���� 6>		
	=> subPTypeMenu() �޼ҵ� ���� ����
		1. PrimitiveTypeSample Ŭ���� ���������� ����/����
		2. �⺻�ڷ����� ���� �޴� ����� : do~while�� �ݺ� ��� ó����
		3. ���õ� �޴� ��ȣ�� ���� PrimitiveTypeSample Ŭ������ �޼ҵ� �����Ŵ
			: switch �� ���
		4. �޴� ��� ���� -------------------------------------------------------

		*** �⺻�ڷ��� �׽�Ʈ �θ޴� ***

		1. �⺻�ڷ��� �޸� �Ҵ�ũ�� Ȯ���ϱ�
		2. �⺻�ڷ��� ���� �ּҰ�, �ִ밪 ����ϱ�
		3. �⺻�ڷ��� ��Ʈ���� Ȯ���ϱ�
		4. ���� �޴��� ����
		�޴� ���� : 

		----------------------------------------------------------------------------

		5. switch �� ��� ��
		switch(no)
		{
		case 1:	PrimitiveTypeSample Ŭ������ typeSize() ����; break;
		case 2:	PrimitiveTypeSample Ŭ������ minMaxValue() ����; break;
		case 3:	PrimitiveTypeSample Ŭ������ bitSize() ����; break;
		case 4:	System.out.println("���� �޴��� ���ư��ϴ�.");
			return;	//���� �޴��� �ǵ��ư�.
		default:	�߸��� �� �Է½� �޴� �ٽ� ��µǰ� ó��
		}

			
	<���� 7>
	=> subIfMenu() �޼ҵ� ���� ����
		1. IfSample Ŭ���� ���������� ����/����
		2. if�� �׽�Ʈ�� ���� �޴� ����� : do~while�� �ݺ� ��� ó����
		3. ���õ� �޴� ��ȣ�� ���� IfSample Ŭ������ �޼ҵ� �����Ŵ
			: switch �� ���
		4. �޴� ��� ���� -------------------------------------------------------

		*** if�� �׽�Ʈ �θ޴� ***

		1. �� ���� ������ �Է¹޾�, �� ���� ū �� ����ϱ�
		2. �� ���� ������ �Է¹޾�, �� ���� ���� �� ����ϱ�
		3. �� ���� ������ �Է¹޾�, �� ���� ���� ū���� ���� ������ ����ϱ�
		4. �� ���� ������ �Է¹޾�, ¦������ Ȧ������ ����ϱ�
		5. ��,��,�� �� ������ ������ �Է¹޾�, �հ�/���հ� Ȯ���ϱ�
		6. ������ �Է¹޾�, ���� Ȯ���ϱ�
		7. �� ���� ������ �Է¹޾�, ������� 0���� �������� Ȯ���ϱ�
		8. ���� �ϳ��� �Է¹޾�, ����빮������ �ҹ������� ���ڹ������� ��Ÿ�������� Ȯ���ϱ�
		9. ���� �޴��� ����
		�޴� ���� : 

		----------------------------------------------------------------------------

		5. switch �� ��� ��
		switch(no)
		{
		case 1:	IfSample Ŭ������ maxNumber() ����; break;
		case 2:	IfSample Ŭ������ minNumber() ����; break;
		case 3:	IfSample Ŭ������ threeMaxMin() ����; break;
		case 4:	IfSample Ŭ������ checkEven() ����; break;
		case 5:	IfSample Ŭ������ isPassFail() ����; break;
		case 6:	IfSample Ŭ������ scoreGrade() ����; break;
		case 7:	IfSample Ŭ������ checkPlusMinusZero() ����; break;
		case 8:	IfSample Ŭ������ whatCaracter() ����; break;
		case 9:	System.out.println("���� �޴��� ���ư��ϴ�.");
			return;	//���� �޴��� �ǵ��ư�.
		default:	�߸��� �� �Է½� �޴� �ٽ� ��µǰ� ó��
		}

	<���� 8>		
	=> subSwitchMenu() �޼ҵ� ���� ����
		1. SwitchSample Ŭ���� ���������� ����/����
		2. switch�� �׽�Ʈ�� ���� �޴� ����� : do~while�� �ݺ� ��� ó����
		3. ���õ� �޴� ��ȣ�� ���� SwitchSample Ŭ������ �޼ҵ� �����Ŵ
			: switch �� ���
		4. �޴� ��� ���� -------------------------------------------------------

		*** switch�� �׽�Ʈ �θ޴� ***

		1. �� ���� ������ �� ���� ���깮�ڸ� �Է¹޾� ����� ��� Ȯ���ϱ�
		2. �����̸��� ���ڿ��� �Է¹޾�, �� ������ ���� ����ϱ�
		3. ���� �޴��� ����
		�޴� ���� : 

		----------------------------------------------------------------------------

		5. switch �� ��� ��
		switch(no)
		{
		case 1:	SwitchSample Ŭ������ calculator() ����; break;
		case 2:	SwitchSample Ŭ������ fruitPrice() ����; break;
		case 3:	System.out.println("���� �޴��� ���ư��ϴ�.");
			return;	//���� �޴��� �ǵ��ư�.
		default:	�߸��� �� �Է½� �޴� �ٽ� ��µǰ� ó��
		}
			
	<���� 9>
	=> subForMenu() �޼ҵ� ���� ����
		1. ForSample Ŭ���� ���������� ����/����
		2. for�� �׽�Ʈ�� ���� �޴� ����� : do~while�� �ݺ� ��� ó����
		3. ���õ� �޴� ��ȣ�� ���� ForSample Ŭ������ �޼ҵ� �����Ŵ
			: switch �� ���
		4. �޴� ��� ���� -------------------------------------------------------

		*** for�� �׽�Ʈ �θ޴� ***

		1. 1~10���� �������� �հ� ���ϱ�
		2. 1~100������ ¦������ �հ� ���ϱ�
		3. ���� �ϳ� �Է¹޾�, �� ���� ������ ����ϱ�
		4. �� ���� ������ �Է¹޾�, �� ���� ���� ������ ū �������� �հ� ���ϱ�
		5. �ټ��� ĭ�� �Է¹޾�, �Էµ� �ټ�/ĭ����ŭ ��ǥ���� ����ϱ�
		6. 7�ٿ� 7ĭ�� ��ǥ���� ����ϵ�, �� �ٿ� �ٹ�ȣ�� ���� ĭ�� ���� ����ϱ�
		7. �ټ��� �Է¹޾�, �ﰢ�� ������� ��ǥ���� ����ϱ�(���:�����ﰢ��, ����:���ﰢ��)
		8. ������ 2�ܺ��� 9�ܱ��� ����ϱ�
		9. ���� �޴��� ����
		�޴� ���� : 

		----------------------------------------------------------------------------

		5. switch �� ��� ��
		switch(no)
		{
		case 1:	ForSample Ŭ������ sum1To10() ����; break;
		case 2:	ForSample Ŭ������ sumEven1To100() ����; break;
		case 3:	ForSample Ŭ������ oneGugudan() ����; break;
		case 4:	ForSample Ŭ������ sumMinToMax() ����; break;
		case 5:	ForSample Ŭ������ printStar() ����; break;
		case 6:	ForSample Ŭ������ printNumberStar() ����; break;
		case 7:	ForSample Ŭ������ printTriangleStar() ����; break;
		case 8:	ForSample Ŭ������ guguDan() ����; break;
		case 9:	System.out.println("���� �޴��� ���ư��ϴ�.");
			return;	//���� �޴��� �ǵ��ư�.
		default:	�߸��� �� �Է½� �޴� �ٽ� ��µǰ� ó��
		}
			

	<���� 10>
	=> subWhileMenu() �޼ҵ� ���� ����
		1. WhileSample Ŭ���� ���������� ����/����
		2. while�� �׽�Ʈ�� ���� �޴� ����� : do~while�� �ݺ� ��� ó����
		3. ���õ� �޴� ��ȣ�� ���� WhileSample Ŭ������ �޼ҵ� �����Ŵ
			: switch �� ���
		4. �޴� ��� ���� -------------------------------------------------------

		*** while�� �׽�Ʈ �θ޴� ***

		1. ���� �ϳ� �Է¹޾�, �� ������ �����ڵ� ��� �ݺ�('0' �ԷµǸ� �ݺ�����)
		2. 1~100���� �������� �հ� ����ϱ�(while ������ �ۼ�)
		3. 1~100������ ������ ������ �߻�����, ���� �˾Ƹ��߱�
		4. ���ڿ��� �Է¹޾�, ���� ���� �˾Ƴ��� ����ϱ�
		5. ���ڿ����� ���� �ϳ��� �Է¹޾�, ���ڿ��� ���ڰ� �� �� �ִ��� Ȯ���ϱ�
		6. ���� �޴��� ����
		�޴� ���� : 

		----------------------------------------------------------------------------

		5. switch �� ��� ��
		switch(no)
		{
		case 1:	WhileSample Ŭ������ printUniCode() ����; break;
		case 2:	WhileSample Ŭ������ sum1To100() ����; break;
		case 3:	WhileSample Ŭ������ numberGame() ����; break;
		case 4:	WhileSample Ŭ������ countCharacter() ����; break;
		case 5:	WhileSample Ŭ������ countInChar() ����; break;
		case 6:	System.out.println("���� �޴��� ���ư��ϴ�.");
			return;	//���� �޴��� �ǵ��ư�.
		default:	�߸��� �� �Է½� �޴� �ٽ� ��µǰ� ó��
		}
			
	<���� 11>
	=> subDoWhileMenu() �޼ҵ� ���� ����
		1. DoWhileSample Ŭ���� ���������� ����/����
		2. do~while�� �׽�Ʈ�� ���� �޴� ����� : do~while�� �ݺ� ��� ó����
		3. ���õ� �޴� ��ȣ�� ���� DoWhileSample Ŭ������ �޼ҵ� �����Ŵ
			: switch �� ���
		4. �޴� ��� ���� -------------------------------------------------------

		*** do~while�� �׽�Ʈ �θ޴� ***

		1. ���ڿ��� �Է¹޾�, ���� ���̿� '-' �����־� ����ϱ�
		2. ����ŷ �޴� �ֹ� �׽�Ʈ
		3. ���ڿ� �Է¹޾�, "��� ���� �����ڴ�"/"������ �ƴϴ�." ����ϱ�
		4. ���� �޴��� ����
		�޴� ���� : 

		----------------------------------------------------------------------------

		5. switch �� ��� ��
		switch(no)
		{
		case 1:	DoWhileSample Ŭ������ addDashToken() ����; break;
		case 2:	DoWhileSample Ŭ������ burgerKingMenu() ����; break;
		case 3:	DoWhileSample Ŭ������ isStringAlphabet() ����; break;
		case 4:	System.out.println("���� �޴��� ���ư��ϴ�.");
			return;	//���� �޴��� �ǵ��ư�.
		default:	�߸��� �� �Է½� �޴� �ٽ� ��µǰ� ó��
		}

			
	<���� 12>
	=> subBreakMenu() �޼ҵ� ���� ����
		1. BreakSample Ŭ���� ���������� ����/����
		2. break�� �׽�Ʈ�� ���� �޴� ����� : do~while�� �ݺ� ��� ó����
		3. ���õ� �޴� ��ȣ�� ���� BreakSample Ŭ������ �޼ҵ� �����Ŵ
			: switch �� ���
		4. �޴� ��� ���� -------------------------------------------------------

		*** break�� �׽�Ʈ �θ޴� ***

		1. 1~100���� �������� �հ� ����ϱ�(break�� ���)
		2. ������ 1��~9�ܱ��� ����ϵ�, * 5 ��꿡�� �ݺ��� ������(break �̸� ���)
		3. ���� �޴��� ����
		�޴� ���� : 

		----------------------------------------------------------------------------

		5. switch �� ��� ��
		switch(no)
		{
		case 1:	BreakSample Ŭ������ sumBreak() ����; break;
		case 2:	BreakSample Ŭ������ guguDanBreak() ����; break;
		case 3:	System.out.println("���� �޴��� ���ư��ϴ�.");
			return;	//���� �޴��� �ǵ��ư�.
		default:	�߸��� �� �Է½� �޴� �ٽ� ��µǰ� ó��
		}
			
	<���� 13>
	=> subContinueMenu() �޼ҵ� ���� ����
		1. ContinueSample Ŭ���� ���������� ����/����
		2. continue�� �׽�Ʈ�� ���� �޴� ����� : do~while�� �ݺ� ��� ó����
		3. ���õ� �޴� ��ȣ�� ���� ContinueSample Ŭ������ �޼ҵ� �����Ŵ
			: switch �� ���
		4. �޴� ��� ���� -------------------------------------------------------

		*** continue�� �׽�Ʈ �θ޴� ***

		1. 1~100������ ���� �� 3�� ����� �� �������� �հ� ����ϱ�
		2. 3�� 5���� �࿭�� ����ϵ�, 1�� 3������ 1�� 5������ �����ϰ� ����ϱ�
		3. ���� �޴��� ����
		�޴� ���� : 

		----------------------------------------------------------------------------

		5. switch �� ��� ��
		switch(no)
		{
		case 1:	ContinueSample Ŭ������ sumJumpThree() ����; break;
		case 2:	ContinueSample Ŭ������ rowColJump() ����; break;
		case 3:	System.out.println("���� �޴��� ���ư��ϴ�.");
			return;	//���� �޴��� �ǵ��ư�.
		default:	�߸��� �� �Է½� �޴� �ٽ� ��µǰ� ó��
		}
			
	<���� 14>
	=> subStaticMethodMenu() �޼ҵ� ���� ����
		1. StaticMethodSample Ŭ���� ���������� ����/����
		2. static �޼ҵ� ��� �׽�Ʈ�� ���� �޴� ����� : do~while�� �ݺ� ��� ó����
		3. ���õ� �޴� ��ȣ�� ���� StaticMethodSample Ŭ������ �޼ҵ� �����Ŵ
			: switch �� ���
		4. �޴� ��� ���� -------------------------------------------------------

		*** static �޼ҵ� ��� �׽�Ʈ �θ޴� ***

		1. Math Ŭ������ ������ ���ϴ� �޼ҵ� : 1~45������ ������ ���� ���
		2. Math Ŭ������ �Ǽ����� ���� ���밪 ���ϴ� �޼ҵ� : -12.77 ���밪 ����ϱ�
		3. Math Ŭ������ �� ������ ū�� ���ϴ� �޼ҵ� : 120, 54 �� ū�� ����ϱ�
		4. ���� �޴��� ����
		�޴� ���� : 

		----------------------------------------------------------------------------

		5. switch �� ��� ��
		switch(no)
		{
		case 1:	StaticMethodSample Ŭ������ testMathRandom() ����; break;
		case 2:	StaticMethodSample Ŭ������ testMathAbs() ����; break;
		case 3:	StaticMethodSample Ŭ������ testMathMax() ����; break;
		case 4:	System.out.println("���� �޴��� ���ư��ϴ�.");
			return;	//���� �޴��� �ǵ��ư�.
		default:	�߸��� �� �Է½� �޴� �ٽ� ��µǰ� ó��
		}
			
	<���� 15>
	=> subNonStaticMethodMenu() �޼ҵ� ���� ����
		1. NonStaticMethodSample Ŭ���� ���������� ����/����
		2. non-static �޼ҵ� ��� �׽�Ʈ�� ���� �޴� ����� : do~while�� �ݺ� ��� ó����
		3. ���õ� �޴� ��ȣ�� ���� NonStaticMethodSample Ŭ������ �޼ҵ� �����Ŵ
			: switch �� ���
		4. �޴� ��� ���� -------------------------------------------------------

		*** non-static �޼ҵ� ��� �׽�Ʈ �θ޴� ***

		1. Scanner Ŭ���� ��� : �ڷ��� �������� �� �Է¹޾� ����ϱ�
		2. Date Ŭ���� ��� : ���� ��¥, ���� �ð� ���� ����ϱ�
		3. Random Ŭ���� ��� : ������ �Ǽ��� ���� ���� ����ϱ�
		4. ���� �޴��� ����
		�޴� ���� : 

		----------------------------------------------------------------------------

		5. switch �� ��� ��
		switch(no)
		{
		case 1:	NonStaticMethodSample Ŭ������ testScanner() ����; break;
		case 2:	NonStaticMethodSample Ŭ������ testDate() ����; break;
		case 3:	NonStaticMethodSample Ŭ������ testRandom() ����; break;
		case 4:	System.out.println("���� �޴��� ���ư��ϴ�.");
			return;	//���� �޴��� �ǵ��ư�.
		default:	�߸��� �� �Է½� �޴� �ٽ� ��µǰ� ó��
		}

	<���� 16>
	 : VariableSample Ŭ���� ����
		1. �ʵ�� Scanner Ŭ������ ���� ���� ����/���� 
		2. �޼ҵ� �ۼ�
		  public void myProfile(){}
		  public void empInformation(){}
		  public void defaultValue(){}
		3. �� �޼ҵ��� ���� ������ ���� �߿� �ۼ��� �ҽ��� �����ϸ� �˴ϴ�.

	<���� 17>
	 : PrimitiveTypeSample Ŭ���� ����
		1. �ʵ�� Scanner Ŭ������ ���� ���� ����/���� 
		2. �޼ҵ� �ۼ�
	 	  public void typeSize(){}
		  public void minMaxValue(){}
		  public void bitSize(){}
		3. java.lang ��Ű���� �⺻�ڷ����� ���� �� ����Ŭ������ �ʵ带 �����.



	<���� 18>
	 : IfSample Ŭ���� ����
		1. �ʵ�� Scanner Ŭ������ ���� ���� ����/���� 
		2. �޼ҵ� �ۼ�
	 	  public void maxNumber(){}
		  public void minNumber(){}
		  public void threeMaxMin(){}
		  public void checkEven(){}
		  public void isPassFail(){}
		  public void scoreGrade(){}
		  public void checkPlusMinusZero(){}
		  public void whatCaracter(){}


	<���� 19>
	 : SwitchSample Ŭ���� ����
		1. �ʵ�� Scanner Ŭ������ ���� ���� ����/���� 
		2. �޼ҵ� �ۼ�
	 	  public void calculator(){}
		  public void fruitPrice(){}


	<���� 20>
	 : ForSample Ŭ������ ����
		1. �ʵ�� Scanner Ŭ������ ���� ���� ����/���� 
		2. �޼ҵ� �ۼ�
	 	  public void sum1To10(){}
		  public void sumEven1To100(){}
		  public void oneGugudan(){}
		  public void sumMinToMax(){}
		  public void printStar(){}
		  public void printNumberStar(){}
		  public void printTriangleStar(){}
		  public void guguDan(){}


	<���� 21>
	 : WhileSample Ŭ���� ����
		1. �ʵ�� Scanner Ŭ������ ���� ���� ����/���� 
		2. �޼ҵ� �ۼ�
	 	  public void printUniCode(){}
		  public void sum1To100(){}
		  public void numberGame(){}
		  public void countCharacter(){}
		  public void countInChar(){}


	<���� 22>
	 : DoWhileSample Ŭ���� ����
		1. �ʵ�� Scanner Ŭ������ ���� ���� ����/���� 
		2. �޼ҵ� �ۼ�
	 	  public void addDashToken(){}
		  public void burgerKingMenu(){}
			=> "���α׷� ����"�� "�����޴��� �̵�"���� ������ ��
		  public void isStringAlphabet(){}


	<���� 23>
	 : BreakSample Ŭ���� ����
		1. �ʵ�� Scanner Ŭ������ ���� ���� ����/���� 
		2. �޼ҵ� �ۼ�
	 	  public void sumBreak(){}
		  public void guguDanBreak(){}

	<���� 24>
	 : ContinueSample Ŭ���� ����
		1. �ʵ�� Scanner Ŭ������ ���� ���� ����/���� 
		2. �޼ҵ� �ۼ�
	 	  public void sumJumpThree(){}
		  public void rowColJump(){}


	<���� 25>
	 : StaticMethodSample Ŭ���� ����
		1. �ʵ�� Scanner Ŭ������ ���� ���� ����/���� 
		2. �޼ҵ� �ۼ�
	 	  public void testMathRandom(){}
		  public void testMathAbs(){}
		  public void testMathMax(){}

	<���� 26>
	 : NonStaticMethodSample Ŭ���� ����
		1. �ʵ�� Scanner Ŭ������ ���� ���� ����/���� 
		2. �޼ҵ� �ۼ�
	 	  public void testScanner(){}
		  public void testDate(){}
		  public void testRandom(){}

*/
}