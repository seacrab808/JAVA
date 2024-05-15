package ch_05;

interface Shapes1 {
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.println("---다시 그립니다.---");
		draw();
	}
}

class CircleShape implements Shapes1 {
	private int len;
	
	public CircleShape(int len) {
		this.len = len;
	}
	
	public double getArea() {
		return PI * len * len;
	}
	public void draw() {
		System.out.print("반지름 " + len + " ");
	}
}

public class ShapeApp {
	public static void main(String[] args) {
		Shapes1 coin = new CircleShape(10);
		coin.redraw();
		System.out.println("코인의 면적은 " + coin.getArea());
	}
}
