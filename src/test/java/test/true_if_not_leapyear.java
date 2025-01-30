package test;

public class true_if_not_leapyear {
	public static void main(String[] args) {
		int y = 2000;// w.a.p print true if a year is a not a leap year
		boolean leap_year = (y % 400 == 0 || y % 4 == 0 && y % 100 != 0);
		System.out.println(leap_year);
	}
}
