package ch_03;

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5개의 정수를 입력하세요 >> ");
		int arr[] = new int[5];
		
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("입력된 수의 합은 " + (int)sum + "입니다.");
		System.out.println("평균은 " + sum / 5 + "입니다.");
		
		sc.close();
	}
}
