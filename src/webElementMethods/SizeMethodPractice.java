package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeMethodPractice {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement facebookLogo=driver.findElement(By.xpath("//img[@alt='Facebook']"));
		Dimension size = facebookLogo.getSize();
		double height = size.getHeight();
	    double  width = size.getWidth();
		System.out.println("Height of the element is :"+height);
		System.out.println("Width of the Element is "+width);
		
		driver.quit();
		

		
		 
	}

}
