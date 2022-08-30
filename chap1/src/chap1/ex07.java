package chap1;

public class ex07 {

	public static void main(String[] args) {
		int x=10;
		int y=10;
		int z;
		
		x++;
		System.out.println(x);
		++x;
		System.out.println(x);
		y--;
		System.out.println(y);
		--y;
		System.out.println(y);
		z=x++;
		System.out.println(z);
		System.out.println(x);
		z=++x;
		System.out.println(z);
		System.out.println(x);
		z=++x + y++;
		System.out.println(z);
		System.out.println(x);	
		System.out.println(y);			

	}

}
