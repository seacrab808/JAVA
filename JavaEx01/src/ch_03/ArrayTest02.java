package ch_03;

import java.util.Scanner;

public class ArrayTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 10개를 입력하세요 >>");
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("입력하신 정수 중 3의 배수는 ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 3 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println("입니다");
		sc.close();
	}
}
