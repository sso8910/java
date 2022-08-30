package kr.brainsinterf;

public interface Phone {
	//인터페이스 안에 있는 모든 필드는 정적 최종이다.
	//즉,상수변수(상수)이다.
	String PHONE_NUMBER="010-4567-1234"; //프로그램끝날때까지 안바뀜 고정
	void call(String phoneNumber);
	void receive();
}
