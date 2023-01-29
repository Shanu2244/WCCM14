package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDealTaskFrames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a = new Actions(driver);
		a.moveToElement(signIn).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='login']")).click();
	    driver.switchTo().frame(0);
	    Thread.sleep(3000);
	    driver.findElement(By.id("userName")).sendKeys("8379092244");
	    driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-delete-sign fnt-22']")).click();	    
	    driver.switchTo().defaultContent();
	    driver.findElement(By.name("keyword")).sendKeys("dresses");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[text()='Search']")).click();
	    Thread.sleep(3000);
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("argument");
	    Thread.sleep(3000);
	    driver.quit();
	    
	    
		
	}

}
