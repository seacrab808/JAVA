package ch_03;

import java.util.Scanner;

public class Exception03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 >> ");
		
		try {
			int num = sc.nextInt();
			if(num % 2 == 0) System.out.println("짝수");
			else System.out.println("홀수");
		} catch(Exception e) {
			System.out.println("! 숫자를 입력하세요");
		} finally {
			sc.close();
		}
	}
}
