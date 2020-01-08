package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationPractice\\Core Java\\selenium\\src\\test\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);
	
		Actions act = new Actions(driver);
		
		WebElement element=driver.findElements(By.className("sf-with-ul")).get(3);
		driver.manage().window().maximize();
		
		//WebElement element=driver.findElement(By.xpath("//parent::li//following-sibling::ul[@class=\"submenu-container clearfix first-in-line-xs\"]//a[@class=\"sf-with-ul\" and @title=\"Dresses\"]"));
		
		act.moveToElement(element).build().perform();
		
		driver.findElement(By.linkText("Summer Dresses")).click();
		Thread.sleep(2000);
		
		WebElement image=driver.findElement(By.xpath("//img[@src=\"http://automationpractice.com/img/p/1/2/12-home_default.jpg\"]"));
		
	   //image.click();
	   
	    Thread.sleep(2000);
		act.moveToElement(image).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-id-product=\"5\" and @rel=\"nofollow\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title=\"Proceed to checkout\"]")).click();
		driver.findElement(By.xpath("//i[@class=\"icon-plus\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?controller=order&step=1\"]")).click();

	}

}