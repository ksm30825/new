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
			System.out.print("\n***** ���α׷��� �⺻ ��� �׽�Ʈ ���α׷� *****\r\n" + 
					"\r\n" + 
					"1. ���� �׽�Ʈ\r\n" + 
					"2. �⺻ �ڷ��� �׽�Ʈ\r\n" + 
					"3. if�� �׽�Ʈ\r\n" + 
					"4. switch�� �׽�Ʈ\r\n" + 
					"5. for�� �׽�Ʈ\r\n" + 
					"6. while�� �׽�Ʈ\r\n" + 
					"7. do~while�� �׽�Ʈ\r\n" + 
					"8. break�� �׽�Ʈ\r\n" + 
					"9. continue�� �׽�Ʈ\r\n" + 
					"10. static �޼ҵ� ��� �׽�Ʈ\r\n" + 
					"11. non-static �޼ҵ� ��� �׽�Ʈ\r\n" + 
					"12. ���α׷� ����\r\n\n");
			System.out.print("�޴� ��ȣ �Է� : ");
			int menu=sc.nextInt();
			System.out.println();
			switch(menu){
			case 1 : System.out.println("1. ���� �׽�Ʈ");subVarMenu();break;
			case 2 : System.out.println("2. �⺻ �ڷ��� �׽�Ʈ");subPTypeMenu();break;
			case 3 : System.out.println("3. if�� �׽�Ʈ");subIfMenu();break;
			case 4 : System.out.println("4. switch�� �׽�Ʈ");subSwitchMenu();break;
			case 5 : System.out.println("5. for�� �׽�Ʈ");subForMenu();break;
			case 6 : System.out.println("6. while�� �׽�Ʈ");subWhileMenu();break;
			case 7 : System.out.println("7. do~while�� �׽�Ʈ");subDoWhileMenu();break;
			case 8 : System.out.println("8. break�� �׽�Ʈ");subBreakMenu();break;
			case 9 : System.out.println("9. continue�� �׽�Ʈ");subContinueMenu();break;
			case 10 : System.out.println("10. static �޼ҵ� ��� �׽�Ʈ");subStaticMethodMenu();break;
			case 11 : System.out.println("11. non-static �޼ҵ� ��� �׽�Ʈ");subNonStaticMethodMenu();break;
			case 12 : System.out.println("12. ���α׷� ����");
			System.out.print("������ �����Ͻðڽ��ϱ�? (Y/N) : ");
			char ans = sc.next().charAt(0);
			if(ans=='y'||ans=='Y')break label;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�.");mainMenu();break;
			}
		}while(true);
	}
	public static void subVarMenu(){
		VariableSample variable = new VariableSample();
		do { 
			System.out.println("\n*** ���� �׽�Ʈ �θ޴� ***\r\n" + 
					"\r\n" + 
					"1. �� �Ż����� ������ ��� ����ϱ�\r\n" + 
					"2. ��������� Ű����� �Է¹޾� ����ϱ�\r\n" + 
					"3. �⺻ �ڷ��� ������ �ʱⰪ Ȯ���ϱ�\r\n" + 
					"4. ���� �޴��� ����\r\n");
			System.out.print("�޴� ��ȣ �Է� : ");
			int menu=sc.nextInt();
			System.out.println();
			switch(menu) {
			case 1 : System.out.println("1. �� �Ż����� ������ ��� ����ϱ�");variable.myProfile();break;
			case 2 : System.out.println("2. ��������� Ű����� �Է¹޾� ����ϱ�");variable.empInformation();break;
			case 3 : System.out.println("3. �⺻ �ڷ��� ������ �ʱⰪ Ȯ���ϱ�");variable.defaultValue();break;
			case 4 : System.out.println("���� �޴��� ���ư��ϴ�.");return;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�.");subVarMenu();break;
			}
		}while(true);
	}
	public static void subPTypeMenu(){
		PrimitiveTypeSample primitive = new PrimitiveTypeSample(); 
		do { 
			System.out.println("\r\n" + 
					"*** �⺻�ڷ��� �׽�Ʈ �θ޴� ***\r\n" + 
					"\r\n" + 
					"1. �⺻�ڷ��� �޸� �Ҵ�ũ�� Ȯ���ϱ�\r\n" + 
					"2. �⺻�ڷ��� ���� �ּҰ�, �ִ밪 ����ϱ�\r\n" + 
					"3. �⺻�ڷ��� ��Ʈ���� Ȯ���ϱ�\r\n" + 
					"4. ���� �޴��� ����\r\n");
			System.out.print("�޴� ��ȣ �Է� : ");
			int menu=sc.nextInt();
			System.out.println();
			switch(menu) {
			case 1 : System.out.println("1. �⺻�ڷ��� �޸� �Ҵ�ũ�� Ȯ���ϱ�");primitive.typeSize();break;
			case 2 : System.out.println("2. �⺻�ڷ��� ���� �ּҰ�, �ִ밪 ����ϱ�");primitive.minMaxValue();break;
			case 3 : System.out.println("3. �⺻�ڷ��� ��Ʈ���� Ȯ���ϱ�");primitive.bitSize();break;
			case 4 : System.out.println("4. ���� �޴��� ����");return;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�.");subPTypeMenu();break;
			}
		}while(true);
	}
	public static void subIfMenu(){
		IfSample ifS = new IfSample();
		do { 
			System.out.println("\r\n" + 
					"*** if�� �׽�Ʈ �θ޴� ***\r\n" + 
					"\r\n" + 
					"1. �� ���� ������ �Է¹޾�, �� ���� ū �� ����ϱ�\r\n" + 
					"2. �� ���� ������ �Է¹޾�, �� ���� ���� �� ����ϱ�\r\n" + 
					"3. �� ���� ������ �Է¹޾�, �� ���� ���� ū���� ���� ������ ����ϱ�\r\n" + 
					"4. �� ���� ������ �Է¹޾�, ¦������ Ȧ������ ����ϱ�\r\n" + 
					"5. ��,��,�� �� ������ ������ �Է¹޾�, �հ�/���հ� Ȯ���ϱ�\r\n" + 
					"6. ������ �Է¹޾�, ���� Ȯ���ϱ�\r\n" + 
					"7. �� ���� ������ �Է¹޾�, ������� 0���� �������� Ȯ���ϱ�\r\n" + 
					"8. ���� �ϳ��� �Է¹޾�, ����빮������ �ҹ������� ���ڹ������� ��Ÿ�������� Ȯ���ϱ�\r\n" + 
					"9. ���� �޴��� ����");
			System.out.print("�޴� ��ȣ �Է� : ");
			int menu=sc.nextInt();
			System.out.println();
			switch(menu) {
			case 1 : System.out.println("1. �� ���� ������ �Է¹޾�, �� ���� ū �� ����ϱ�");ifS.maxNumber();break;
			case 2 : System.out.println("2. �� ���� ������ �Է¹޾�, �� ���� ���� �� ����ϱ�");ifS.minNumber();break;
			case 3 : System.out.println("3. �� ���� ������ �Է¹޾�, �� ���� ���� ū���� ���� ������ ����ϱ�");ifS.threeMaxMin();break;
			case 4 : System.out.println("4. �� ���� ������ �Է¹޾�, ¦������ Ȧ������ ����ϱ�");ifS.checkEven();break;
			case 5 : System.out.println("5. ��,��,�� �� ������ ������ �Է¹޾�, �հ�/���հ� Ȯ���ϱ�");ifS.isPassFail();break;
			case 6 : System.out.println("6. ������ �Է¹޾�, ���� Ȯ���ϱ�");ifS.scoreGrade();break;
			case 7 : System.out.println("7. �� ���� ������ �Է¹޾�, ������� 0���� �������� Ȯ���ϱ�");ifS.checkPlusMinusZero();break;
			case 8 : System.out.println("8. ���� �ϳ��� �Է¹޾�, ����빮������ �ҹ������� ���ڹ������� ��Ÿ�������� Ȯ���ϱ�");ifS.whatCaracter();break;
			case 9 : System.out.println("9. ���� �޴��� ����");return;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�.");subIfMenu();break;
			}
		}while(true);
	}
	public static void subSwitchMenu(){
		SwitchSample switchS= new SwitchSample();
		//1�� ����� 2�� �����Ϸ��ϸ� �Է��ϱ⵵ ���� �Է��� �Ǹ鼭 �ٽ� �޴��� ��
		//sc.nextLine(); �� �߰��߰��� �ٿ��������� ������ ���͸� �ȴ����� ���� ���� �ȳ���
		//�ذ� ����� �𸣰���
		do { 
			System.out.println("\r\n" + 
					"*** switch�� �׽�Ʈ �θ޴� ***\r\n" + 
					"\r\n" + 
					"1. �� ���� ������ �� ���� ���깮�ڸ� �Է¹޾� ����� ��� Ȯ���ϱ�\r\n" + 
					"2. �����̸��� ���ڿ��� �Է¹޾�, �� ������ ���� ����ϱ�\r\n" + 
					"3. ���� �޴��� ����");
			System.out.print("�޴� ��ȣ �Է� : ");
			String menu=sc.nextLine();
			System.out.println();
			switch(menu) {
			case "1" : System.out.println("1. �� ���� ������ �� ���� ���깮�ڸ� �Է¹޾� ����� ��� Ȯ���ϱ�");switchS.calculator();break;
			case "2" : System.out.println("2. �����̸��� ���ڿ��� �Է¹޾�, �� ������ ���� ����ϱ�");switchS.fruitPrice();break;
			case "3" : System.out.println("3. ���� �޴��� ����");return;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�.");subSwitchMenu();break;
			}
		}while(true);
	}
	public static void subForMenu(){
		ForSample forS = new ForSample();
		do { 
			System.out.println("\r\n" + 
					"*** for�� �׽�Ʈ �θ޴� ***\r\n" + 
					"\r\n" + 
					"1. 1~10���� �������� �հ� ���ϱ�\r\n" + 
					"2. 1~100������ ¦������ �հ� ���ϱ�\r\n" + 
					"3. ���� �ϳ� �Է¹޾�, �� ���� ������ ����ϱ�\r\n" + 
					"4. �� ���� ������ �Է¹޾�, �� ���� ���� ������ ū �������� �հ� ���ϱ�\r\n" + 
					"5. �ټ��� ĭ�� �Է¹޾�, �Էµ� �ټ�/ĭ����ŭ ��ǥ���� ����ϱ�\r\n" + 
					"6. 7�ٿ� 7ĭ�� ��ǥ���� ����ϵ�, �� �ٿ� �ٹ�ȣ�� ���� ĭ�� ���� ����ϱ�\r\n" + 
					"7. �ټ��� �Է¹޾�, �ﰢ�� ������� ��ǥ���� ����ϱ�(���:�����ﰢ��, ����:���ﰢ��)\r\n" + 
					"8. ������ 2�ܺ��� 9�ܱ��� ����ϱ�\r\n" + 
					"9. ���� �޴��� ����");
			System.out.print("�޴� ��ȣ �Է� : ");
			int menu=sc.nextInt();
			System.out.println();
			switch(menu) {
			case 1 : System.out.println("1. 1~10���� �������� �հ� ���ϱ�");forS.sum1To10();break;
			case 2 : System.out.println("2. 1~100������ ¦������ �հ� ���ϱ�");forS.sumEven1To100();break;
			case 3 : System.out.println("3. ���� �ϳ� �Է¹޾�, �� ���� ������ ����ϱ�");forS.oneGugudan();break;
			case 4 : System.out.println("4. �� ���� ������ �Է¹޾�, �� ���� ���� ������ ū �������� �հ� ���ϱ�");forS.sumMinToMax();break;
			case 5 : System.out.println("5. �ټ��� ĭ�� �Է¹޾�, �Էµ� �ټ�/ĭ����ŭ ��ǥ���� ����ϱ�");forS.printStar();break;
			case 6 : System.out.println("6. 7�ٿ� 7ĭ�� ��ǥ���� ����ϵ�, �� �ٿ� �ٹ�ȣ�� ���� ĭ�� ���� ����ϱ�");forS.printNumberStar();break;
			case 7 : System.out.println("7. �ټ��� �Է¹޾�, �ﰢ�� ������� ��ǥ���� ����ϱ�(���:�����ﰢ��, ����:���ﰢ��)");forS.printTriangleStar();break;
			case 8 : System.out.println("8. ������ 2�ܺ��� 9�ܱ��� ����ϱ�");forS.guguDan();break;
			case 9 : System.out.println("9. ���� �޴��� ����");return;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�.");subForMenu();break;
			}
		}while(true);
	}
	public static void subWhileMenu(){
		WhileSample whileS = new WhileSample();
		do { 
			System.out.println("\r\n" + 
					"\n*** while�� �׽�Ʈ �θ޴� ***\r\n" + 
					"\r\n" + 
					"1. ���� �ϳ� �Է¹޾�, �� ������ �����ڵ� ��� �ݺ�('0' �ԷµǸ� �ݺ�����)\r\n" + 
					"2. 1~100���� �������� �հ� ����ϱ�(while ������ �ۼ�)\r\n" + 
					"3. 1~100������ ������ ������ �߻�����, ���� �˾Ƹ��߱�\r\n" + 
					"4. ���ڿ��� �Է¹޾�, ���� ���� �˾Ƴ��� ����ϱ�\r\n" + 
					"5. ���ڿ����� ���� �ϳ��� �Է¹޾�, ���ڿ��� ���ڰ� �� �� �ִ��� Ȯ���ϱ�\r\n" + 
					"6. ���� �޴��� ����");
			System.out.print("�޴� ��ȣ �Է� : ");
			int menu=sc.nextInt();
			System.out.println();
			switch(menu) {
			case 1 : System.out.println("1. ���� �ϳ� �Է¹޾�, �� ������ �����ڵ� ��� �ݺ�('0' �ԷµǸ� �ݺ�����)");whileS.printUniCode();break;
			case 2 : System.out.println("2. 1~100���� �������� �հ� ����ϱ�(while ������ �ۼ�)");whileS.sum1To100();break;
			case 3 : System.out.println("3. 1~100������ ������ ������ �߻�����, ���� �˾Ƹ��߱�");whileS.numberGame();break;
			case 4 : System.out.println("4. ���ڿ��� �Է¹޾�, ���� ���� �˾Ƴ��� ����ϱ�");whileS.countCharacter();break;
			case 5 : System.out.println("5. ���ڿ����� ���� �ϳ��� �Է¹޾�, ���ڿ��� ���ڰ� �� �� �ִ��� Ȯ���ϱ�");whileS.countInChar();break;
			case 6 : System.out.println("6. ���� �޴��� ����");return;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�.");subWhileMenu();break;
			}
		}while(true);
	}
	public static void subDoWhileMenu(){
		DoWhileSample dowhileS = new DoWhileSample();
		do { 
			System.out.println("\r\n" + 
					"*** do~while�� �׽�Ʈ �θ޴� ***\r\n" + 
					"\r\n" + 
					"1. ���ڿ��� �Է¹޾�, ���� ���̿� '-' �����־� ����ϱ�\r\n" + 
					"2. ����ŷ �޴� �ֹ� �׽�Ʈ\r\n" + 
					"3. ���ڿ� �Է¹޾�, \"��� ���� �����ڴ�\"/\"������ �ƴϴ�.\" ����ϱ�\r\n" + 
					"4. ���� �޴��� ����");
			System.out.print("�޴� ��ȣ �Է� : ");
			int menu=sc.nextInt();
			System.out.println();
			switch(menu) {
			case 1 : System.out.println("1. ���ڿ��� �Է¹޾�, ���� ���̿� '-' �����־� ����ϱ�");dowhileS.addDashToken();break;
			case 2 : System.out.println("2. ����ŷ �޴� �ֹ� �׽�Ʈ");dowhileS.burgerKingMenu();break;
			case 3 : System.out.println("3. ���ڿ� �Է¹޾�, \\\"��� ���� �����ڴ�\\\"/\\\"������ �ƴϴ�.\\\" ����ϱ�");dowhileS.isStringAlphabet();break;
			case 4 : System.out.println("4. ���� �޴��� ����");return;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�.");subDoWhileMenu();break;
			}
		}while(true);
	}
	public static void subBreakMenu(){
		BreakSample breakS = new BreakSample();
		do { 
			System.out.println("\r\n" + 
					"*** break�� �׽�Ʈ �θ޴� ***\r\n" + 
					"\r\n" + 
					"1. 1~100���� �������� �հ� ����ϱ�(break�� ���)\r\n" + 
					"2. ������ 1��~9�ܱ��� ����ϵ�, * 5 ��꿡�� �ݺ��� ������(break �̸� ���)\r\n" + 
					"3. ���� �޴��� ����");
			System.out.print("�޴� ��ȣ �Է� : ");
			int menu=sc.nextInt();
			System.out.println();
			switch(menu) {
			case 1 : System.out.println("1. 1~100���� �������� �հ� ����ϱ�(break�� ���)");breakS.sumBreak();break;
			case 2 : System.out.println("2. ������ 1��~9�ܱ��� ����ϵ�, * 5 ��꿡�� �ݺ��� ������(break �̸� ���)");breakS.guguDanBreak();break;
			case 3 : System.out.println("3. ���� �޴��� ����");return;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�.");subBreakMenu();break;
			}
		}while(true);
	}
	public static void subContinueMenu(){
		ContinueSample conS = new ContinueSample();
		do { 
			System.out.println("\r\n" + 
					"*** continue�� �׽�Ʈ �θ޴� ***\r\n" + 
					"\r\n" + 
					"1. 1~100������ ���� �� 3�� ����� �� �������� �հ� ����ϱ�\r\n" + 
					"2. 3�� 5���� �࿭�� ����ϵ�, 1�� 3������ 1�� 5������ �����ϰ� ����ϱ�\r\n" + 
					"3. ���� �޴��� ����");
			System.out.print("�޴� ��ȣ �Է� : ");
			int menu=sc.nextInt();
			System.out.println();
			switch(menu) {
			case 1 : System.out.println("1. 1~100������ ���� �� 3�� ����� �� �������� �հ� ����ϱ�");conS.sumJumpThree();break;
			case 2 : System.out.println("2. 3�� 5���� �࿭�� ����ϵ�, 1�� 3������ 1�� 5������ �����ϰ� ����ϱ�");conS.rowColJump();break;
			case 3 : System.out.println("3. ���� �޴��� ����");return;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�.");subContinueMenu();break;
			}
		}while(true);
	}
	public static void subStaticMethodMenu(){
		StaticMethodSample staticS = new StaticMethodSample();
		do { 
			System.out.println("\r\n" + 
					"*** static �޼ҵ� ��� �׽�Ʈ �θ޴� ***\r\n" + 
					"\r\n" + 
					"1. Math Ŭ������ ������ ���ϴ� �޼ҵ� : 1~45������ ������ ���� ���\r\n" + 
					"2. Math Ŭ������ �Ǽ����� ���� ���밪 ���ϴ� �޼ҵ� : -12.77 ���밪 ����ϱ�\r\n" + 
					"3. Math Ŭ������ �� ������ ū�� ���ϴ� �޼ҵ� : 120, 54 �� ū�� ����ϱ�\r\n" + 
					"4. ���� �޴��� ����");
			System.out.print("�޴� ��ȣ �Է� : ");
			int menu=sc.nextInt();
			System.out.println();
			switch(menu) {
			case 1 : System.out.println("1. Math Ŭ������ ������ ���ϴ� �޼ҵ� : 1~45������ ������ ���� ���");staticS.testMathRandom();break;
			case 2 : System.out.println("2. Math Ŭ������ �Ǽ����� ���� ���밪 ���ϴ� �޼ҵ� : -12.77 ���밪 ����ϱ�");staticS.testMathAbs();break;
			case 3 : System.out.println("3. Math Ŭ������ �� ������ ū�� ���ϴ� �޼ҵ� : 120, 54 �� ū�� ����ϱ�");staticS.testMathMax();break;
			case 4 : System.out.println("4. ���� �޴��� ����");return;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�.");subStaticMethodMenu();break;
			}
		}while(true);
	}
	public static void subNonStaticMethodMenu(){
		NonStaticMethodSample nonstaticS =new NonStaticMethodSample();
		do { 
			System.out.println("\r\n" + 
					"*** non-static �޼ҵ� ��� �׽�Ʈ �θ޴� ***\r\n" + 
					"\r\n" + 
					"1. Scanner Ŭ���� ��� : �ڷ��� �������� �� �Է¹޾� ����ϱ�\r\n" + 
					"2. Date Ŭ���� ��� : ���� ��¥, ���� �ð� ���� ����ϱ�\r\n" + 
					"3. Random Ŭ���� ��� : ������ �Ǽ��� ���� ���� ����ϱ�\r\n" + 
					"4. ���� �޴��� ����");
			System.out.print("�޴� ��ȣ �Է� : ");
			int menu=sc.nextInt();
			System.out.println();
			switch(menu) {
			case 1 : System.out.println("1. Scanner Ŭ���� ��� : �ڷ��� �������� �� �Է¹޾� ����ϱ�");nonstaticS.testScanner();break;
			case 2 : System.out.println("2. Date Ŭ���� ��� : ���� ��¥, ���� �ð� ���� ����ϱ�");nonstaticS.testDate();break;
			case 3 : System.out.println("3. Random Ŭ���� ��� : ������ �Ǽ��� ���� ���� ����ϱ�");nonstaticS.testRandom();break;
			case 4 : System.out.println("4. ���� �޴��� ����");return;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�.");subNonStaticMethodMenu();break;
			}
		}while(true);
	}

}
