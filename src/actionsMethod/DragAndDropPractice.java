package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPractice {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement src = driver.findElement(By.xpath("//a[contains(text(),' BANK ')]"));
	WebElement target = driver.findElement(By.id("bank"));
   Actions act = new Actions(driver);
   act.dragAndDrop(src, target).perform();
   Thread.sleep(3000);
   WebElement src1 = driver.findElement(By.xpath("//a[contains(text(),' SALES ')]"));
   WebElement target1 = driver.findElement(By.xpath("//ol[@class='field15 ui-droppable ui-sortable']"));
   Thread.sleep(3000);
   act.dragAndDrop(src1, target1).perform();
   Thread.sleep(3000);
   WebElement src2 = driver.findElement(By.xpath("//a[contains(text(),' 5000 ')]"));
   WebElement target2 = driver.findElement(By.xpath("(//ol[@class='field13 ui-droppable ui-sortable'])[2]"));
   act.dragAndDrop(src2, target2).perform();
   
  
	
}
}
