package com.kh.home.model;
import java.util.Scanner;
public class DoWhileSample {
	Scanner sc = new Scanner(System.in);
	public void addDashToken() {
		/*System.out.print("���ڿ� �Է� : ");
		String str=sc.nextLine();
		int index=0;
		do {
			
		}while(index<str.length());*/
		System.out.println("���ڻ��̿� �ٸ� ����, ���� �����ִ°��� �ȹ��� �����ϴ�.");
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
			System.out.println("1.�Ұ����� ---1000��");
			System.out.println("2.������� -----1000��");
			System.out.println("3.�������� -----1000��");
			System.out.println("4.ġ����� -----1000��");
			System.out.println("5.�ݶ� --------1000��");
			System.out.println("6.�����̵� ---1000��");
			System.out.println("7.Ŀ�� --------1000��");
			System.out.print("�޴� ��ȣ �Է� : ");
			int menuNum = sc.nextInt();
			switch(menuNum) {
			case 1 : menu="�Ұ�����";charge=1000;break;
			case 2 : menu="�������";charge=2000;break;
			case 3 : menu="��������";charge=1500;break;
			case 4 : menu="ġ�����";charge=2500;break;
			case 5 : menu="�ݶ�";charge=500;break;
			case 6 : menu="�����̵�";charge=1500;break;
			case 7 : menu="Ŀ��";charge=1000;break;
			}
			System.out.print("���� �Է� : ");
			amount=sc.nextInt();
			pay=charge*amount;
			totalPay+=pay;
			totalMenu+=menu+" : "+amount+"�� = "+pay+"��\n";
			System.out.print("�߰��ֹ��Ͻðڽ��ϱ�? (Y/N) : ");
			char ans=sc.next().charAt(0);
			if(ans=='n'||ans=='N')break;
		}while(true);
		System.out.println("=================");
		System.out.println(totalMenu);
		System.out.println("=================");
		System.out.println("�� �ݾ� -----"+totalPay+"��");
		//���α׷� ���Ḧ �����޴��� �̵� �̶�� ���� ���� �Ȱ��ϴ�.
		//������� �ʰ� �����޴��� ���� �����̽���..?
	}
	public void isStringAlphabet() {
		System.out.println("�𸣰ھ��..");
		/*System.out.print("���ڿ� �Է� : ");
		String str=sc.nextLine();
		int i=0;
		do {
			char ch= str.charAt(i);
			if(ch<'A'||ch>'Z'&&ch<'a'||ch>'z') {
				break;
			}
			i++;
		}while(i<str.length());
		System.out.println("��� ���ڰ� �������Դϴ�.");
		System.out.println("��� ���ڰ� �����ڰ� �ƴϴ�.");*/
	}

}
