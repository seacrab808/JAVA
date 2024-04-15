package ch_03;

import java.util.Scanner;

public class ModayException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String week[] ={"일", "월", "화", "수", "목", "금", "토"};
		
		String answer = "";
		int userNum = 0;
			while(userNum > -1) {
				try {
				System.out.print("정수를 입력하세요 >> ");
				int num = sc.nextInt();
				userNum = num;
				
				if(num == -1) {
					break;
				} else {
					int divNum;
					
					divNum = (num) % 7;
					answer = week[divNum];
					System.out.println(answer);	
				}
				}catch(Exception e) {
				System.out.println("경고 ! 수를 입력하지 않았습니다.");
				sc.next();
			}
		}
			System.out.println("프로그램을 종료합니다!");
			sc.close();
	}
}
