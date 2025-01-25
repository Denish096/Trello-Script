package PopUP;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopup {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		WebElement fileUploadBTN = driver.findElement(By.id("docfile"));
//		fileUploadBTN.sendKeys("C:\\Users\\denis\\Downloads\\Dry Brush Clipart Transparent Background, Shree Ganeshaya Namah Hindi Calligraphy Dry Brush With Yellow Color Gradient, Shree, Ganeshaya, Namah PNG Image For Free Download.jpg");
		Actions actions = new Actions(driver);
		actions.scrollToElement(fileUploadBTN).pause(2000).click(fileUploadBTN).build().perform();
		Thread.sleep(3000);
//		fileUploadBTN.click(); 
		String FileAddress = "C:\\Users\\denis\\Downloads\\Dry Brush Clipart Transparent Background, Shree Ganeshaya Namah Hindi Calligraphy Dry Brush With Yellow Color Gradient, Shree, Ganeshaya, Namah PNG Image For Free Download.jpg" ;
		StringSelection samplefile = new StringSelection(FileAddress);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clip = toolkit.getSystemClipboard();
		clip.setContents(samplefile, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
	
