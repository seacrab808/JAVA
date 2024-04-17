package ch_04;

import java.util.Scanner;

class MyPhone {
	private int year, vol;

	public void show() {
		System.out.println("출시년도 " + year + "년 볼륨 " + vol);
	}

	public MyPhone() {
		this.year = 2020;
		this.vol = 10;
	}

	public MyPhone(int year, int vol) {
		this.year = year;
		this.vol = vol;
	}

	public int volUp() {
		return vol += 10;
	}

	public int volDown() {
		return vol -= 10;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public int getVol() {
		return vol;
	}
}

public class MyPhoneTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		MyPhone arr[] = new MyPhone[2];

		for(int i = 0; i < arr.length; i ++) {
			System.out.print("폰정보 입력(출시년도, 볼륨)>> ");
			arr[i] = new MyPhone(sc.nextInt(), sc.nextInt());
			
		}

		System.out.println("=폰 정보 목록=");
		arr[0].show();
		arr[1].show();


		sc.close();
	}
}
