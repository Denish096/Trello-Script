package test;

public class armstrong_method {
	public static void main(String[] args) {
		for (int n = 1; n <= 1000; n++) {
			int c = count(n);
			int b = isarmstrong(n, c);
			if (b == n)
			{
				System.out.println(n + " is armstrong");
			}
		}
	}
	public static int isarmstrong(int n, int c) {
		int esum = 0;
		int t = c;
		while (n > 0) {
			int d = n % 10;
			int sum = 1;
			while (c > 0) {
				sum = sum * d;
				c--;
			}
			c = t;
			esum = esum + sum;
			n = n / 10;
		}
		return esum;
	}
	public static int count(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;
		}
		return count;
	}
}