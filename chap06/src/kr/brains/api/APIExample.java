package kr.brains.api;

public class APIExample {

	public static void main(String[] args) {
		Overriding over = new Overriding();
		Integer i1=new Integer(100);
		Integer i2=new Integer(100);
		if(i1==i2) // 두 참족변수가 참조하는 객체는 같은가?
			System.out.println("true");
		else
			System.out.println("false");
		
		String s1="비지니스분석가";
		String s2="비지니스분석가";
		//String s1=new String("비지니스 분석가");
		//String s2=new String("비지니스 분석가");
		if(s1==s2) //두 참조변수가 참조하는 객체는 같은가?
			System.out.println("true");
		else
			System.out.println("false");
		//System.out.println(s1.hashCode());
		//System.out.println(s2.hashCode());
		over.testEquals(s1, s2);
		//over.testEquals((Object)s1,(Object)s2);
		Object o1 = new Object();
		Object o2 = new Object();
		System.out.println(o1.toString());
		System.out.println(o2.toString());
		if(o1==o2)
			System.out.println("true");
		else
			System.out.println("false");
		//System.out.println(o1.hashCode());
		//System.out.println(o2.hashCode());
		over.testEquals(o1,o2);
		//shift 연산은 비트단위 연산
		// 128을 비트(bit)패턴 1 0000 0000 왼쪽 세번 밀기
		// 				   0 0010 0000
		//128/8과 같은 효과..? 한 번 왼쪽으로 밀릴 때 마다 2로 나누는 효과를 주도록하는 연산자
		System.out.println(Integer.toBinaryString(128));
		System.out.println(128 >> 3);
		System.out.println(128 << 3);
		
		Integer intRef = new Integer(100);
		try {//예외처리문장
			Integer infRef2 = Integer.valueOf("100L"); 
		} catch(NumberFormatException nfe) {
			System.out.println("예외발생처리:"+nfe.getMessage());
			System.exit(1);
		}
	
		Integer intRef3 = (Integer)100;
		System.out.println("예외처리 후"+intRef3);
		//wrapper class ; autoboxing
	}

}
