package kr.brains072;

public class Rectangle extends Polygon {
	public Rectangle(int height, int width) {
		//컴파일러가 묵시적으로 super 클래스의 해당 생성자를 호출
		//super(height,width);
		setName("Rectangle");	
	}
	public int evaluate() {
		return(getHeight()*getWidth());
	}
}
