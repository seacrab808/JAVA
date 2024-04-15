package ch_04;

class Student {
	String name;
	int year;
	public void printInfo() {
		System.out.println("이름: " + name + ", 학년: " + year);
	}
	public Student() {
		name = "소유나";
		year = 1; 
	}
	public Student(String name, int year) {
		this.name = name;
		this.year = year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}

public class StudentTest {
	public static void main(String[] args) {
		Student yuna = new Student();
		Student Lee = new Student("이순신", 4);
		yuna.printInfo();
		Lee.printInfo();
	}
}
