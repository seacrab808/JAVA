package ch_03;

import java.util.Scanner;

public class ArrTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 5개 입력 >> ");
		
		int arr[] = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("=배열의 원소 출력=");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번쨰 원소 : " + arr[i]);
		}
		
		System.out.println("컴퓨터공학 소유나");
		
		sc.close();
	}
}
