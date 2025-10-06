package ConsumerPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GrcAnalyticPage {

@Test()
	
	public void GrcAnalytic() throws InterruptedException {
		
		// ChromeDriver driver = new ChromeDriver ();// Access the Chrome method
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Project\\AceEngineAutomation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver (); //Access the Chrome method + web method
		driver.manage().window().maximize();
		driver.get("https://dev.symetri.io/dashboard");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("nidogra@legitbytes.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Test@123");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//button[text()= 'Log In' ]"));
		button.click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//div[text() = 'GRC Analytics']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Audit']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'FedRAMP R5 (high)']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Select Frameworks']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[ text() = 'ISO 27001:2013'][1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text() = 'Download Evidences']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text() = 'GRC Analytics']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text() = 'Analytics']")).click();
}
}
