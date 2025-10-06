package AceEngine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AuditOfAceEngine {

	@Test()
	
public void auditOfAceEngine1 () throws InterruptedException {
		
		// ChromeDriver driver = new ChromeDriver ();// Access the Chrome method
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Project\\AceEngineAutomation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver (); //Access the Chrome method + web method
		driver.manage().window().maximize();
		driver.get("https://dev.symetri.io/dashboard");
		Thread.sleep(2000);
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
		driver.findElement(By.xpath("//div[text() = 'Audit']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder = 'Quick search']")).sendKeys("Test Connector");
		Thread.sleep(10000);
	//	driver.findElement(By.xpath("//input[@placeholder = 'Quick search']")).clear();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@aria-label= 'clear input']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Audit Status']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//p[text() = 'Completed' ]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()= 'Clear Filter']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Select Frameworks']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text() = 'FedRAMP R5 (high)' ]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()= 'Clear Filter']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text() = 'Select auditor' ]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text() = 'Create New Audit' ]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text() = 'Create New Audit' ]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@ placeholder='Enter audit name']")).sendKeys("Test Connector");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[ text () ='Compliance Framework']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@class='flex-1 text-small font-normal'][1]")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//textarea[ @placeholder ='Type here...']")).sendKeys("Test Connector");
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//input[ @aria-label='Assign Auditor']")).sendKeys("Email");
		//Thread.sleep(10000);
		//driver.findElement(By.xpath("//span[ text()='Email']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		
}
}
