package ch_03;

import java.util.Scanner;

public class GuguFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요>>");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <=n; i++) {
			sum += i;
			if(i < n)
				System.out.print(i + " + ");
			else
				System.out.print(i + " = ");
		}
		
		System.out.println(sum);
		sc.close();
	}
}
