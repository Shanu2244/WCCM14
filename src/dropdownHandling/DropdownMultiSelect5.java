package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import operationalMethods.IsMultipleMethod;

public class DropdownMultiSelect5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dropdown = driver.findElement(By.id("cars"));
		Select s = new Select(dropdown);
		if(s.isMultiple())
			System.out.println("Multi select dropdown");
		else
			System.out.println("not multi select dropdown");
		driver.quit();
		
		
	}

}
