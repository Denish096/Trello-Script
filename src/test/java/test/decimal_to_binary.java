package test;

public class decimal_to_binary {
	public static void main(String[] args) {
		int n=44;
		String f=decimaltobinary(n);
		System.out.println(f);
		
	}

	private static String decimaltobinary(int n) {
		String s="";
		while(n>0) {
			int d=n%2;
			s=d+s;
			n=n/2;
		}
		
		
		return s;
	}

}
