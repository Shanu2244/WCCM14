package webBasedPoup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopUpByAcceptMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement course = driver.findElement(By.id("course"));
	Actions a = new Actions(driver);
    a.moveToElement(course).perform();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[@class='wrappers']/a[text()='Selenium Training']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath(" //button[text()=' Add to Cart']")).click();
    Alert alertpopup = driver.switchTo().alert();
    System.out.println(alertpopup.getText());
    Thread.sleep(2000);
    alertpopup.accept();
    
}
}
