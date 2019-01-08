package com.kh.home.model;

public class PrimitiveTypeSample {
	public void typeSize() {
		System.out.println("byte의 메모리 할당크기 : "+Byte.BYTES);
		System.out.println("short의 메모리 할당크기 : "+Short.BYTES);
		System.out.println("int의 메모리 할당크기 : "+Integer.BYTES);
		System.out.println("long의 메모리 할당크기 : "+Long.BYTES);
		System.out.println("double의 메모리 할당크기 : "+Double.BYTES);
		System.out.println("float의 메모리 할당크기 : "+Float.BYTES);
		System.out.println("char의 메모리 할당크기 : "+Character.BYTES);
		//System.out.println("String의 메모리 할당크기 : "+String.BYTES);//에러
		//System.out.println("boolean의 메모리 할당크기 : "+Boolean.BYTES);//에러
	}
	public void minMaxValue() {
		System.out.println("기본자료형 값의 최소값, 최대값 출력하는 것은 배우지 않았습니다.");
		//배우진 않았지만 구글링 결과
		System.out.println("Byte의 최소값 : "+Byte.MIN_VALUE+"\n Byte의 최대값 : "+Byte.MAX_VALUE);
		System.out.println("Short의 최소값 : "+Short.MIN_VALUE+"\n Short의 최대값 : "+Short.MAX_VALUE);
		System.out.println("Int의 최소값 : "+Integer.MIN_VALUE+"\n Int의 최대값 : "+Integer.MAX_VALUE);
		System.out.println("Long의 최소값 : "+Long.MIN_VALUE+"\n byte의 최대값 : "+Long.MAX_VALUE);
		System.out.println("Double의 최소값 : "+Double.MIN_VALUE+"\n Double의 최대값 : "+Double.MAX_VALUE);
		System.out.println("Float의 최소값 : "+Float.MIN_VALUE+"\n Float의 최대값 : "+Float.MAX_VALUE);
		System.out.println("Char의 최소값 : "+Character.MIN_VALUE+"\n Char의 최대값 : "+Character.MAX_VALUE);//왜 알 수 없는 문자가 뜨는지 모르겠습니다.
		//System.out.println("String의 메모리 할당크기 : "+String.BYTES+"\n String의 최대값");//에러
		//System.out.println("boolean의 메모리 할당크기 : "+Boolean.BYTES+"\n boolean의 최대값");//에러
	}
	public void bitSize() {
		//1바이트당 8비트니까 각각 곱하기 8
		System.out.println("Byte의 비트갯수 : "+Byte.BYTES*8);
		System.out.println("Short의 비트갯수 : "+Short.BYTES*8);
		System.out.println("Integer의 비트갯수 : "+Integer.BYTES*8);
		System.out.println("Long의 비트갯수 : "+Long.BYTES*8);
		System.out.println("Double의 비트갯수 : "+Double.BYTES*8);
		System.out.println("Float의 비트갯수 : "+Float.BYTES*8);
		System.out.println("Character의 비트갯수 : "+Character.BYTES*8);
		//System.out.println("byte의 비트갯수 : "+Byte.BYTES*8);
		//System.out.println("byte의 비트갯수 : "+Byte.BYTES*8);
	}
}
