package chap1;

public class ex10 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print("*");
			}
					System.out.println();
	}
	}
}
/*while(true) {
int dice1=(int)(Math.random()*6+1);
int dice2=(int)(Math.random()*6+1);
System.out.println("("+(dice1) + "," + (dice2)+")");
if((dice1+dice2)==5) {	
	break;
}
}
}
}
*/	

/*for (int x=1;x<=10;x++) {
for (int y=1;y<=10;y++) {
if((4*x+5*y)==60) {
	System.out.println("("+x+","+y+")");
	System.out.println(x+","+y);
}
}
}
*/

/* for(int i=1;i<5;i++) {
for(int j=1;j<=i;j++) {
	System.out.print("*");
	if(j==i) {
		System.out.println();
	}
}
}
*/
/* int sum=0;
int x=0;
for(x=2;x<=20;x+=2) {
sum+=x;
System.out.println("x:"+x);

}*/
/* for(int i=1 ; i<5; i++) {
for(int j=4;j>0;j--) {
if(i<j) {
	System.out.print(" ");
}else {
	System.out.print("*");
}
}
System.out.println();
}*/
