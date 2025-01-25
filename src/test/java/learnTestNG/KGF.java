package learnTestNG;

import org.testng.annotations.Test;

public class KGF {
	@Test(priority = 2 )
	public void garuda() {
		System.out.println("Garuda Controlled the KGF");
	}
	@Test(priority = 4 )
	public void adheera() {
		System.out.println("Adheera Controlled the KGF");
	}
	@Test(priority = 3, invocationCount = 7)
	public void rocky() {
		System.out.println("Rocky Controlled the KGF");
	}
	@Test(priority = 7 )
	public void rameekasen() {
		System.out.println("Garuda Controlled the KGF");
	}
	@Test(priority = 6 )
	public void rajendradesai() {
		System.out.println("Rajendradesai Controlled the KGF");
	}
	@Test(priority = 5 )
	public void mumbaishetty() {
		System.out.println("Mumbaishetty Controlled the KGF");
	}
	@Test(priority = 1)
	public void suryavardhan() {
		System.out.println("Suryavardhan Controlled the KGF");
	}
	@Test(enabled = false)
	public void vaanaran() {
		System.out.println("Vaanarann Controlled the KGF");
	}
}
