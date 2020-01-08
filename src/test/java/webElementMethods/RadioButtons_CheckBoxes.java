package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons_CheckBoxes {

	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationPractice\\Core Java\\selenium\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?");
		
		driver.findElement(By.partialLinkText("Sign in")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("email_create")).sendKeys("abc@automationm1.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(3000);

			// Selecting Radio button		
	        WebElement option1 = driver.findElement(By.id("id_gender1"));							 		
	        option1.click();			

	        // Check whether the radio button is selected or not 		
	        if (option1.isSelected()) {					
	            System.out.println("RadioButton is Toggled On");					

	        } else {			
	            System.out.println("RadioButton is Toggled Off");					
	        }		
	        
//	        checkbox
	        WebElement option2 = driver.findElement(By.id("newsletter"));							 		
	        option2.click();	
	        
	      
	        
//		driver.close();
	}
}
