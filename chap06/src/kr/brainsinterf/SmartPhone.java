package kr.brainsinterf;
//다중구현
//JAVA 클래스 단일 상속-<서브클래스>extends<수퍼클래스>
//인터페이스 다중 상속 지원 - <서브인터페이스> extends <수퍼인터페이스>[,<수퍼인터페이스>,...]다수 
//인터페이스 다중 구현 지원 - <클래스> implements <인터페이스>[,<인터페이스>,...]다수 
//다중구현 실습
public class SmartPhone implements CameraPhone, Messenger,Timer {

	@Override
	public void sendMsg(String phoneNumber, String msg) {
		System.out.printf("[%s]로 %s메시지 전송\n",phoneNumber,msg);
	}
	@Override
	public void receiveMsg() {
		System.out.println("메세지가 도착했습니다");
	}
	@Override
	public void playBeep() {
		System.out.println("알람 : 비프음 재생");	
	}
	@Override
	public void playMusic(String title) {
		System.out.printf("알람 : %s 음악재생.\n",title);
	}
	@Override
	public void call(String phoneNumber) {
		System.out.println(phoneNumber+"에 전화를겁니다.");
	}
	@Override
	public void receive() {
		System.out.println("전화를 받습니다.");
	}
	@Override
	public void takeaPicture() {
		System.out.println("찰칵.");
	}

}
