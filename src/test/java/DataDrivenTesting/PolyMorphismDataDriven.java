package DataDrivenTesting;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

// Read Data From Property file...

public class PolyMorphismDataDriven {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = null;
		FileInputStream	fis = new FileInputStream("./src/test/resources/PolyDataDrivenTesting.propeties");
		Properties obj = new Properties();
		obj.load(fis);
		String Browsername = obj.getProperty("Browsername");
		if(Browsername.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if (Browsername.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.get(obj.getProperty("url"));
		driver.findElement(By.id("email")).sendKeys(obj.getProperty("username"));
		driver.findElement(By.id("pass")).sendKeys(obj.getProperty("password"));
		driver.findElement(By.name("login")).click();
	}
}
