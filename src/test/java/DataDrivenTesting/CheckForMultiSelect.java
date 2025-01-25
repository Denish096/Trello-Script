package DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckForMultiSelect {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("\"C:\\Users\\denis\\Desktop\\MultiselectDropDown.html\"");
		WebElement dropdown = driver.findElement(By.id("cars"));
		Select dropdownSelect = new Select(dropdown);
		System.out.println(dropdownSelect.isMultiple());
		if(dropdownSelect.isMultiple())
			System.out.println("boolean : dropdown is Multiselect");
		else if(dropdownSelect.isMultiple())
			System.out.println("boolean : dropdown is Singleselect");
	}

}
