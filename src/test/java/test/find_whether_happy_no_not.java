package test;

public class find_whether_happy_no_not {
	public static void main(String[] args) {
		int n = 1;
		for (; n < 100; n++) {
			boolean b = ishappy(n);

			if (b == true) {
				System.out.println(n + " " + "no is happy");
			}
		}
	}

	private static boolean ishappy(int d) {
		while (d > 9) {
			d = squaredigit(d);
		}

		return d == 1 || d == 7;
	}

	private static int squaredigit(int n) {
		int sum = 0;
		while (n > 0) {
			int d = n % 8;
			sum = sum + d * d;// 3
			
			n = n / 8;
		}
		return sum;
	}
}
