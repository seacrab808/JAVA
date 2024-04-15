package ch_03;

import java.util.Scanner;

public class method01 {
	public static void gugu(int n) {
		for(int i = 1; i < 10; i++) {
			System.out.print(n + "*" + i + "=" + n * i + "\t");
		}
		System.out.println();
		// return 값 . 리턴 타입을 void 자리에 넣으면 된다.
	}
	
	public static int Sum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static int Power(int x, int y) {
		int power = 0;
		power = (int)Math.pow(x, y);
		return (int)power;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >> ");
		int dan = sc.nextInt();
		gugu(dan);
		System.out.println( "1~" + dan + "까지 합 = " + Sum(dan));
		
		System.out.print("x, y를 차례로 입력 >> ");
		int x = sc.nextInt(), y = sc.nextInt();
		System.out.print(x+ "의 " + y + "승은 " + Power(x, y));
		
		sc.close();
	}
}
