package kr.brainsinterf;

public class Something {
	//자료 구조(data structure):재료
	//캡슐화(encapsulation):클래스로 필드, 메소드 구성
	//  ->자료추상화(data abstriction): 자료를 처리하기 위한 최소한의 정보만을 사용할 수 있도록 함 
	//  ->정보은닉(imformation hiding) : 필요한 정보만 접근하게 함
	//oop의 주요개념 : 캡슐화,상속성,다형성
	private String title;
	private String content;
	private String writer;
	private String regDate;
	
	//자료구조를 활용하는 메소드:가공,연산
	public void printAllFields(){
		System.out.println(title);
		System.out.println(content);
		System.out.println(writer);
		System.out.println(regDate);
	}
}
