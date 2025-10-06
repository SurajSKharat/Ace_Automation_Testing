package AceEngine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecurityPolicyOfAceEngine {
	
	@Test()
		
		public void securityPolicyOfAceEngine1() throws InterruptedException {
				
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
				driver.findElement(By.xpath("//div[text() = 'Security Policies']")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath("//input[@placeholder = 'Quick search']")).sendKeys("Access Control Policy");
				Thread.sleep(10000);
				driver.findElement(By.xpath("//button[@aria-label= 'clear input']")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath("//span[text() = 'Select Frameworks']")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath("//div[text() = 'ISO 27001']")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath("//button[text()= 'Clear Filter']")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath("//span[text() = 'Cloud Provider']")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath("//p[text() = 'GCP']")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath("//button[text()= 'Clear Filter']")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath("//button[text() = 'Browse Templates']")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath("//a[text() = 'Policy Versions']")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath("//div[text() = 'Security Policies']")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath("//input[@placeholder = 'Quick search']")).sendKeys("Access Control Policy");
				Thread.sleep(10000);
				driver.findElement(By.xpath("//a[text() = 'Open']")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath("//button[text() = 'Export']")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath("//button[text() = ' AI Assistant']")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath("//textarea[@placeholder = 'Write your query here...']")).sendKeys("Hii");
				
				
				

}
}
