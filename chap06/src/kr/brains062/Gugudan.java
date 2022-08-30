package kr.brains062;

public class Gugudan {
	private int col=9;
	private int row=9; //마지막 단을 지정하는 수
	int dan=2; // 인스턴스 변수: 구구단의 시작을 지정하는 수 
	
	public Gugudan(int dan) {
		this.dan = dan;
	}
	//지정한 단만 출력
	public void printOne(int dan) { // dan은 지역변수, 메소드 안에서만 유효
		for (int i=1;i<=col;i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
	}
	
	//2~9단을 출력
	public void printAll() {
		for(int i=2 ; i<=row;i++) {
			printOne(i);
		}
	}
	//지정한 단부터 9단까지 출력
	public void printFrom(int dan) {
		for(int i=dan; i<=row; i++) {
			printOne(i);
		}
	}
}
