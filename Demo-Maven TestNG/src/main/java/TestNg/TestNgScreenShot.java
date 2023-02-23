package TestNg;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgScreenShot {
	
	
	@Test
	public void Login() throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aryal\\Desktop\\Selenium driver\\chromedriver_win32\\chromedriver.exe");

	WebDriver	driver = new ChromeDriver();
	
	Date currentDate =new Date();
	String currentDateS = currentDate.toString().replace(" ", "-").replace(":", "-");
	
	System.out.println(currentDateS);
	
	
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
	driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
	driver.findElement(By.cssSelector("#login-button")).click();
	
	
	
	TakesScreenshot scrShot =(TakesScreenshot)driver;
	File SourceFile= scrShot.getScreenshotAs(OutputType.FILE);
	File DestFile =new File(".//screenshot//screenshot.png");
	FileUtils.copyFile(SourceFile, DestFile);
	
	
	driver.quit();
	
		
		
		
		
	}
	
	
	

}
