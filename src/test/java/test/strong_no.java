package test;

public class strong_no {
	public static void main(String[] args) {
	for(int n=1;n<=1000;n++) {
	boolean f=strong(n);
		if(f==true) 
		{
			System.out.println(n+"given no is strong");
		}
//		else
//		{
//			System.out.println("given no is not strong");
//		}
		}}
		public static boolean strong(int n)
		{
		int  sum=0, f, d, z=n;
		while(n>0)
		{
			 d=n%10;
			 f=fect(d);
			sum=sum+f;
     		n=n/10;
		}
		if(sum==z)
		{
			return true;
		}else
		{
			return false;
		}}
	public static int fect(int n) {
		int sum = 1;
		while (n > 0) {
			sum = sum * n;
			n--;
		}
		return sum;
	}}