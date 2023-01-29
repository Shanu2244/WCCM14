package webBasedPoup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpPractice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shahanawaj/OneDrive/Documents/alert%20popup.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    WebElement button = driver.findElement(By.xpath("//button[.='click me! ']"));
	    button.click();
	    Alert al = driver.switchTo().alert();
	    Thread.sleep(2000);
	    String textofAlert = al.getText();
	    System.out.println(textofAlert);
	    
	    Thread.sleep(3000);
	    //al.accept();
	    //al.dismiss();
	    
	    
	    
	}

}