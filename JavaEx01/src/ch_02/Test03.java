package ch_02;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("x의 값을 입력하세요 >>");
		int numX = sc.nextInt();

		System.out.println("x = " + numX + ", y = " + (numX * numX - 3 * numX + 7));

		sc.close();
	}
}
