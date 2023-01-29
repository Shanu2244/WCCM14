package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLogicalOperators 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en/eoss/eoss-men");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='cookie-banner-close-btn']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
