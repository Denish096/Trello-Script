package test;

public class disarium_no {
	public static void main(String[] args) {
		for (int n=1;n<=1000;n++) {
			int c=count(n);
			boolean d=isdesarium(n,c);
if(d==true)
{
	System.out.println(n+"no is desarium");
}
		}}
	private static boolean isdesarium(int n,int c) {
		int sum=0, tempc=c,tempn=n;
		while (n>0)
		{
			int d=n%10;
			int dis=1;
			while (c>0) {
				dis=dis*d;
				c--;
			}
			tempc--;
			sum=sum+dis;
			n=n/10;
			c=tempc;
		}
		return sum==tempn;
	}
	private static int count(int n) {
		int count=0;
		while(n>0) {
		count++;
		n=n/10;
		}
		return count;
	}
}