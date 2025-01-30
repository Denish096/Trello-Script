package test;

public class method_date_valid_invalid {
	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println("check date is valid or invalid");
		boolean f = enterdate(29, 2, 2023);
		// System.out.println(f);

		if (f == true) {
			System.out.println("Date is valid");
		} else {
			System.out.println("Date is invalid");
		}
	}

	public static boolean enterdate(int d, int m, int y) {
		if (d < 1 || d > 31 || m < 1 || m > 12 || y < 1) {
			return false;
		} else if ((m == 4 || m == 6 || m == 9 || m == 11) && d > 30) {
			return false;
		} else if ((y % 400 == 0 || y % 4 == 0 && y % 100 != 0) && m == 2 == d > 29) {
			return false;
		} else if (!(y % 400 == 0 || y % 4 == 0 && y % 100 != 0) && m == 2 == d > 28) {
			return false;
		} else {
			return true;
		}
	}
}
