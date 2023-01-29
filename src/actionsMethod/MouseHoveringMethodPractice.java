package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoveringMethodPractice {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement courseLink = driver.findElement(By.id("course"));
	Actions a = new Actions(driver);
	a.moveToElement(courseLink).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[@class='wrappers']/a[1]")).click();
	Thread.sleep(3000);
	driver.quit();
	
	
	
	
}
}
