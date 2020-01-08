package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClasses {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationPractice\\Core Java\\selenium\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?");
		
		Actions act = new Actions(driver);
		
		WebElement womenLink = driver.findElement(By.cssSelector("a[title='Women']"));
		act.moveToElement(womenLink).perform();
		Thread.sleep(2000);
		WebElement tShirts = driver.findElements(By.cssSelector("ul li a[title='Casual Dresses']")).get(1);
		act.moveToElement(tShirts).click().perform();
//		.click(driver.findElement(By.linkText("T-shirts"))).build().perform();

	}

}
