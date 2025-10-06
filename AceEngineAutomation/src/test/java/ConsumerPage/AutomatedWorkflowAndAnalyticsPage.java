package ConsumerPage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomatedWorkflowAndAnalyticsPage {

@Test()
	
	public void Audit() throws InterruptedException {
		
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
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'Automated Workflow']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text() = 'Analytics']")).click();
		Thread.sleep(10000);
		
		String originalWindowHandle = driver.getWindowHandle();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text () = 'View Tickets']")).click();
		Thread.sleep(10000);
		Set<String> allWindowHandles = driver.getWindowHandles();
		Thread.sleep(10000);
		for (String handle : allWindowHandles) {
		    if (!handle.equals(originalWindowHandle)) {
		        driver.switchTo().window(handle);
		        break;
		    }
		}
		
		driver.close();
		Thread.sleep(10000);
		driver.switchTo().window(originalWindowHandle);
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'UAR']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'CCN']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() = 'ALL']")).click();
		Thread.sleep(10000);

		   JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down slowly in small steps
        for (int i = 0; i < 1000; i += 10) { // Scroll down 1000px in 10px steps
            js.executeScript("window.scrollTo(0, " + i + ");");
            Thread.sleep(100); // 100ms delay between scrolls
        }
}
}
