package test;

public class test_1 {

	public static void main(String[] args) {
		int a = 6;
		int b = a++ % ++a / --a; // 6%8/7 = 0
		int c = ++a / b++ % ++b;
		int d = c++ + --a - --b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
