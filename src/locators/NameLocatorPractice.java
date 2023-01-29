package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocatorPractice {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://desktop-f6hm3tr/login.do");
	Thread.sleep(4000);
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("pwd")).sendKeys("manager");
    Thread.sleep(2000);
    
    driver.findElement(By.id("loginButton")).click();
    
    
    Thread.sleep(3000);
 
    if (driver.getTitle().contains("actiTIME "));
   
    System.out.println("Pass");
    else
    	System.out.println("Fail");
    }
    		
	}
   	
	


