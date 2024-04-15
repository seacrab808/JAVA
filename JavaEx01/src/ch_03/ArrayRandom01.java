package ch_03;

import java.util.Scanner;

public class ArrayRandom01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 개수 입력 >> ");
		int col = sc.nextInt();
		
		System.out.print("열의 개수 입력 >> ");
		int row = sc.nextInt();
		
		System.out.println();
		
		int randomArray[][];
		randomArray = new int[col][row];
		
		for(int i = 0; i < randomArray.length; i++)
			for(int j = 0; j < randomArray[0].length; j++) {
				randomArray[i][j] = (int)(Math.random() * 10);
			}
				
		System.out.print("no\t|");
		for(int j = 0; j < randomArray[0].length; j++) {
			System.out.print(j + "\t");
		}
		System.out.println("|행합");
		
		for(int j = 0; j < randomArray[0].length + 2; j++) {
			System.out.print("--------");
		}
		System.out.println();
		
		
		int colSum = 0,  sum = 0;
		for(int i = 0; i < randomArray.length; i++) {
			System.out.print(i + "\t|");
			for(int j = 0; j < randomArray[0].length; j++) {
				System.out.print(randomArray[i][j] + "\t");
				colSum += randomArray[i][j];
			}
			System.out.print("|" + colSum);
			System.out.println();
			sum += colSum;
		}
		
		System.out.println();
		System.out.println("전체 합: " + sum);
			
		sc.close();
	}
}
