package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationOfFacebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		Point location = element.getLocation();
		int X= location.getX();
		int Y = location.getY();
		System.out.println("X CORDINATES : "+X);
		System.out.println("Y Cordinates :"+Y);
	
		driver.quit();
		
	}
	

}
