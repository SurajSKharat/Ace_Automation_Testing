package AceEngine;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomatedWorkflowAndCCN {

	
@Test()
	
	public void UAR () throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "D:\\Automation Project\\AceEngineAutomation\\driver\\driver\\chromedriver.exe");
		
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
		driver.findElement(By.xpath("//div[text() = 'Change Control Notification']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@aria-label = 'Select System Name']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()= 'Enclave-1']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()= 'Select Ticket Type']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()= 'CCN']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()= 'Select Responsibility']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()= 'Earthling']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()= 'Select Responsible Team']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()= 'Earthling Compliance']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()= 'Select Assignees']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()= 'Admin User']")).click();
		Thread.sleep(10000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");

		driver.findElement(By.xpath("//input[@aria-label = 'Enter Subject']")).sendKeys("Testing");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@aria-label = 'Enter Summary']")).sendKeys("Testing 123");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()= 'Select Status']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()= 'Completed']")).click();
		Thread.sleep(10000);
		
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0, 500);");
		
		Thread.sleep(10000);
		String implDate = System.getProperty("implementation.date", "not-specified");
		System.out.println("24/08/2025 " + implDate);

		
		driver.findElement(By.xpath("//div[@aria-label = 'hour, ']")).sendKeys("03");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@aria-label = 'minute, ']")).sendKeys("06");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Choose Yes/No'][1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Yes']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Select Environment']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Stage']")).click();
		Thread.sleep(10000);
		
		JavascriptExecutor jss1= (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0, 500);");
		
		driver.findElement(By.xpath("//input[@aria-label = 'Enter Organization']")).sendKeys("Testing10");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@aria-label = 'Enter Requester Name']")).sendKeys("Testing11");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@aria-label = 'Enter Email']")).sendKeys("testing@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@aria-label = 'Enter Proposed Actions']")).sendKeys("Testing12");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@aria-label = 'Enter Revert Actions']")).sendKeys("Testing13");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@aria-label = 'Enter Dev Ops Item']")).sendKeys("Testing14");
		
		JavascriptExecutor jss2= (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0, 500);");
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@aria-label = 'Enter System']")).sendKeys("Testing15");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@aria-label = 'Enter Test Case Details']")).sendKeys("Testing16");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@aria-label = 'Enter User Impact']")).sendKeys("Testing17");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()= 'Choose Yes/No'][1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()= 'No']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()= 'Choose Yes/No'][1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		
}
}