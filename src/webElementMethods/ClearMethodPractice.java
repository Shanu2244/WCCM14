package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethodPractice {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
	searchField.sendKeys("I phone 14 Pro Max");
	Thread.sleep(3000);
	searchField.clear();
	
	Thread.sleep(2000);
	driver.quit();
	
	
	
}
}
