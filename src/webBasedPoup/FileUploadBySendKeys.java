package webBasedPoup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadBySendKeys {
	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.foundit.in/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
    driver.findElement(By.id("file-upload")).sendKeys("E:\\Exam Form\\Q Spider Sam\\RESUME PC.docx");
    driver.findElement(By.id("pop_upload")).click();
  
		
		
	}

}
