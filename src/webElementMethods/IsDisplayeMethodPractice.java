package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayeMethodPractice {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://desktop-f6hm3tr/login.do");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			      WebElement actitimeLogo = driver.findElement(By.xpath("//img[@src='/img/default/login/timer.gif?hash=1692528820']"));
			    boolean status = actitimeLogo.isDisplayed();
			    System.out.println(status);
			   if (status)
				   
			    	
			
	}
	

}
