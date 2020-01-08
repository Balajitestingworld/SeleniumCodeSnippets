package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumSample {
	
	public static WebDriver driver;
	
	WebElement userName = driver.findElement(By.id("user"));
	WebElement password = driver.findElement(By.id("pass"));
	WebElement loginBtn = driver.findElement(By.cssSelector(".login"));	
	
	@BeforeTest
	public WebDriver launchBrowser(String browserName) {
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationPractice\\Core Java\\selenium\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public void launchApplication(String url) {
		driver.get("http://automationpractice.com/index.php");
	}
	
	
	@Test
	public void login(String user, String pass) {
		userName.sendKeys(user);
		password.sendKeys(pass);
		loginBtn.click();
	}

	public static void main(String[] args) {
		SeleniumSample obj = new SeleniumSample();
		obj.launchBrowser("browserName");
		obj.launchApplication("url");
		obj.login("user", "pass");
		
		
		
//		driver.findElement(By.id("search_query_top")).sendKeys("abc");
//		boolean status  = driver.findElement(By.name("submit_search")).isEnabled();
//		System.out.println(status);
//		driver.quit();
		
		
		
//		Reusable methods - separate class/method
		
//		close/quit
//		Page Object model
//		Launch the Browser
		
		
		
//		Element Identification - id, name,  classname,  linktext, partiallinktext, tagname, xpath, css
//		Actions
//		validations
	}
}
