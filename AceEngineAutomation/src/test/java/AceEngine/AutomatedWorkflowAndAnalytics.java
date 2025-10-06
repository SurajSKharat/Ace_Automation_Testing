package AceEngine;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AutomatedWorkflowAndAnalytics {

	
	@Test()
	
	public void AnalyticsOfAceEngine () throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "D:\\Automation Project\\AceEngineAutomation\\driver\\driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.get("https://dev.symetri.io/dashboard");
		Thread.sleep(10000);
		driver.findElement(By.name("email")).sendKeys("mdmojahid@legitbytes.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Test@123");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//button[text()= 'Log In' ]"));
		button.click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//p[text() = 'SYSTEM']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//li[@aria-label = 'Enclave-1']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Automated Workflow']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text() = 'Analytics']")).click();
		Thread.sleep(10000);
		
		String originalWindowHandle = driver.getWindowHandle();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text () = 'View Tickets']")).click();
		//Thread.sleep(10000);
	//	Set<String> allWindowHandles = driver.getWindowHandles();
		Thread.sleep(10000);
		//for (String handle : allWindowHandles) {
	//	    if (!handle.equals(originalWindowHandle)) {
	//	        driver.switchTo().window(handle);
	//	        break;
	//	    }
	//	}
		
	//	driver.close();
	//	Thread.sleep(10000);
	//	driver.switchTo().window(originalWindowHandle);
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'UAR']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'CCN']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'ALL']")).click();
		Thread.sleep(10000);
		

		   JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down slowly in small steps
        for (int i = 0; i < 1000; i += 10) { // Scroll down 1000px in 10px steps
            js.executeScript("window.scrollTo(0, " + i + ");");
            Thread.sleep(100); // 100ms delay between scrolls
        }
		
		
	}
}
