package ch_05;

class Person2{}
class Student2 extends Person2{}
class Resercher extends Person2{}
class Professor extends Resercher{}

public class InstanceOfEx {
	static void print(Person2 p) {
		if(p instanceof Person2) System.out.print("Person ");
		if(p instanceof Student2) System.out.print("Student ");
		if(p instanceof Resercher) System.out.print("Resercher ");
		if(p instanceof Professor) System.out.print("Professor ");
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("new Student() -> "); print(new Student2());
		System.out.print("new Resercher() -> "); print(new Resercher());
		System.out.print("new Professor() -> "); print(new Professor());
	}
}
