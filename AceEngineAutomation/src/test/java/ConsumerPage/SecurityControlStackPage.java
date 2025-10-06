package ConsumerPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecurityControlStackPage {

	
@Test()
	
	public void SecurityControlStack() throws InterruptedException {
		
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
		driver.findElement(By.xpath("//div[text() = 'Security Control Stack']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Audit']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'FedRAMP R5 (moderate)']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder = 'Quick search']")).sendKeys("Bastion Host");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[@aria-label ='clear input']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Select Status']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//p[text () ='Implemented']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//h2[text () ='VPN FIPS 140-2']")).click();
		Thread.sleep(10000);
		// Locate the scrollable element
        WebElement scrollableSection = driver.findElement(By.xpath("//section[@data-placement = 'right']"));
        scrollableSection.click();

        // Scroll down 300 pixels inside the element
        ((JavascriptExecutor) driver).executeScript(
            "arguments[0].scrollTop += 500;", scrollableSection);

        Thread.sleep(10000);

        // Scroll up 150 pixels
        ((JavascriptExecutor) driver).executeScript(
            "arguments[0].scrollTop -= 350;", scrollableSection);

        Thread.sleep(10000);

        // Scroll to bottom of the div
        ((JavascriptExecutor) driver).executeScript(
            "arguments[0].scrollTop = arguments[0].scrollHeight;", scrollableSection);

        Thread.sleep(10000);
		
        driver.findElement(By.xpath("//a[text()= 'sc-13']")).click();
		Thread.sleep(10000);
		
}
}
