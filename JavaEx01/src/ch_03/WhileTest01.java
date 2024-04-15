package ch_03;

import java.util.Scanner;

public class WhileTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("* 메뉴 *");
		System.out.println("1. 아메리카노 2000");
		System.out.println("2. 라떼 2500");
		System.out.println("3. 기타 3000");
		System.out.println("[주문 종료 0 입력]");
		System.out.println("==============");

		int sum = 0;
		
		while(true) {
			System.out.println("메뉴 입력 >> ");
			int n = sc.nextInt();
			if(n == 0) break;
			
			switch(n) {
			case 1:
				sum += 2000; break;
			case 2: 
				sum += 2500; break;
			case 3: 
				sum += 3000; break;
			default:
				System.out.println("없는 메뉴입니다.");
			}
			
		}
			
		System.out.println("==============");
		System.out.println("주문 종료...");

		System.out.println("주문 금액 = " + sum + "입니다.");
		System.out.println("==============");
		
	}
}
