package ch_03;

import java.util.Scanner;

public class ArrayNew {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		System.out.println("정수 5개를 입력하세요. >> ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
		
		sc.close();
	}
}
