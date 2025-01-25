package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadStringData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//  create object &specify the address & file to the object
		//  use . to give the address for file.
		FileInputStream fis= new FileInputStream("./src/test/resources/DataDrivenTesting.xlsx");
		//  open the file
		Workbook workbook = WorkbookFactory.create(fis);
		//  select sheet by giving name in argument
		Sheet sheet = workbook.getSheet("Sheet1");
		//  select ROW by giving index for ROW to select
		//  note -- index will be start from zero.
		Row row = sheet.getRow(2);
		//  select Cell by giving index
		Cell cell = row.getCell(1);
		
		System.out.println(cell.getStringCellValue());
		Row rowforpass = sheet.getRow(3);
		Cell cellforPass = rowforpass.getCell(1);
		System.out.println(cellforPass.getStringCellValue());
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(cell.getStringCellValue());
		driver.findElement(By.id("pass")).sendKeys(cellforPass.getStringCellValue());
		driver.findElement(By.name("login")).click();
		workbook.close();
	}
}
