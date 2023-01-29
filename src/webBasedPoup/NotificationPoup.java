package webBasedPoup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPoup {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
//		co.addArguments("-start-maximized");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(3000);
        driver.quit();
	}
	

}
