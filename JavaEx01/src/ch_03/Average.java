package ch_03;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 평균 구하기 ===");
		System.out.println("평균을 구할 숫자를 입력하고 마지막에 0을 넣어주세요 >> ");
		int cnt = 0, n = 0;
		double sum = 0;
		
		while((n = sc.nextInt()) != 0) {
			sum = sum + n;
			cnt++;
		}
		
		System.out.print("입력한 수의 개수는 " + cnt + "개이며,");
		System.out.println(" 평균값은" + sum / cnt + "입니다.");
		
		sc.close();
	}
}
