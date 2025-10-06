package AuditPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkBenchPage {

	@Test()
	
public void workbenchOfAceEngine1() throws InterruptedException {
		
		// ChromeDriver driver = new ChromeDriver ();// Access the Chrome method
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Project\\AceEngineAutomation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver (); //Access the Chrome method + web method
		driver.manage().window().maximize();
		driver.get("https://dev.symetri.io/dashboard");
		Thread.sleep(2000);
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
		driver.findElement(By.xpath("//div[text()= 'Workbench']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Test Audit']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'FedRAMP R5 (moderate)']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder = 'Quick search']")).sendKeys("CA");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@aria-label= 'clear input']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[text () = 'CA']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder = 'Quick search']")).sendKeys("CA-2-1");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@aria-label= 'clear input']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Control Status']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//p[text() = 'In Audit Review']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()= 'Clear Filter']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Control Priority']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//p[text() = 'Medium']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()= 'Clear Filter']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[text() = 'ca-2-1']")).click();
		Thread.sleep(10000);}
}