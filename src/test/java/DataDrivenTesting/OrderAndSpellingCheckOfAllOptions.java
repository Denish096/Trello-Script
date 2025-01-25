package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrderAndSpellingCheckOfAllOptions {
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		List<String> expectedDayList = new ArrayList<String>();
		List<String> expectedMonthList = new ArrayList<String>();
		List<String> expectedYearList = new ArrayList<String>();
		List<String> actualDayList = new ArrayList<String>();
		List<String> actualMonthList = new ArrayList<String>();
		List<String> actualYearList = new ArrayList<String>();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		List<WebElement> alldropdowns = driver.findElements(By.tagName("select"));
		for (WebElement dropdown : alldropdowns) {
			// pick only visible dropdown
			if (dropdown.isDisplayed()) {
				Select selectdropdown = new Select(dropdown);
				List<WebElement> alloptions = selectdropdown.getOptions();
				for (WebElement option : alloptions) {
					if (dropdown.getAttribute("title").equals("Day")) {
						String DayOption = option.getText();
						actualDayList.add(DayOption);
					} else if (dropdown.getAttribute("title").equals("Month")) {
						String MonthOption = option.getText();
						actualMonthList.add(MonthOption);
					} else if (dropdown.getAttribute("title").equals("Year")) {
						String YearOption = option.getText();
						actualYearList.add(YearOption);
					}
				}
			}
		}
		// System.out.println(actualDayList);
		// System.out.println(actualMonthList);
		// System.out.println(actualYearList);
		Workbook workbook = WorkbookFactory.create(new FileInputStream("./src/test/resources/DataDrivenTesting.xlsx"));
		Sheet sheet = workbook.getSheet("Sheet2");
		int FirstRowIndex = sheet.getFirstRowNum();
		int LastRowIndex = sheet.getLastRowNum();
		for (int i = FirstRowIndex; i <= LastRowIndex; i++) {
			Row ConsideredRow = sheet.getRow(i);
			short FirstCellIndex = ConsideredRow.getFirstCellNum();
			short LastCellCount = ConsideredRow.getLastCellNum();

			for (int j = FirstCellIndex + 1; j < LastCellCount; j++) {
				CellType celltype = ConsideredRow.getCell(j).getCellType();
				if (String.valueOf(celltype).equals("STRING")) {
					String expectedMonth = ConsideredRow.getCell(j).getStringCellValue();
					expectedMonthList.add(expectedMonth);
				} else if (String.valueOf(celltype).equals("NUMERIC")) {
					if (ConsideredRow.getLastCellNum() == 32) {
						long NumericCellValue = (long) ConsideredRow.getCell(j).getNumericCellValue();
						expectedDayList.add(String.valueOf(NumericCellValue));
					} else if (ConsideredRow.getLastCellNum() == 120) {
						long NumericCellValue = (long) ConsideredRow.getCell(j).getNumericCellValue();
						expectedYearList.add(String.valueOf(NumericCellValue));
					}
					workbook.close();
				}
			}
		}
		if (actualDayList.equals(expectedDayList)) {
			System.out.println("Pass: the Day options order and spelling is correct");
			System.out.println(actualDayList);
			System.out.println(expectedDayList);
		} else {
			System.out.println("Fail: the Day options order and spelling is notcorrect");
			System.out.println(actualDayList);
			System.out.println(expectedDayList);
		}
		if (actualMonthList.equals(expectedMonthList)) {
			System.out.println("Pass: the Month options order and spelling is correct");
			System.out.println(actualMonthList);
			System.out.println(expectedMonthList);

		} else {
			System.out.println("Fail: the Month options order and spelling is not correct");
			System.out.println(actualMonthList);
			System.out.println(expectedMonthList);
		}
		if (actualYearList.equals(expectedYearList)) {
			System.out.println("Pass: the Year options order and spelling is correct");
			System.out.println(actualYearList);
			System.out.println(expectedYearList);
		} else {
			System.out.println("Fail: the Year options order and spelling is notcorrect");
			System.out.println(actualYearList);
			System.out.println(expectedYearList);
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}