package DataDrivenTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IdentifyAlldropdowninoneshot {
	public static void main(String[] args) {
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		// identify all elements in one shot
		List<WebElement> Dropdowns = driver.findElements(By.tagName("select"));
		for (WebElement singleDropdown : Dropdowns) {
			// to check whether its visible or not
			if(singleDropdown.isDisplayed()) {
				System.out.println("Dropdown is displyed " + singleDropdown.getAttribute("title"));
				// to fetch the options of a drop down
				Select isSingleselect = new Select(singleDropdown);
				// to check whether its single select or multiple select
				if(isSingleselect.isMultiple()) {
					System.out.println("isMultiselect "); }
				else {
					System.out.println("isSingleselect ");
				}}
			else {
				System.out.println("Dropdown is not displayed " + singleDropdown.getAttribute("title") );
			}
		}
	}
}
