package ch_04;

import java.util.Scanner;

class Staff {
	private int no;
	private String name;

	public Staff() {
		this.no = 20244231;
		this.name = "소유나";
	}

	public Staff(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public void show() {
		System.out.println(this.no + "\t" + name);
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}
}

public class StaffTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Staff arr[] = new Staff[2];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("사원정보 입력(사번, 이름)>>");
			arr[i] = new Staff(sc.nextInt(), sc.next());
		}

		System.out.println("=사원목록=");
		System.out.println("사번\t이름");
		arr[0].show();
		arr[1].show();

		sc.close();
	}
}
