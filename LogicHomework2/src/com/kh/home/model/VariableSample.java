package com.kh.home.model;
import java.util.Scanner;
public class VariableSample {
	Scanner sc = new Scanner(System.in);
	byte b;
	short s;
	int i;
	long l;
	double d;
	float f;
	char c;
	String str;
	public void  myProfile() {
		String name = "김수민";
		int age = 31;
		double height = 152.3;
		System.out.println(name+"은 "+age+"세이며, 키는 "+height+"cm입니다.");
	}
	public void empInformation() {
		System.out.println("====사원정보====");
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("학교를 입력하세요 : ");
		String school = sc.nextLine();
		System.out.print("성별을 입력하세요 (F/M) : ");
		char gender = sc.next().charAt(0);
		sc.nextLine();
		String changeGender=(gender=='f'||gender=='F')?"여성":"남성";
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println(changeGender+" "+name+"씨는 "+school+"학교 출신이고, "+age+"세 입니다.");
		sc.nextLine();
	}
	public void defaultValue() {
		System.out.println("byte의 초기값 : "+b);
		System.out.println("short의 초기값 : "+s);
		System.out.println("int의 초기값 : "+i);
		System.out.println("long의 초기값 : "+l);
		System.out.println("double의 초기값 : "+d);
		System.out.println("float의 초기값 : "+f);
		System.out.println("char의 초기값 : "+c);
		System.out.println("string 초기값 : "+str);
	}

}
