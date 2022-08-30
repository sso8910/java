package kr.brains072;

import java.util.ArrayList;

public class PolygonExample {
	//매개변수에 배열을 사용하면 매개변수 개수를 가변적으로 사용가능
	
	public static void main(String[]area) {
		//Polygon 형의 poly라는 참조변수를 사용
		//Triangle,Square,Trapeziod..상속받음, 공통적인 특징을 가짐
		
		ArrayList<Polygon> arrPoly=new ArrayList<>();
		
		
		Polygon poly = new Triangle(50,80);
		System.out.println("넓이는 :"+poly.evaluate());
		arrPoly.add(poly);
		
		//Triangle triangle=new Triangle(50,80);
		//System.out.println("넓이는 : "+triangle.evaluate());
		
		poly=new Square(80);
		System.out.println("넓이는 :"+poly.evaluate());
		//Square square=new Square(80);
		//System.out.println("넓이는 : "+ square.evaluate());
		arrPoly.add(poly);
		
		poly=new Trapezoid(50,80,60);
		arrPoly.add(poly);
		//System.out.println("넓이는 :"+poly.evaluate());
		//Trapezoid trapezoid=new Trapezoid(50,80,60);
		//System.out.println("넓이는 : "+trapezoid.evaluate());
		for(Polygon p: arrPoly) {
			whoIs(p); //매개변수의 유형에 따라 다른게 동장:(매개변수)다형성
		}
		String sRef="Hello";
		Integer iRef=Integer.valueOf(100); //Wrapper Class
		Integer iRef2=30;// autoboxing
		
		iRef = iRef2;
		Object o= (Object) iRef;
		if(o instanceof String) {//어떤클래스에서 왔니?
		sRef=(String)o;
		sRef.substring(3);
		}
	}
		public static void whoIs(Polygon p) {
	//	for(Polygon p : arrPoly) {
			if(p instanceof Triangle)
				System.out.println("넓이는 :"+p.evaluate());
			//System.out.println(p.getName()+);
			//System.out.println("삼각형의 넓이는 :"+p.evaluate());
			else if(p instanceof Square)
				System.out.println("정사가격형의 넓이는 :"+p.evaluate());
			else if(p instanceof Rectangle)
				System.out.println("사각형의 넓이는 :"+p.evaluate());
			else if(p instanceof Trapezoid)
				System.out.println("사다리꼴의 넓이는 :"+p.evaluate());
			else
				;
		}
}