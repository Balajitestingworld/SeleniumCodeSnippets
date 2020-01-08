package locators;

import java.util.List;

import org.apache.commons.math3.geometry.spherical.oned.S1Point;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

//		xpath - Absolute, Relative
		driver.findElement(By.xpath("//form[@id=\"create-account_form\"]//input[@data-validate=\"isEmail\"]")).sendKeys("abc@automationm1.com");
		
//		Relative xpath
		//form[@id="create-account_form"]//input[@data-validate="isEmail"]
		//*[@id="email_create"]
		//input[@data-validate="isName"]
		//label[@for="customer_firstname"]
		//label[contains(text(),"rst")]
		//label[starts-with(text(),"First")]
		
		driver.findElement(By.id("SubmitCreate")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("customer_firstname")).sendKeys("abc");
		driver.findElement(By.id("customer_lastname")).sendKeys("automation");
		
		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("abc@automaiton1.com");
		driver.findElement(By.id("passwd")).sendKeys("abc123");
		
		Select s = new Select(driver.findElement(By.id("days")));
		s.selectByIndex(1);
		
		Select month = new Select(driver.findElement(By.id("months")));
//		month.selectByIndex(2);
		month.selectByVisibleText("February ");
		
		
		Select year = new Select(driver.findElement(By.id("years")));
//		year.selectByValue("2019");
		
		
//		# -id
//		. - classname
//		" " - child tag name
		
//		Handle drop downs wihtout select class
		
		driver.findElement(By.cssSelector("select#months")).click();
		Thread.sleep(5000);
		List<WebElement> yearValues = driver.findElements(By.cssSelector("select#months option"));
		
//		List<WebElement> yearValues =  year.getOptions();
		
		for (WebElement y : yearValues) {
			if(y.getText().contains("February")) {
				Thread.sleep(1000);
				System.out.println("Required text is displayed " + y.getText());
				y.click();
			}
			else {
				System.out.println(y.getText());
//				throw new Exception("Dropdown value not avaiable");
			}
		}
		
//		System.out.println(yearValues.get(1).getText());
		
//		Css selectos and navigation methods
		
//		driver.close();
//		driver.quit();
		

	}

}
