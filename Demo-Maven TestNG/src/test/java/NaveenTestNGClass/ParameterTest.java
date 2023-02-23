package NaveenTestNGClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	WebDriver driver;
	
	@Test
	@Parameters({"browser","url","emailId","password"})
	public void LoginTest(String browser,String url,String email,String password) {
		
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aryal\\Desktop\\Selenium driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}	
		else if(browser.equals("firefox")) {
		
			System.setProperty("webdriver.gecko.driver","C:\\Users\\aryal\\Desktop\\Selenium driver\\chromedriver_win32\\chromedriver.exe");
			driver=new FirefoxDriver();
	}
		
		driver.get("url");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("emailId");
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.name("login")).click();
		driver.quit();
		
		
		
		
		
		
	}

}
