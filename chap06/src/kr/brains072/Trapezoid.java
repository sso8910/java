package kr.brains072;

public class Trapezoid extends Polygon {
	private int upper; //윗변
	
	public Trapezoid(int height, int width, int upper) {
		super(height,width); //수퍼클래스의 생성자 호출,width : 아랫변
		//super 얘를 생성해서
		setName("Trapezoid");
		this.upper = upper;
	}
	
	public int getUpper() {
		return upper;
	}
	//생성하고 얘를 호출해줘야됨
	public int evaluate() {//메소드선언부 : 사용법 또는 활용법
		int area=(getWidth()+getUpper())*getHeight()/2;
		return 0;
	}
}
