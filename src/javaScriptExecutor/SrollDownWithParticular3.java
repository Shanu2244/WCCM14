package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SrollDownWithParticular3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ebay.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement element = driver.findElement(By.xpath("//a[text()='Popular Destinations']"));
	Point location = element.getLocation();
	int X = location.getX();
	int Y = location.getY();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy("+X+","+Y+")");
	Thread.sleep(3000);
	driver.quit();
	
	
	
}
}
