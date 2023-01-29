package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

public class ActiTimeTestValidCreds {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-f6hm3tr/login.do");
		FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	   Sheet sheet = (org.apache.poi.sl.usermodel.Sheet) wb.getSheet("validcreds");
	   sh
	   
		
		WebElement username =  driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		

		
	}

}
