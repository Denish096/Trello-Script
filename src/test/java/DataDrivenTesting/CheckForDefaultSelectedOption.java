package DataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckForDefaultSelectedOption {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		WebElement Day = driver.findElement(By.id("day"));
		Select dayselect = new Select(Day);
		String SelectedDayOption = dayselect.getFirstSelectedOption().getText();
		System.out.println("SelectedDayOption ="+ SelectedDayOption);
		WebElement month = driver.findElement(By.id("month"));
		Select monthSelect = new Select(month);
		String Selectedmonthoption = monthSelect.getFirstSelectedOption().getText();
		System.out.println("Selectedmonthoption =" + Selectedmonthoption);
		WebElement year = driver.findElement(By.id("year"));
		Select yearSelect = new Select(year);
		String SelectedYearoption = yearSelect.getFirstSelectedOption().getText();
		System.out.println("SelectedYearoption ="+ SelectedYearoption);
		driver.manage().window().minimize();
		driver.quit();
	}
}
