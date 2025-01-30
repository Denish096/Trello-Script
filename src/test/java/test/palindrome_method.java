package test;

public class palindrome_method {
	public static void main(String[] args) {
		for (int n = 100; n <= 1000; n++) {
			int rev = palindrome(n);
			if (rev == n) {
				System.out.println(n);
			}
		}
	}
	private static int palindrome(int n) {
		int sum = 0;
		while (n != 0) {
			int d = n % 10;
			sum = sum * 10 + d;
			n = n / 10;
		}
		return sum;
	}
}
