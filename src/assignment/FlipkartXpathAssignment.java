package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartXpathAssignment {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[.='✕']")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("I phone 14 pro max");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 Pro Max 5G (Silver, 128 GB)']/ancestor::div[@class='col col-7-12']/following-sibling::div[@class='col col-5-12 nlI3QM']/div[1]")).click();
    Thread.sleep(3000);
    
    
   
    
    
    
    
	
	
	}

}
