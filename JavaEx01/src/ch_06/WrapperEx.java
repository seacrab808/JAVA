package ch_06;

public class WrapperEx {
	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A'));
		char c1 = '4', c2 = 'F';
		if((Character.isDigit(c1))) System.out.println(c1 + "는 숫자");
		if((Character.isAlphabetic(c2))) System.out.println(c2 + "는 영문자");
		
		System.out.println((Integer.parseInt("28") + 10));
		System.out.println((Integer.toString(28) + 10));
		Integer i = 28;
		System.out.println(i.doubleValue());
		System.out.println((double)i);
		
		Double d = 3.14;
		System.out.println(d.toString());
		System.out.println(Double.parseDouble("3.14"));
		
	}
}
