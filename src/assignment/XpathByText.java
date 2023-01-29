package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//a[contains(.,'Forgotten ')]")).click();
		driver.findElement(By.xpath("//input[@class='inputtext _9o1w']")).sendKeys("john cena");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		if (driver.getTitle().contains("facebook"));
		System.out.println("pass");
		
		driver.quit();
		
		     
	}

}
