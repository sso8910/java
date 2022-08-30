package kr.brains072;

public class Triangle extends Polygon {
	//생성자 : 객체 초기화를 담당,
	//sub 클래스로부터 객체를 생성할 때,
	//super 클래스의 객체(필드,메소드)도 준비되어야 함
	public Triangle(int height, int width) {
		super(height, width);
		setName("Triangle");
		
	}	
	public int evaluate() {
		int area = getHeight()*getWidth()/2;
		//super.area=super.with*super.height/2;
		//return super.area;
		return area;
	}

}
