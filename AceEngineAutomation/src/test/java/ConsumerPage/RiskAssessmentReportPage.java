package ConsumerPage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RiskAssessmentReportPage {

@Test()
	
	public void BoundaryInventory() throws InterruptedException {
		
		// ChromeDriver driver = new ChromeDriver ();// Access the Chrome method
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Project\\AceEngineAutomation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver (); //Access the Chrome method + web method
		driver.manage().window().maximize();
		driver.get("https://dev.symetri.io/dashboard");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("nidogra@legitbytes.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Test@123");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//button[text()= 'Log In' ]"));
		button.click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//span[text() = 'Risk Assessment']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text() = 'Reports']")).click();
		Thread.sleep(10000);
		
		String originalWindowHandle = driver.getWindowHandle();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text () = 'View Tickets']")).click();
		Thread.sleep(10000);
		Set<String> allWindowHandles = driver.getWindowHandles();
		Thread.sleep(10000);
		for (String handle : allWindowHandles) {
		    if (!handle.equals(originalWindowHandle)) {
		        driver.switchTo().window(handle);
		        break;
		    }
		}
		
		driver.close();
		Thread.sleep(10000);
		driver.switchTo().window(originalWindowHandle);
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text() = 'Schedules']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text () = 'Sync with Qualys']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text() = 'Scans']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text () = 'Sync with Qualys']")).click();
		Thread.sleep(10000);
}
}
