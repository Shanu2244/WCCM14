package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Shahanawaj");
		Thread.sleep(3000);
		
		driver.findElement(By.name("lastname")).sendKeys("Pathan");
		Thread.sleep(3000);
		
		driver.findElement(By.name("reg_email__")).sendKeys("8379092244");
		Thread.sleep(3000);
		driver.findElement(By.name("birthday_day")).sendKeys("25");
		Thread.sleep(2000);
		
		driver.findElement(By.id("month")).sendKeys("Sep");
		Thread.sleep(2000);
		driver.findElement(By.name("birthday_year")).sendKeys("1995");
		Thread.sleep(2000);
	
		
	
		
		
	}

}
