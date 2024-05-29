package ch_06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수식을 입력해주세요(+)");
		
		String query = sc.nextLine();
		StringTokenizer st = new StringTokenizer(query, "+");
		
		
		int temp = 0;
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken().trim();
			int intToken = Integer.parseInt(token);
			temp += intToken;
		}
		
			System.out.println(temp);
			
			sc.close();
		}
	}