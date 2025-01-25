package learnTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PreAndPostCondition {
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("after test");

	}

	@BeforeMethod
	public void testA() {
		System.out.println("testA");

	}

	@AfterMethod
	public void testB() {
		System.out.println("test B");
	}

	@BeforeClass
	public void testc() {
		System.out.println("test C");
	}

	@Test
	public void testCaseA() {
		System.out.println("test Case A");
	}

	@Test
	public void testCaseB() {
		System.out.println("test Case B");
	}

	@AfterClass
	public void haitest() {
		System.out.println("hai test");
	}
}
