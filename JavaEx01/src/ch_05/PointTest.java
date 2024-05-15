package ch_05;

class PointD {
	private int x, y;
	
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
	public String getLocation() {
		return "x:" + x + ", y:" + y;
	}
	
	public PointD(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D extends PointD {
	private int z;
	public void setZ(int z) {
		this.z = z;
	}
	public int getZ() {
		return z;
	}
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public String getLocation() {
		return super.getLocation() + ", z:" + z;
	}
}

public class PointTest {
	public static void main(String[] args) {
		Point3D p3D = new Point3D(10, 20, 30);
		System.out.println(p3D.getLocation());
	}
}
