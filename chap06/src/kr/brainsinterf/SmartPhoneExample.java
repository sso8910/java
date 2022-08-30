package kr.brainsinterf;

public class SmartPhoneExample {
	//인터페이스들을 정의하고, 다중구현을 통해 클래스를 정의
	//정의한 클래스로부터 객체를 생성하고
	//생성된 객체와 상호작용을 통해 문제를 해결
	
	//Java는 다중 상속은 지원하지 않음. 즉 extends 뒤에 하나만 나타남
	//인터페이스는 다중 구현이 가능함, 즉 implements 뒤에 여러개가 나타날 수 있음
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.call(SmartPhone.PHONE_NUMBER);
		//sp.call("010-1234-5678");
		sp.playMusic("번개맨송");
		//sp.sendMsg("010-1234-5678","아!힘들다");
		sp.sendMsg(SmartPhone.PHONE_NUMBER,"아!힘들다");
		Timer t=sp; // sp가 참조하는 객체를 Timer 인터페이스 구현한 구현체
		((SmartPhone)t).call(SmartPhone.PHONE_NUMBER); //명시적형변환:타이머 유형을 스마트폰유형으로 형변환
		sp.call(SmartPhone.PHONE_NUMBER);
	}
}
//형변환 왜하냐? 필요에 따라서 여러관점으로 바라 볼 수 있기 때문에 