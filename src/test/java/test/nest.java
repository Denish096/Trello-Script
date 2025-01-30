package test;

public class nest {
public static void main(String[] args) {
	System.out.println("abc");
	System.out.println("call for fectorial");
	fectorial();
	
}

public static void fectorial()
{
	int a= 1,n=10,z=1;
	for (;a<=n;a++)
	{
		z=z*a;
		
	}
	System.out.println(z);
}
}
