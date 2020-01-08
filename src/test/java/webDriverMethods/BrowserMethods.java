package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		
//		Browser Methods
//		get()
//		getTitle()
//		getPageSource()
//		getCurrentUrl()
//		getwindowHandle()
//		close()
//		quit()
		
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationPractice\\Core Java\\selenium\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		System.out.println("Title of the page is : " + driver.getTitle());
		
		System.out.println("Current URL of the page is : " + driver.getCurrentUrl());

		driver.findElement(By.partialLinkText("Sign in")).click();
		Thread.sleep(2000);
		if(driver.getCurrentUrl().contains("authentication")) {
			System.out.println("Perform the action");
		}
		
//		System.out.println(driver.getPageSource());
		
		System.out.println(driver.getWindowHandle());
		driver.close();
	}
}
