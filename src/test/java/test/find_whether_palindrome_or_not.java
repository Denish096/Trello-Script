package test;

public class find_whether_palindrome_or_not {
	public static void main(String[] args) {
		int d = 9119;
		int rev = palindrome(d);
		if (rev == d) {
			System.out.println(d+"no is palindrome");
		}
		else
		{
			System.out.println(d+"no is not palindrome");
		}
	}

	private static int palindrome(int d) {
		int sum = 0;
		while (d != 0) {
			int n = d % 10;
			sum = sum * 10 + n;
			d = d / 10;
		}
		return sum;
	}
}
