package test;

public class maximum_4no {
	public static void main(String[] args) {
		int a = 99, b =96 , c = 32, d = 386;
		if (a > b && a > c && a > d)
		{
			System.out.println(a);
		}
		else if (b>c&&b>d)
		{
			System.out.println(b);
		}
		else if (c>d)
		{
			System.out.println(c);
		}
		else
		{
			System.out.println(d);
		}

	}
}