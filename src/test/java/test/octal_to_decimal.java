package test;

public class octal_to_decimal {
	public static void main(String[] args) {
		int n=140;
		String s=octal(n);
		System.out.println(s);
		
	}

	private static String octal(int n) {
		String s="";
		while(n>0) {
		int f=n%8;
		s=f+s;
		n=n/8;
	}
		
		return s;
		
		
	}

}
