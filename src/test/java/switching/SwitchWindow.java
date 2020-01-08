package switching;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchWindow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\AutomationPractice\\Core Java\\selenium\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// Put an Implicit wait, this means that any search for elements on the page
		// could take the time the implicit wait is set for before throwing exception
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		String handle = driver.getWindowHandle();
		System.out.println(handle);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// This will scroll down the page by 1000 pixel vertical
		js.executeScript("window.scrollBy(0,500)");
		
		WebElement Element = driver.findElement(By.cssSelector(
				"div.wpb_column.vc_column_container.vc_col-sm-8 > div > div > div > div > p:nth-child(6) > button"));
//		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 Element.click();
		Set handles = driver.getWindowHandles();

		System.out.println(handles);
		for (String handle1 : driver.getWindowHandles()) {
			System.out.println(handle1);
			driver.switchTo().window(handle1);
		}
		driver.quit();

	}

}