package test;



public class fectorial_of_each_digit {
	public static void main(String[] args) {
		
		int n=163021, sum=0, f=0, d=0;
		while(n>0)
		{
			 d=n%10;//1
			 f=fect(d);// 1
			sum=sum+f;//s=0+1=1
     		n=n/10;
		}
		System.out.println(sum);
	}
	
public static int fect(int d) {	
		int  sum=1; 
		while(d>0)
		{
			sum=sum*d;
	
			d--;
		}
		
	//	System.out.println(sum);
		
return sum;
}}
	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	