package switching;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationPractice\\Core Java\\selenium\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		// Put an Implicit wait, this means that any search for elements on the page
		// could take the time the implicit wait is set for before throwing exception
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// This will scroll down the page by 1000 pixel vertical
		js.executeScript("window.scrollBy(0,500)");
		
        driver.findElement(By.id("alert")).click();

        // Switch to JavaScript Alert window
        Alert myAlert = driver.switchTo().alert();

        System.out.println(myAlert.getText());
        myAlert.accept();
        
//		driver.quit();

	}

}
