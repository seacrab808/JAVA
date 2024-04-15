package ch_03;

import java.util.Scanner;

public class InputMismatchException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		
		int sum = 0, n = 0;
		
		for(int i = 0; i < 3; i++) {
			System.out.print(i + ">>");
			try {
				n = sc.nextInt();
				sum += n;
			} catch (Exception e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				sc.next();
				i--;
			}
		}
		System.out.println("합은 " + sum);
		
		sc.close();
	}
}
