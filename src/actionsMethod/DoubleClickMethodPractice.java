package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethodPractice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in/channels");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement sportstab = driver.findElement(By.xpath("//div[.='Sports']"));
		Actions a = new Actions(driver);
		a.moveToElement(sportstab).perform();
		Thread.sleep(3000);
		WebElement kabbadi = driver.findElement(By.xpath("//a[.='Kabaddi']"));
		a.doubleClick(kabbadi).perform();
			
		
		
	}

}
