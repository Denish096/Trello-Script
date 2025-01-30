package test;

public class true_if_two_digit {
	public static void main(String[] args) {
		int a = 111;
		boolean Two_digit = a / 100 == 0 && a / 10 != 0;
		boolean Three_digit = a / 1000 == 0 && a / 100 != 0;
		boolean Four_digit = a / 10000 == 0 && a / 1000 != 0;

		System.out.println(Two_digit);
		System.out.println(Three_digit);
		System.out.println(Four_digit);
	}
}
