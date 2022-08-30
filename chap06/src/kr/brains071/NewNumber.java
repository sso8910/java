package kr.brains071;

import java.lang.*;

public class NewNumber extends Number { 
	//추상클래스를 상속
	// 추상클래스: 추상 메소드를 하나 이상 가지고 있는 클래스
	// 추상 메소드 : abstract예약어와 메소드 선언(사용법)만을 갖는 메소드
	// 상속 받은 클래스에서 구현해야 함을 명시하는 역할
	// 클래스 : 모든 메소드가 구현된 상태
	private int value;
	public NewNumber(int i){
		value=i;
	}
	
	public byte byteValue() { //재정의
		return(byte)value;
	}
	
	public short shortValue() { //overriding
		return(short)(value*2);
	}
	/*
	public short shortValue() { //overriding
		return -1;
	}
	*/

}
