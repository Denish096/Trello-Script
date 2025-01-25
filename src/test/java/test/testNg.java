package test;

import org.testng.annotations.Test;

public class testNg {
	@Test
	public void TestCase1() {
		System.out.println("testcase 1 executed");
	}
	@Test(priority = 1)
	public void TestCase2() {
		System.out.println("test case 2 executed");
	}
}
