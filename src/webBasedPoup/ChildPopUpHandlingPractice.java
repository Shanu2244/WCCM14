package webBasedPoup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopUpHandlingPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.findElement(By.id("datepicker1")).click();
	    driver.findElement(By.xpath("(//a[text()='13'])[1]")).click();
	    driver.findElement(By.xpath("//a[text()='Search']")).click();
	    Thread.sleep(2000);
	    driver.quit();
	}

}
