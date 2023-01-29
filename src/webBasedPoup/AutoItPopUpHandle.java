package webBasedPoup;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItPopUpHandle {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("F:\\AutoitAu3\\FileUploadPopUp.au3extension.exe");
      
	}

}
