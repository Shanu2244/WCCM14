package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CombinationOfActionAndRobotClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=EAIaIQobChMIsauSgvSb_AIVAyQrCh3jlAPHEAAYASAAEgKhdvD_BwE");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement target = driver.findElement(By.xpath("//a[.='Watch Jewellery ']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		
	
		
		
	}

}
