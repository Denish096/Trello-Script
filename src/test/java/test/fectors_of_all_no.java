package test;

public class fectors_of_all_no {
	public static void main(String[] args) {
		int n=50;
		for (int i = 1; i <= (n / 2); i++)
			if (n % i == 0) {
				System.out.println(i);
			}
}}