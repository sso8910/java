package kr.brains062;

//같은 패키지에 존재하는 클래스나 java.lang패키지에 포함된 클래스는 import없이 사용 가능
import java.util.ArrayList; 
//컴파일러에게 지정한 패키지의 클래스 사용을 알림
//import java.lang.String;
//자동으로 comfort하기때메 굳이 안써도 됨

//JCF:Java Collection Framework
//이해:상속,인터페이스,추상클래스,제너릭(Generics)


public class ArrayListExt<T> extends ArrayList<T> {
	//kr.brains062.ArrayListExt
	public void printHello() {
		System.out.println("클래스,객체,상속 어렵다"); //메소드추가
	}
	public boolean add() {
		// 중첩:이름같고,매개변수 개숫, 타입 다름(기존메소드 사용가능)
		super.add((T)"유응구");
		//System.out.println("자바프로그래밍");
		return true;
	}
	public int lastIndexOf(Object o) {
		return 100;
	}
}
