package test;

public class arithmatic_oprators {
	public static void main(String[] args) {
		int a = 6; 
		int b = a++ % ++a / --a;
		int c = ++a / b ++ % ++b;
		int d = c++ + --a - --b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}

