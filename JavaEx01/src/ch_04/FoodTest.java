package ch_04;

import java.util.Scanner;

class Food {
	private String name;
	private int kcal;
	
	public int cal(int cnt) {
		return this.kcal * cnt;
	}
	
	public Food() {
		name = "김치";
		kcal = 10;
	}

	public Food(String name, int kcal) {
		this.name = name;
		this.kcal = kcal;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	public String getName() {
		return name;
	}
	public int getKcal() {
		return kcal;
	}
}

public class FoodTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Food arr[] = new Food[2];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("음식정보 입력(이름, 칼로리)>> ");
			arr[i] = new Food(sc.next(), sc.nextInt());
		}
		
		System.out.println("=음식 정보 목록=");
		System.out.println("음식명 : " + arr[0].getName() + ", 칼로리 : " + arr[0].getKcal() + "kcal");
		System.out.println("음식명 : " + arr[1].getName() + ", 칼로리 : " + arr[1].getKcal() + "kcal");
		
		System.out.print("음식명>> ");
		String fName = sc.next();
		System.out.print("주문개수>> ");
		int cnt = sc.nextInt();
		
		int fKcal = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(fName.equals(arr[i].getName())) {
				fKcal = arr[i].cal(cnt);
				System.out.println(fKcal);
			}
			break;
		}
		
		System.out.println("총 칼로리 = " + fKcal + "kcal");
		
		
		sc.close();
	}
}
