package test;

public class logical_oprators {
	public static void main(String[] args) {
		int a = 1;// 2,3
		int b = 7;
		boolean c = a + ++b >=0 || a++ + b++ + ++a <= 100;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
