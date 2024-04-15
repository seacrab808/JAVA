package ch_02;

import java.util.Scanner;
// 소유나
public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("커피를 주문하세요 >> ");
		String menu = sc.next();
		int nums = sc.nextInt();

		if (menu.equals("에스프레소")) {
			System.out.println((int) 2000 * nums + "원입니다.");
		} else if (menu.equals("아메리카노")) {
			System.out.println((int) 2500 * nums + "원입니다.");
		} else if (menu.equals("카푸치노")) {
			System.out.println((int) 3000 * nums + "원입니다.");
		} else if (menu.equals("카페라뗴")) {
			System.out.println((int) 3500 * nums + "원입니다.");
		} else {
			System.out.println("가게에 없는 메뉴입니다.");
		}

		switch (menu) {
		case "에스프레소":
			System.out.println((int) 2000 * nums + "원입니다.");
			break;

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
