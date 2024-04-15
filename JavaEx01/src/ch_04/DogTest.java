package ch_04;

class Dog {
	String breed;
	int age;
	String color;
	
	public void print() {
		System.out.println("종: " + breed + ", 나이: " + age + ", 색: " + color);
	}
	public void barking() {
		System.out.println("멍멍 짖는다.");
	}
	public void eat(String e) {
		System.out.print(e + "를 먹는다.");
	}
	public Dog() {
		breed = "푸들";
		age = 1;
		color = "믹스";
	}
}

public class DogTest {
	public static void main(String[] args) {
		Dog nDog = new Dog();
		Dog yDog = new Dog();
		yDog.breed = "요크샤";
		yDog.age = 2;
		yDog.color = "갈색";
		nDog.print();
		yDog.print();
		System.out.print(yDog.breed + "가 ");
		yDog.eat("개껌");
		System.out.println();
		System.out.print(yDog.breed + "가 ");
		yDog.barking();
	}
}
