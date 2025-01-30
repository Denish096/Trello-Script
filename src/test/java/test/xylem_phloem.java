package test;

public class xylem_phloem {
	public static void main(String[] args) {
		int n=1010;
		boolean b=xylem( n);
		
if(b==true)	
{
	System.out.println(n+"no is xyleum");
}
else
{
	System.out.println(n+"no is phelum");
}
				
	}
	private static boolean xylem(int n) {
		int esum=0,msum=0;
		esum=n%10;
		n=n/10;
		
		while(n>9) 
		{
			int d=n%10;
			msum=msum+d;
			n=n/10;
		}
		
		esum=esum+n;
		return esum==msum;
		
	}
}
