package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethodPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		      WebElement searchButton = driver.findElement(By.id("nav-bar-left"));
		    boolean enableStatus = searchButton.isEnabled();
			if (enableStatus)
		    	System.out.println("Enabled");
		    else
		    	System.out.println("Disabled");
		    driver.quit();
		    
	}

}
