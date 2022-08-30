package kr.brains.project;

import java.time.LocalDateTime;
import java.util.Objects;

//웹툰 등록 및 조회
//웹툰은 Book 종류이다
//웹툰의 주요 속성(필드)는 무엇인가? 제목 장르 저자 판매부수 조회수 판매량
public class Webtoon implements Book{
	private String isbn; //유일한 식별자
	private String title;
	private String genre;
	private String author;
	private LocalDateTime date;
	private int count;
	
	public Webtoon() { }
	public Webtoon(String isbn,String title, String genre, String author) {
		this.isbn=isbn;
		this.title=title;
		this.genre=genre;
		this.author=author;
		this.date=LocalDateTime.now(); //등록일자 or 출판일자
		//this.date=date; 출판일자
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		//기본형:패키지.클래스명@Hexa해쉬코드
		return "Webtoon [title=" + title + ", genre=" + genre + ", author=" + author + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, date, genre, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)  //참조하는 객체가 같으면 true
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Webtoon other = (Webtoon) obj;
		return Objects.equals(author, other.author) && Objects.equals(date, other.date)
				&& Objects.equals(genre, other.genre) && Objects.equals(title, other.title);
		//return Objects.equals(isbn, other.isbn);식별자 있으면 이렇게만 쓰면됨
	}

	
	
}
