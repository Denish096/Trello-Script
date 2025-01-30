package test;

public class prefect_no_till_1000 {
	public static void main(String[] args) {
	
		for (int a=1;a<=1000;a++)
		{
			boolean b=perfectno(a);
		
		if(b==true)
		{
         System.out.println(a);
		}}
	
	}
	public static boolean perfectno(int n) {
	int sum=0;
	for (int i=1;i<=n/2;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
	return sum==n;
	}}


