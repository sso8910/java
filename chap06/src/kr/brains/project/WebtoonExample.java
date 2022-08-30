package kr.brains.project;

import java.util.ArrayList;

public class WebtoonExample {
	public static ArrayList<Book> albook=new ArrayList<>();
	public static void main(String[] args) {
		//등록
		Book w1=new Webtoon("i-1234", "나 혼자 레벨업", "판타지","추공");
		Book w2=new Webtoon("i-1235", "미생2", "드라마","윤태호");
		Book w3=new Webtoon("i-1236", "기생수", "스릴러","몰라");
		
		albook.add(w1);
		albook.add(w2);
		albook.add(w3);
		albook.add(new Webtoon("i-1237","장풍전","코믹","신영우"));
		
		//출력
		for(Book b:albook)
			System.out.println(b.toString());
		
	}

}
