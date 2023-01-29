package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.compress.compressors.FileNameUtil;
import org.apache.poi.examples.util.TempFileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshotOfSpecificElement {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement searchButton = driver.findElement(By.xpath("//input[@value='Search']"));
		File src =  searchButton.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ElementScreenshot/"+searchButton.getAttribute("value")+".png");
        Files.copy(src, dest);
        driver.quit();
		
		
	}

}
