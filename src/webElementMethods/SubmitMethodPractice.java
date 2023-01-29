package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethodPractice {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement textField = driver.findElement(By.name("username"));
	textField.sendKeys("Admin");
	textField = driver.findElement(By.name("password"));
	textField.sendKeys("Manager");
	textField = driver.findElement(By.xpath("//button[@class='_acan _aiit _acap _aijb _acas _aj1-']"));
	Thread.sleep(3000);
	textField.submit();
	
	
	
}
	

}

