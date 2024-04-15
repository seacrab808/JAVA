package ch_02;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("커피를 주문하세요 >> ");
		String menu = sc.next();
		int nums = sc.nextInt();

		switch (menu) {
		case "에스프레소":
			if (nums < 10) {
				System.out.println((int)2000 * nums + "원입니다.");
				break;
			} else {
				System.out.println((int) 2000 * nums - (2000 * nums * 0.05) + "원입니다.");
				break;
			}

		case "아메리카노":
			System.out.println((int) 2500 * nums + "원입니다.");
			break;
		case "카푸치노":
			System.out.println((int) 3000 * nums + "원입니다.");
			break;

		case "카페라떼":
			System.out.println((int) 3500 * nums + "원입니다.");
			break;

		default:
			System.out.println("가게에 없는 메뉴입니다.");
			break;
		}

		sc.close();
	}
}
