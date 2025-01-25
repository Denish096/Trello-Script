package learnTestNG;

import org.testng.annotations.Test;

public class dependsOnGroups {
	@Test(groups = "functional")
	public void testCase1() {
		System.out.println("testCase1");
	}
	@Test(groups = "functional")
	public void testcase2() {
		int a[]= {1,2,3};
		System.out.println(a[3]);
		System.out.println("testcase2");
	}
	@Test(groups = "integration", dependsOnGroups = "functional")
	public void testcase3() {
		System.out.println("testcase3");
	}
}
