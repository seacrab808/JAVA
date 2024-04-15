package ch_02;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점 (x, y)의 좌표를 입력하세요 >> ");
		int numX = sc.nextInt();
		int numY = sc.nextInt();
		
		/*
		 * if((numX >= 50 && numX <= 100) && (numY >= 50 && numY <= 100))
		 * System.out.println("점(" + numX + ", " + numY +
		 * ")은 (50, 50)과 (100, 100)의 사각형 내에 있습니다."); else
		 * System.out.println("입력하신 좌표가 사각형 내에 없습니다.");
		 */
		
		boolean sss = ((numX >= 50 && numX <= 100) && (numY >= 50 && numY <= 100));
	
		
		
		String b = sss ? "점(" + numX + ", " + numY + ")은 (50, 50)과 (100, 100)의 사각형 내에 있습니다." : "입력하신 좌표가 사각형 내에 없습니다.";
		System.out.println(b);
		
		sc.close();
		
		
	}
}
