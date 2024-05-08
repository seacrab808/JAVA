package ch_05;

class Circle{
	private int radius;
	public Circle() {
		radius = 1;
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
}

class NamedCircle extends Circle {
	private String name;
	public NamedCircle() {
		super();
		this.name="pizza";
	}
	public NamedCircle(int radius, String name) {
		super(radius);
		this.name = name;
	}
	public void show() {
		System.out.println(name + ", 반지름 = " + getRadius());
	}
}

public class NamedTest {
	public static void main(String[] args) {
		NamedCircle p = new NamedCircle();
		NamedCircle w = new NamedCircle(5, "Waffle");
		p.show();
		w.show();
	}
}
