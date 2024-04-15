package ch_04;

class Bolier {
	int temp;
	public Bolier(int t) {
		temp = t;
	}
	public Bolier () {
		temp = 0;
	}
	public int tempUp() {
		return ++temp;
	}
	public int tempDown() {
		return --temp;
	}
	public int tempUpDown(int t) {
		temp  += t;
		return temp;
	}
}

public class BolierTest {
	public static void main(String[] args) {
		Bolier t1 = new Bolier();
		Bolier t2 = new Bolier(10);
		
		System.out.println("T1의 현재 온도 = " + t1.temp + "도");
		System.out.println("T1의 현재 온도 = " + t1.tempUp() + "도");
		System.out.println("T2의 현재 온도 = " + t2.temp + "도");
		System.out.println("T2의 현재 온도 = " + t2.tempUpDown(t2.temp) + "도");
		
		
	}
}
