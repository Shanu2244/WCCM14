package webBasedPoup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffMailPopUpPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       WebElement button = driver.findElement(By.name("proceed"));
       button.click();
      Alert A1 = driver.switchTo().alert();
      Thread.sleep(2000);
      A1.accept();
      Thread.sleep(2000);
      driver.findElement(By.name("login")).sendKeys("abc");
      driver.findElement(By.id("password")).sendKeys("Manager");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@type='submit']")).click();
      
      
      
       
	}

}
