package ch_05;

class Rect1 {
	private int width, height;
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	
	public int area() {
		return width * height;
	}
	
	public int around() {
		return (width + height) * 2;
	}
	
	public Rect1() {
		this.width = 1;
		this.height = 1;
	}
	
	public Rect1(int width, int height) {
		this.width = width;
		this.height = height;
	}
}

class Vol1 extends Rect1 {
	private int depth;
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public int getDepth() {
		return depth;
	}
	public int volume() {
		return getWidth() * getHeight() * depth;
	}
	public int around() {
		return (super.around()) * 2 + depth * 4;
	}
	
	public Vol1() {
		super();
		this.depth = 1;
	}
	public Vol1(int width, int height, int depth) {
		super(width, height);
		this.depth = depth;
	}
}

public class TestRect {
	public static void main(String[] args) {
		Rect1 r = new Rect1();
		Vol1 v = new Vol1(2, 2, 2);
		System.out.println("가로: " + r.getWidth() + ", 높이: " + r.getHeight());
		System.out.println("깊이: " + v.getDepth() + ", 부피: " + v.volume());
		System.out.println("사각형둘레: " + r.around() + ", 직육면체둘레: " + v.around());
	}
}
