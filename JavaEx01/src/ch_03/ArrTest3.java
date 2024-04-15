package ch_03;

import java.util.Scanner;

public class ArrTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("실수 5개 입력 >> ");
		
		int arr[] = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				if(max > 5) {
					count += 1;
				}
			}
		}
		System.out.println(count + "개");
	}
}
