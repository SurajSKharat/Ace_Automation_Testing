package AceEngine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ConnectorOfAceEngine {

	@Test()
	
public  void connectorOfAceEngine1 () throws InterruptedException {
		
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
		driver.findElement(By.xpath("//li[@aria-label = 'Nimbus Ventures']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text () = 'Connector']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder = 'Quick search']")).sendKeys("Test Connector");
		Thread.sleep(10000);
	//	driver.findElement(By.xpath("//input[@placeholder = 'Quick search']")).clear();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@aria-label= 'clear input']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()= 'Scan Frequency']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//p [text()= 'Monthly']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()= 'Clear Filter']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()= 'Connection Type']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//li[@aria-label = 'Service Account (GCP)']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()= 'Clear Filter']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class= 'ml-auto flex items-center justify-end gap-3']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//li[@data-key= 'aws']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@aria-label = 'Connector Alias']")).sendKeys("Test Connector");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder= 'Enter role ARN']")).sendKeys("QWER");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder= 'Enter external id for security']")).sendKeys(" Connector");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Monthly']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Yearly']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//textarea[@name= 'description']")).sendKeys(" Connector");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@type= 'submit']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[text() = 'Cancel']")).click();
		Thread.sleep(10000);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class= 'ml-auto flex items-center justify-end gap-3']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//li[@data-key= 'aws']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text() = 'IAM User']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@aria-label = 'Connector Alias']")).sendKeys("Test Connector");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@aria-label = 'Access key']")).sendKeys("Connector");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@aria-label = 'Secret key']")).sendKeys("Test Connector");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Monthly']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Yearly']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//textarea[@name= 'description']")).sendKeys(" Connector");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@type= 'submit']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[text() = 'Cancel']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[text() = 'View Scans']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Cloud Provider']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//p[text() = 'AWS']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()= 'Clear Filter']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Scan Status']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//p[text() = 'Success']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()= 'Clear Filter']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Scan Trigger Type']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//p[text() = 'Scheduled']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()= 'Clear Filter']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Connector']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//li[@aria-label ='Test GCP Connector']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()= 'Clear Filter']")).click();
}
}
