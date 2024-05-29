package ch_06;

import java.util.Scanner;

public class Ch06ExBonus2_Modify {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s = scanner.nextLine();
			StringBuffer sb = new StringBuffer(s);
			if("exit".equals(s)) {
				System.out.println("종료합니다...");
				break;
			}
			int index = (int) (Math.random() * s.length());
			while(true) {
				int i = (int) (Math.random() * 26);
				char c = (char) ('a' + i);
				if(!"exit".equals(s)) {
					sb.replace(index, index + 1, c+"");
					break;
				}
			}
			System.out.println(sb);
		}
		scanner.close();
	}
}
