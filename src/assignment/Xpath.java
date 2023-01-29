package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-f6hm3tr/login.do");
		driver.findElement(By.xpath("(\"//input[@name='username']\")"));
		driver.findElement(By.xpath("//input[@name='pwd']"));
		
		
	}

}
