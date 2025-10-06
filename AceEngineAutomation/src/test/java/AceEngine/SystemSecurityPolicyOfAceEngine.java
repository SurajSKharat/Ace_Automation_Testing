package AceEngine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SystemSecurityPolicyOfAceEngine {

@Test()
	
	public void SystemSecurityPolicyOfAceEngine () throws InterruptedException {
		
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
		driver.findElement(By.xpath("//div[text() = 'System Security Policy (SSP)']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Audit']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'FedRAMP R5 (moderate)']")).click();
		Thread.sleep(10000);
	
}
}
