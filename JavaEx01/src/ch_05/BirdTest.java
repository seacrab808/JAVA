package ch_05;

class Animal {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public Animal(String name) {
		this.name = name;
	}
	public void eat() {
		System.out.println("식사를 해요.");
	}
}

class Bird extends Animal {
	public void fly() {
		System.out.println(getName() + " : 날 수 있어요.");
	}
	public void eat() {
		super.eat();
		System.out.println("곤충을 먹어요.");
	}
	
	public Bird(String name) {
		super(name);
	}
}

public class BirdTest {
	public static void main(String[] args) {
		Bird b = new Bird("짹짹이");
		b.eat();
		b.fly();
	}
}
