package kr.brains063;

import java.util.ArrayList;

public class CarExample extends ArrayList {
	String programName="CarExample";
	
	public static void main(String[] args) {
		CarExample ce = new CarExample();
		System.out.println(ce.programName);
		//setGas()정적 메소드가 아니므로 객체 생성 후 접근 가능
		//Car.MODEL="전기차";
		System.out.println("현재모델: "+ Car.MODEL);
		System.out.println("가장 큰 int 값: "+Integer.MAX_VALUE);
		int i= 1_000_000_000;
		int j= 1000000000;
		Car car = new Car(); //객체생성
		//car.model = "가스차"; //인스턴스변수값배정(assignmet)
		car.setGas("70L"); //30L //Setter를 이용한 값 배정 
		//검증된 값을 배정 // "70L"문자열
		//car.gas=61
		System.out.println("현재 Gas:"+car.getGas());
		car.run();
		
		/*
		String str ="현대자동차";
		System.out.println(str.charAt(3));
		int i = 66;
		//Integer : int 기본형을 효과적으로 조작하기 위해 정의한 클래스
		//Wrapper Class: 기본자료형을 효과적응로 조작하기 위해 정의한 클래스
		System.out.println(Integer.toHexString(i));
		*/
	}

}
