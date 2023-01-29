package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.jmx.ManagedAttribute;

public class XpathLocators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("I phone 14 pro max");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(3000);
	    driver.quit();
	    
	    
	   
	    
	    
	}

}
