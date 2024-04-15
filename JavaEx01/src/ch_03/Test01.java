package ch_03;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 한 문자를 입력하세요 >> ");
		String s = sc.next();
		char c = s.charAt(0);
		System.out.println((int)c);
		
		int cnt = 0;
		
		for(int i = 1; i <= 5; i++) {			
			for(int j = 97; j <= (int)c; j++) {
				System.out.print((char)(j + cnt));
				
			}
			c--;
			cnt++;
			System.out.println();
		}
	}
}
