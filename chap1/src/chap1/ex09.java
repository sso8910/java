package chap1;
import java.util.Scanner;
public class ex09 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("첫번째 수:");
		double num1=Double.parseDouble(scanner.nextLine());
		System.out.print("두번째 수:");
		double num2=Double.parseDouble(scanner.nextLine());
		if ((num2==0)||(num2==0.1)){
			System.out.println("결과:무한대");
		}
		else {
			System.out.println("결과:"+num1/num2);
			}
		}
	}