package AuditPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomatedWorkflowAnalyticPage {

@Test()
	
	public void AnalyticsOfAceEngine () throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "D:\\Automation Project\\AceEngineAutomation\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.get("https://dev.symetri.io/dashboard");
		Thread.sleep(10000);
		driver.findElement(By.name("email")).sendKeys("mdmojahid.legitbytes@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Test@123");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//button[text()= 'Log In' ]"));
		button.click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//p[text() = 'SYSTEM']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//li[@aria-label = 'Nimbus Ventures']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Automated Workflow']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text() = 'Analytics']")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[text () = 'View Tickets']")).click();
		Thread.sleep(10000);
		
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
