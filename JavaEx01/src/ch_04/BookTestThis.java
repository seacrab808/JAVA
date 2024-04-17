package ch_04;

class BookThis {
	private String title, author;
	public void show() {
		System.out.println(title + " : " + author);
	}
	
	public BookThis() {
		title = "미제";
		author = "작자미상"; // 기본 생성자
	}
	
	public BookThis(String title) {
		this.title = title;
		author = "작자미상";
	}
	
	public BookThis(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
}

public class BookTestThis {
	public static void main(String[] args) {
		BookThis b1 = new BookThis("어린왕자", "생택쥐페리"); b1.show();
		BookThis b2 = new BookThis("춘향전"); b2.show();
		BookThis b3 = new BookThis(); b3.show();
	}
}
