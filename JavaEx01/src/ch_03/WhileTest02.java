package ch_03;

import java.util.Scanner;

public class WhileTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int com = (int)(Math.random()*10 + 1);
			System.out.println("컴퓨터가 생각한 수를 맞춰보세요(1~10사이) >> ");
			int num = sc.nextInt();
			if(com == num) {
				System.out.println("정답입니다");
			} else {
				System.out.println("틀렸습니다");
			}
		}
	}
}