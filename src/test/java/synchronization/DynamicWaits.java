package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicWaits {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\AutomationPractice\\Core Java\\selenium\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?");
		
		Actions act = new Actions(driver);
		
		WebElement womenLink = driver.findElement(By.cssSelector("a[title='Women']"));
		act.moveToElement(womenLink).perform();
//		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.
				visibilityOfElementLocated(By.cssSelector("ul li a[title='Casual Dresses']")));
		
		
		WebElement tShirts = driver.findElements(By.cssSelector("ul li a[title='Casual Dresses']")).get(1);
		WebDriverWait wait1 = new WebDriverWait(driver, 5);
		wait1.until(ExpectedConditions.
				visibilityOfElementLocated(By.cssSelector("ul li a[title='Casual Dresses']")));
		
		act.moveToElement(tShirts).click().perform();
		
//		Fluent wait, Implicit wait
//		Iframes
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		
//		.frame(driver.findElement((By.cssSelector("iframe.cnvr-ad-ubr-iframe.cnvr-ad-container"))));
		
		System.out.println(driver.getCurrentUrl());
//		driver.findElement(By.id("cbb")).click();
		
//		window handling, scroll bar
		
		
		
	}

}
