package test;

public class prime_no_check {
	public static void main(String[] args){ 
		for (int i=1;i<=1000;i++) {
			boolean b=PerfectNo(i);
			if(b==true) {
			System.out.println(i);}
			}
		}
			
		public	static boolean PerfectNo(int n)
			{
			for (int i=2;i<=(n/2);i++)
			if(n%i==0)
			{
				
				return false;
			}
			if(n==1) 
			{
				return false;
			}
			
			return true;
		}
	
	}