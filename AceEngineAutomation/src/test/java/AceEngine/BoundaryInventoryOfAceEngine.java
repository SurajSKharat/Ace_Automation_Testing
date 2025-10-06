package AceEngine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BoundaryInventoryOfAceEngine {

	@Test()
	
	public void InScopeInventory () throws InterruptedException {
	
	System.setProperty("Webdriver.chrome.driver", "D:\\Automation Project\\AceEngineAutomation\\driver\\chromedriver.exe");
	
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
	driver.findElement(By.xpath("//li[@aria-label = 'Nimbus Ventures']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//div [text() = 'Boundary Inventory']")).click();
	Thread.sleep(20000);
	driver.findElement(By.xpath("//span[text() = 'Compute'][1]")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[text() = 'Databases'][1]")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[text() = 'Storages']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[text() = 'All Assets']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[text() = 'AWS']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[text() = 'GCP']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[text() = 'OTHER']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[text() = 'All Resources']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//button[text()='Authorization Boundary']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[text()='Manage Authorization Boundary']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//button[@aria-label ='Close']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//button[text()='Authorization Boundary']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[text()='Create Authorization Boundary']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//button[text() ='Close']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//button[text()='Authorization Boundary']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[text()='Create Authorization Boundary']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@aria-label = 'Authorization Boundary Name']")).sendKeys("Testing");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@placeholder= 'Select or enter key']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[text()= 'aws:cloudformation:logical-id']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@placeholder= 'Select or enter value']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//button[text()= 'Submit']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//button[text() = 'Add Resource']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@aria-label = 'Resource Name']")).sendKeys("Testing 1");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@aria-label = 'Vendor name']")).sendKeys("Testing 3");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@value= 'moderate']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//textarea[@name= 'description']")).sendKeys("Testing njm");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//button[text()= 'Submit']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//a[text() = 'Audit Trail']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//div [text() = 'Boundary Inventory']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//div[text() = 'gcp interconnect location']")).click();
	
}
}