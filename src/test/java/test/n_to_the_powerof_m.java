package test;

public class n_to_the_powerof_m {
	public static void main(String[] args) {
		System.out.println (power(10,-3));
	}
public static double power(int a, int b)
{
		double sum=1;boolean z=true;
		if(b<0)
			{b=-b;z=false;}
		while (b != 0){ 
			sum = sum * a;
			b--;}
		if (z==false){
			return 1/sum;
		}else{
		return sum;}
	}
}
