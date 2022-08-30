package kr.brains;
//하나의 파일에는 public class가 하나만 존재함
//파일 이름은 public class가 있는 경우 public class이름임
//public class가 없는 경우 이름은 선택가능함
//class으 ㅣ이름은 대문자로 시작한다.
//생성자는 class 이름과 같고, 반환 유형이 없다.

public class Calculator {
	//10+20;10,20 피연산자,+연산자
	//access modifier : 접근 수정자, 접근 식별자
	//public(누구나 사용)
	//protected(같은 패키지에 있지 않아도 상속 관계에 있으면 사용),
	//기본(아무것도 쓰지 않음_같은 패키지에 있는 클래스들만 사용하게 해줄래)
	//private(나혼자사용할때)
	private int operand1;
	private int operand2;
	private String operator;
	
	//constructor:객체 초기화
	//this : 
	//public이 있으면 class가 달라도 돌아감, 없으면 다른 class에서는 안돌아감
	//private는 아무도 못씀 나만 쓸 수 있음
	public Calculator() {
		this.operand1=10;
		this.operator="+";
		this.operand2=20;
	}
	public Calculator(int o1,String op,int o2) {
		this.operand1=o1;
		this.operator=op;
		this.operand2=o2;
	}
	//custom method
	//int: 반환유형, 리턴타입-메소드 처리후 반환하는 값의 유형
	public int calc() {
		int result=0; //지역변수
		if(operator.equals("+"))
			result=operand1+operand2;//operand1..:인스턴스변수
		else if(operator.equals("-"))
				result=operand1+operand2;
		else if(operator.equals("*"))
			result=operand1*operand2;
		else if(operator.equals("/"))
			result=operand1/operand2;
		return result;
	}	
	
}
