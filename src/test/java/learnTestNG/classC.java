package learnTestNG;

import org.testng.annotations.Test;

public class classC extends PreAndPostCondition {
	@Test(groups = "system")
	public void testK () {
		System.out.println("test k");
	}
	@Test(groups = {"functional","integration"})
	public void testL () {
		System.out.println("test L");
	}
	@Test(groups = "integration")
	public void testM () {
		System.out.println("test M");
}
}
