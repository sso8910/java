package kr.brains062;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayListExt<String> ale = new ArrayListExt<String>();
		/*
		Integer k=100 ;//i는 Integer 클래스형 변수
		//implicit type conversion(묵시적 형변환):오토박싱
		int j=50;
		//100을 이진수로 출력해라
		System.out.println(Integer.toBinaryString(k));
		*/

		ale.add("고객");
		ale.add("경험");
		ale.add("데이터를");
		ale.add("활용한");
		ale.add("데이터");
		ale.add("비지니스");
		ale.add("분석가 과정");
		ale.printHello();
		ale.add(); //add(T) add()중첩(overloading)
		System.out.println(ale.lastIndexOf("경험"));
		// for문: 반복횟수가 정해져있는 경우 사용, 순차접근 가능, 제어변수에 따른 접근 가능 
		for(int i=0;i<ale.size();i++) 
			System.out.print(ale.get(i) + " "); 
		System.out.println(" ");
		//foreach statement 14,15랑 같은 출력값을 나타냄/ collection 객체의 순차적 접근
		for(String s:ale)			
			System.out.print(s + " ");
		}
	}