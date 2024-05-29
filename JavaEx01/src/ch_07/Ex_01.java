package ch_07;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_01 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 5개를 입력하세요. >>");
		for(int i = 0; i < 5; i++) {
			int input = sc.nextInt();
			a.add(input);
		}
		for(int i = 0; i < a.size(); i++) {
			int integer = a.get(i);
			System.out.print(integer + " ");
		}
		int max = 0;
		for(int i = 0; i < a.size(); i++) {
			if(a.get(max) < a.get(i))
				max = i;
		}
		System.out.println("\n가장 큰 수는 " + a.get(max));
		sc.close();
	}
}
