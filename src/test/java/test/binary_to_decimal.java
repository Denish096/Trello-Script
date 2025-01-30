package test;

public class binary_to_decimal {
	public static void main(String[] args) {
		int n=1011010;
		int f=binarytodecimal(n);
		System.out.println(f);
	}

	private static int binarytodecimal(int n) {
		int sum=0,base=1;
		while(n>0) {
			int d=n%10;
			sum=sum+(d*base);
			base=base*2;
			n=n/10;
		}
		return sum;
	}

}
