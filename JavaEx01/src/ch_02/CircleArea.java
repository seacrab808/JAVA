package ch_02;

public class CircleArea {
	public static void main(String[] args) {
		final double PI = 3.14;
		double radius = 10.2;
		double circleArea = radius*radius*PI;
		
		// 원의 면적을 화면에 출력한다
		System.out.print("반지름 " + radius + ", ");
		System.out.println("원의 면적 = " + circleArea);
	}
}
