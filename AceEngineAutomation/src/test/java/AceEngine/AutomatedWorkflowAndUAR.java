package AceEngine;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomatedWorkflowAndUAR {

	
@Test()
	
	public void UAR () throws InterruptedException {
		
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
		driver.findElement(By.xpath("//li[@aria-label = 'Enclave-1']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Automated Workflow']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text() = 'User Access Review']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder= 'Select System Name']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text ()= 'Enclave-1']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder= 'Enter Organization']")).sendKeys("Testing team");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder= 'Enter Requester Name']")).sendKeys("Ramgopal");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@ placeholder = 'Enter Email'][1]")).sendKeys("abc@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[ text() = 'Select Environment']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text ()= 'Stage']")).click();
		Thread.sleep(10000);
		
		   JavascriptExecutor js = (JavascriptExecutor) driver;

           // Scroll down slowly in small steps
           for (int i = 0; i < 1000; i += 10) { // Scroll down 1000px in 10px steps
               js.executeScript("window.scrollTo(0, " + i + ");");
               Thread.sleep(100); // 100ms delay between scrolls
           }
        driver.findElement(By.xpath("//input[@ placeholder= 'Enter First Name']")).sendKeys("Sagar");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@ placeholder= 'Enter Last Name']")).sendKeys("Kuma");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text ()= 'Select UAR Type']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text ()= 'Remove']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text ()= 'Cancel']")).click();
		Thread.sleep(10000);
       
}
}
