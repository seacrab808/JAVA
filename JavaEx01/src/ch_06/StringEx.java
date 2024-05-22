package ch_06;

public class StringEx {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(", C++, JS");
		System.out.println(a + "의 길이는 " + a.length());
		System.out.println(a.contains("#"));
		a = a + b;
		
		a = a.trim();
		System.out.println(a);
		a = a.replace("C#", "Java");
		System.out.println(a);
		String s[] = a.split(",");
		for(int i = 0; i < s.length; i++) {
			System.out.println("분리된 문자열" + i + ": " + s[i]);
		}
		int i = b.indexOf("J");
		a = b.substring(i);
		System.out.println(a);
		char c = a.charAt(0);
		System.out.println(c);
	}
}
