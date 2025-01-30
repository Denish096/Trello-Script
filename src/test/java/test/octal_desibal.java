package test;

public class octal_desibal {
	public static void main(String[] args) {
		int n=162,sum=0;
		int base=1;
		while(n>0) {
			int d=n%10;
	 sum=sum+(base*d);
				base=base*8;
		n=n/10;
	}
System.out.println(sum);
}}
