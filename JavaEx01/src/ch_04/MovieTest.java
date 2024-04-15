package ch_04;

class Movie {
	String title;
	double score;
	int year;
	public void print() {
		System.out.println("제목: " + title + ", 평점: " + score + ", 발표 연도: " + year);;
	}
	public Movie() {
		title = "파묘";
		score = 5.0;
		year = 2023;
	}
	
	public Movie(String t, double s, int y) {
		title = t;
		score = s;
		year = y;
	}
}

public class MovieTest {
	public static void main(String[] args) {
		Movie AMovie = new Movie("알라딘", 4.5, 2019);
		Movie GMovie = new Movie("공조2", 4.3, 2023);
		AMovie.print();
		GMovie.print();
	}
}
