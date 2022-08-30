package kr.brains063;

public class Car {
	//1개의 정적필드,1개의 인스턴스 멤버 필드, 4개의 인스턴스 메소드
	//public static final : 상수 변수 정의(전체 대문자로 작성)
	public static final String MODEL="가스차";
	private int gas;
	
	//Setter/Getter Method;
	 void setGas(String gas) { // 가스를 주입한 결과
		
		String digit = gas.substring(0, gas.length()-1);
		int igas=Integer.parseInt(digit);
		//parseInt() : 숫자 문자열을 숫자로 파싱(변환)해주는 메소드
			if(igas>60) {
			System.out.println((igas-60)+"양 초과,60L만 주입함.");
			igas=60;
		}
			this.gas=igas;
	}
	int getGas() {
		return gas;
	}
	
	boolean isLeftGas() {
		boolean isLeft=true;
		if(gas==0) {
			System.out.print("gas가 없습니다\n");
			isLeft=false;
		}
		else 
			;//System.out.print("gas가 있습니다\n");
		return isLeft;
	}
	void run() {
		//while(true)
		while(isLeftGas()) {
			if(gas>0) {
				System.out.println("달립니다.gas잔량("+gas+")");
				gas -=1;
			}
			else {
				System.out.println("멈춥니다.gas잔량("+gas+")");
				//break;
			}
		}
	}
}