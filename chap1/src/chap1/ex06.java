package chap1;
import java.util.Scanner;
public class ex06 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("[필수정보입력]");
		
		System.out.print("이름:");
		String name=scanner.nextLine();
		
		System.out.print("주민번호 앞6자리:");
		String id_head=scanner.nextLine();
		
		System.out.print("전화번호:");
		String phone=scanner.nextLine();
		/*String rnum = rnum.substring(0,6);*/
		System.out.println();
		System.out.println("[입력한내용]");
		System.out.println(name);
		System.out.println(id_head);
		System.out.println(phone);
		
		System.out.println();
		System.out.printf("%1$s,%2$s,%3$s",name,id_head,phone);
		/*System.out.printf("%1$s,%-6s\n,","2-1주민번호앞6자리:",id_head);*/
	}

}
