package ConsumerPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BoundaryInventoryPage {

@Test()
	
	public void BoundaryInventory() throws InterruptedException {
		
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
		driver.findElement(By.xpath("//div[text() = 'Boundary Inventory']")).click();
		Thread.sleep(30000);
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
		driver.findElement(By.xpath("//a[text() = 'Audit Trail']")).click();
		Thread.sleep(10000);
}
}
