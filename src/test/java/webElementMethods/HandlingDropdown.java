package webElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.findElement(By.xpath("//form[@id=\"create-account_form\"]//input[@data-validate=\"isEmail\"]")).sendKeys("abc@automationm1.com");
		
//		Dropdown handling using select class - Select By Index
		Select s = new Select(driver.findElement(By.id("days")));
		s.selectByIndex(1);

//		Dropdown handling using select class - Select By visible text
		Select month = new Select(driver.findElement(By.id("months")));
		month.selectByVisibleText("February ");
		
//		Dropdown handling using select class - Select By Value
		Select year = new Select(driver.findElement(By.id("years")));
		year.selectByValue("2019");
		
//		Print the list of drop down values
		List<WebElement> selectYearValues =  year.getOptions();
		for (WebElement y : selectYearValues) {
			System.out.println(y.getText());
		}
		
//		Handle drop downs with out select class
		driver.findElement(By.cssSelector("select#months")).click();
		Thread.sleep(5000);
		
		List<WebElement> yearValues = driver.findElements(By.cssSelector("select#months option"));
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
	}
}
