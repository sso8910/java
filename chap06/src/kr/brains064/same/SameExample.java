package kr.brains064.same;
//같은 패키지에 존재하는 클래스는 import없이 사용 가능
import kr.brains064.other.*;
import kr.brains064.other.Protected;

public class SameExample extends Protected{

	public static void main(String[] args) {
		
		Same same = new Same(); //same 클래스 만들고 접근
		System.out.println("Same Pakage:같은 패키지");
		//System.out.println(same.privateField);
		System.out.println(same.defaultField);
		System.out.println(same.protectedField);
		System.out.println(same.publicField);
				
		SameExample se = new SameExample();
		System.out.println("Inheritance Relationship:상속관계");
		//System.out.println(se.privateField);
		//System.out.println(Se.defaultField);
		System.out.println(se.protectedField); //protected 메소드
		System.out.println(se.publicField);

		Other other=new Other();
		System.out.println("Other Pakage : 아무 관계 없는 경우");
		//System.out.println(same.privateField);
		//System.out.println(other.defaultField);
		//protected가 되려면 상속 관계가 있어야함
		//System.out.println(other.protectedField);
		System.out.println(other.publicField);
	}

}
