package chap1;
import java.util.Scanner;
public class ch05 {

	public static void main(String[] args) {
		boolean run=true;
		int studentNum=0;
		int[]scores=null;
		Scanner scanner=new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------");
			System.out.println("1.학생수:2.점수입력:3.점수리스트:4.분석:5.종료");
			System.out.println("-------------------");
	        System.out.println("선택>");
	        
	        int selectNo=Integer.parseInt(scanner.nextLine());
	        
	        if(selectNo==1) {
	        	System.out.print("학생수입력:");
	        	studentNum=Integer.parseInt(scanner.nextLine());
	        	scores=new int[studentNum];
	        }else if(selectNo==2) {
	        	for(int i=0; i<scores.length;i++) {
	        		System.out.print("scores["+ i +"]>");
	        		scores[i]=Integer.parseInt(scanner.nextLine());
	        	}
	        }else if(selectNo==3) {
	        	for(int i=0;i<scores.length;i++) {
	        		System.out.print("scores[" + i +"]:" + scores[i]);
	        
	        	}
	        }else if(selectNo==4) {
	        	int max=0;
	        	int sum=0;
	        	double avg=0;
	        	for(int i=0;i<scores.length;i++) {
	        		max=(max<scores[i])?scores[i]:max;
	        		sum+=scores[i];
	        	}
	        	avg=(double)sum/studentNum;
	        	System.out.println("최고점수:"+max);
	        	System.out.println("평균점수:"+avg);
	        }else if(selectNo==5) {
	        	run=false;	        	
	        }		       
		}
		System.out.println("프로그램종료");
	}
}
/*for(int i=0;i<array.length;i++) {
newarray[i]=array[i];
}
for(int i=0;i<newarray.length;i++) {
System.out.print(newarray[i]+",");*/
/*	int[]array={1,2,3};
int[]newarray=new int[5];

System.arraycopy(array, 0, newarray, 0, array.length);

for(int i=0; i<newarray.length;i++) {
System.out.print(newarray[i]+",");*/
/*		int[] scores= {95,71,84,93,87};

int sum=0;
for(int score:scores) {
	sum=sum+score;
}
System.out.println("점수총합:"+sum);

int avg=(int)sum/scores.length;
System.out.println("점수평균:"+avg);*/
/*int max=0;
int[]array= {1,5,3,8,2};

for(int i=0;i<array.length;i++) {
	if(max<array[i]) {
		max=array[i];
	}
	}
System.out.println("max:"+max);*/
/*
int[][]array= {{95,86},{83,92,96},{78,83,93,87,88}};

int sum=0;
double avg=0.0;

int count=0;
for(int i=0; i<array.length;i++) {
	for(int j=0;j<array[i].length;j++) {
		sum+=array[i][j];
		count++; //array배열에 선언된 데이터 갯수
	}
}
	avg=(double)sum/count;
	System.out.println("데이터수 :"+count);
	System.out.println("총합:"+sum);
	System.out.println("평균"+avg);
*/