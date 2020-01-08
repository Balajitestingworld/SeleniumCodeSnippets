package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		Navigation methods - Navigate to specific url
		driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
//		Navigation methods - Refresh the existing page
		driver.navigate().refresh();
		
//		Go back to previous page
		driver.navigate().back();
		
//		Select the next page
		driver.navigate().forward();
	}
}
