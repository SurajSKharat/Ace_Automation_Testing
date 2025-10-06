package AuditPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ComplianceFramworkPage {

@Test()
	
	public void ReportOfAceEngine () throws InterruptedException {
		
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
		driver.findElement(By.xpath("//div[text() = 'Compliance Framework']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//p[text() = 'high']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[text() = 'ac-1']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text() = 'See More']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text() = 'Back']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder = 'Quick search']")).sendKeys("AC-2-12");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[text() = 'ac-2-12']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text() = 'Compliance Framework']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//p[text() = 'low']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[text() = 'ac-1']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text() = 'See More']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text() = 'Back']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder = 'Quick search']")).sendKeys("AC-20");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[text() = 'ac-20']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text() = 'Compliance Framework']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//p[text() = 'low']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[text() = 'ac-1']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text() = 'See More']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text() = 'Back']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder = 'Quick search']")).sendKeys("AC-20");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[text() = 'ac-20']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text() = 'Compliance Framework']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//p[text() = 'moderate']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[text() = 'ac-1']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text() = 'See More']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text() = 'Back']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder = 'Quick search']")).sendKeys("AC-6");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[text() = 'ac-6']")).click();
}
}
