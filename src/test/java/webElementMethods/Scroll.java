package webElementMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Scroll {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationPractice\\Core Java\\selenium\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,1000)");
        
      //This will scroll the page till the element is found		
//        js.executeScript("arguments[0].scrollIntoView();", Element);
        
        
      //This will scroll the web page till end.		
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}

}
