package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandlingPractice2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
	Select s = new Select(dropdown);
	s.selectByVisibleText("Luggage");
	Thread.sleep(3000);
	s.selectByIndex(8);
	
	Thread.sleep(2000);
	s.selectByVisibleText("Girls' Fashion");
	
	System.out.println(s.getFirstSelectedOption().getText());
	Thread.sleep(2000);
	driver.quit();
	
	
	
}
}
