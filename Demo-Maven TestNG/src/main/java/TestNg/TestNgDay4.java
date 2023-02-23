package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonFolder.BeforeMethod2;

public class TestNgDay4 extends BeforeMethod2{
	//WebDriver driver;
	ChromeDriver driver;
	
@BeforeTest
	
	public  void SetUp() {
		System.out.println(" SetUp Chrome,Set path for Driver");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aryal\\Desktop\\Selenium driver\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		//WebDriver driver= new ChromeDriver(options);
		driver= new ChromeDriver(options);
		
		System.out.println("Open Chrome");
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	
	
	
	
	@Test
	public  void SignIn() {
		
		System.out.println("Sign In");
		driver.findElement(By.id("email")).sendKeys("2143476938");
		driver.findElement(By.id("pass")).sendKeys("S1anvit16#");
		driver.findElement(By.name("login")).click();
		
	}
	
	@AfterTest
	
	
	public void CloseBrowser() {
		System.out.println(" Close the Bowser");
		//driver.quit();
	}
}