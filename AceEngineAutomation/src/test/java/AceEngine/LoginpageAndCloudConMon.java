package AceEngine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LoginpageAndCloudConMon {

	@Test()
	
	public void CloudConMon() throws InterruptedException {
		
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
		driver.findElement(By.xpath("//button[@aria-label = 'Cloud Provider']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//li[@aria-label = 'Amazon Web Services']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@aria-label = 'Cloud Provider']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//li[@aria-label = 'Google Cloud Platform']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@aria-label = 'Cloud Provider']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//li[@aria-label = 'Azure']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text() = 'Clear Filter']")).click();
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[name()='g' and @class='recharts-layer recharts-pie-sector'][4]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text() = 'Clear Filter']")).click();
		Thread.sleep(10000);
		driver.get("https://dev.symetri.io/dashboard");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//a[text() = 'Add Connector']")).click();
		Thread.sleep(10000);		
		driver.get("https://dev.symetri.io/dashboard");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[text() = 'View All Findings']")).click();
		//Thread.sleep(10000);		
		//driver.get("https://dev.cinemishraproduction.in/dashboard");
		Thread.sleep(10000);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Severity Status']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//p[text() = 'Critical']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text() = 'Clear Filter']")).click();
		Thread.sleep(10000);
		driver.get("https://dev.symetri.io/dashboard");
		System.out.println(driver.getCurrentUrl());
		
	}
	}























































