package kr.brains;

public class CalculatorExample {
	public static void main(String[] args) {
		//기본 생성자(매개변수가없는)를 호출하여 객체를 생성
		// calculator:개체참조변수 ,  new~(class변수)
		Calculator calculator=new Calculator();
		System.out.println(calculator.calc());
		//Gc(Garbage Collection)동작으로 메모리에서 향후 제거
		calculator=new Calculator(23,"*",40);
		System.out.println(calculator.calc());
		
		/*ModCalculator modRef = new ModCalculator(23,"*",40);
		System.out.println(modRef.calc());*/
	}

}
