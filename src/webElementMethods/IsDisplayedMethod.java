package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.vtiger.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   WebElement vtigerLogo = driver.findElement(By.xpath("//img[@alt='vtiger crm']"));
	   boolean status = vtigerLogo.isDisplayed();
	   System.out.println(status);
	   if (status)
		   System.out.println("pass");
	   else
		   System.out.println("Fail");
	   driver.quit();
	   
   
		  

	}

}