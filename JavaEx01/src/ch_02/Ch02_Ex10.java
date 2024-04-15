package ch_02;

import java.util.Scanner;

public class Ch02_Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >> ");
		int i = sc.nextInt();

		switch (i) {
		case 1:
			System.out.println("!"); break;
		case 2:
			System.out.println("@"); break;
		case 3:
			System.out.println("#"); break;
		default:
			System.out.println("*"); break;		
			}
		
		sc.close();
	}
}
