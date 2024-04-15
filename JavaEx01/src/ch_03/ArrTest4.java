package ch_03;

import java.util.Scanner;

public class ArrTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("5명의 학생 이름 입력 >> ");
		
		String arr[] = new String[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		
		int max = 0;
		int index = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i].length()) {
				max = arr[i].length();
				index = i;
			}
		}
		System.out.println("가장 이름의 길이가 긴 사람은 " + arr[index]+ "입니다.");
	
		
	}
}
