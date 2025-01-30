package test;

public class decimal_to_octal {
	public static void main(String[] args) {
		int n=123;
		String s=decimaltooctal(n);
		System.out.println(s);
	}

	private static String decimaltooctal(int n) {
		String s="";
		while(n>0)
		{
			int f=n%8;
			if(f<10) {
				s=f+s; }
			else 
			{
				s=(char)(55+f)+s;
			}
			n=n/8;
			}
		
		return s;
	}

}
