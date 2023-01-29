package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolDownAction {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/downloads/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement rubyElement = driver.findElement(By.xpath("//p[.='Ruby']"));
	Point point = rubyElement.getLocation();
	int Xaxis = point.getX();
	int Yaxis = point.getY();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	System.out.println(Xaxis);
	System.out.println(Yaxis);
	jse.executeScript("window.scrollBy("+Xaxis+","+(Yaxis-200)+")");
	
			
	
	
}
}
