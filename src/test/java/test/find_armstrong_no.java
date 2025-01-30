package test;

public class find_armstrong_no {
	public static void main(String[] args) {
		int n = 1;
		for (; n <= 1000; n++) {
			int b = isarmstrong(n);
			if (b == n)

			{
				System.out.println(n + "no is armstrong");
			}
		}
	}
public static int isarmstrong(int n) {
		int sum = 0;
		while (n > 0) {
			int d = n % 10;
			sum = sum + d * d * d ;
			n = n / 10;
		}
		return sum;
	}
}
