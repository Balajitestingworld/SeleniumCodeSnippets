package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVerificationMethods {

	public static void main(String[] args) throws Exception {
//		Verification of the elements in browser
//		isEnabled()
//		isDisplayed()
//		isSelected()
		
	
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationPractice\\Core Java\\selenium\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
		
		WebElement btn = driver.findElement(By.id("SubmitLogin"));
		
		driver.findElement(By.id("email")).sendKeys("admin@def.com");
		driver.findElement(By.id("passwd")).sendKeys("admin");
		btn.click();
		
		try {
			if(driver.findElement(By.cssSelector("div.alert.alert-danger")).isDisplayed()) {
				System.out.println(driver.findElement(By.cssSelector("div.alert.alert-danger p")).getText());
			}
		}catch (Exception e) {
//			throw new Exception("Button is disabled");
			System.out.println(e.getMessage());
		}
		
		
//		if(driver.findElement(By.cssSelector("div.alert.alert-danger")).isDisplayed()) {
//			System.out.println(driver.findElement(By.cssSelector("div.alert.alert-danger p")).getText());
//		}
//		else {
//		throw new Exception("Button is disabled");
//		}
		
//		driver.close();
		
//		if(btn.isEnabled()) {
//			driver.findElement(By.id("email")).sendKeys("admin@def.com");
//			driver.findElement(By.id("passwd")).sendKeys("admin");
//			btn.click();
//		} else {
//			throw new Exception("Button is disabled");
//		}
//		
//		if(driver.findElement(By.cssSelector("div.alert.alert-danger")).isDisplayed()) {
//			System.out.println(driver.findElement(By.cssSelector("div.alert.alert-danger p")).getText());
//		}
		
			
//		Ternary operator
//		btn.isEnabled()?btn.click():throw new Exception("Button is disabled");
		
//		int a = 20;
//		a <10 ? System.out.println(" a is smaller") : System.out.println("a is larger");
		
	}
}
