package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.id("email")).sendKeys("9890207679");
	Thread.sleep(3000);
	driver.findElement(By.id("pass")).sendKeys("manager");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	
}
}
