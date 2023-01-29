package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://desktop-f6hm3tr/login.do");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='initial']")).click();
	Thread.sleep(5000);
	driver.quit();
	
	
	
	
	
	
	
	
}


}
