package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class trellotest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://trello.com/login?returnUrl=%2Fpower-ups%2F5d9c90aa18965066fcd44730%2Freports-by-blue-cat");
		driver.findElement(By.id("user")).sendKeys("denish.6345@gmail.com");
	}
	

}
