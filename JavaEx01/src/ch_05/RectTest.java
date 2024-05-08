package ch_05;

class Rect {
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
		return width * 2 + height * 2;
	}
	
	public Rect() {
		this.width = 1;
		this.height = 1;
	}
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
}

class Vol extends Rect {
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
	public Vol() {
		super();
		this.depth = 1;
	}
	public Vol(int width, int height, int depth) {
		setWidth(width);
		setHeight(height);
		this.depth = depth;
	}
}

public class RectTest {
	public static void main(String[] args) {
		Rect r = new Rect();
		Vol  v = new Vol(2, 2, 2);
		System.out.println("가로 : " + r.getWidth() + ", 높이 : " + r.getHeight());
		System.out.println("깊이 : " + v.getDepth() + ", 부피 : " + v.volume());
	}
}
