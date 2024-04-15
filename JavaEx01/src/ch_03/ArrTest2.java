package ch_03;

import java.util.Scanner;

public class ArrTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("실수 7개 입력 >> ");
		
		double arr[] = new double[7];
		double sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.printf("%.1f", sum);
		
		sc.close();
		
	}
}
