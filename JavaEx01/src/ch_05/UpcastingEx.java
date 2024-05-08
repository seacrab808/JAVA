package ch_05;

class Person{
	String name;
	String id;
	public Person(String name) {
		this.name = name;
	}
}

class Student extends Person {
	String grade;
	String department;
	public Student(String name) {
		super(name);
	}
}

public class UpcastingEx {
	public static void main(String[] args) {
		Person p = new Student("소유나");
		Student s = (Student)p;
		System.out.println(s.name);
		
		s.grade = "A";
		s.department = "Com";
	}
}
