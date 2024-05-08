package ch_05;

class Shape1 {
	private String name;
	public void rotate() {
		System.out.println("도형을 회전합니다.");
	}
	public Shape1(String name) {
		this.name = name;
	}
}

class Rectangle extends Shape1 {
	private int width, height;
	public Rectangle(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	@Override
	public void rotate() {
		super.rotate();
		System.out.println("사각형을 회전합니다.");
	}
}

public class RectTestEx3 {
	public static void main(String [] args) {
		Shape1 sp = new Rectangle("사각형", 10, 20);
		sp.rotate();
	}
}
