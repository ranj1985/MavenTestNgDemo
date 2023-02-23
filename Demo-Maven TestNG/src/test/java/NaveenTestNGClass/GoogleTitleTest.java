package NaveenTestNGClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class GoogleTitleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aryal\\Desktop\\Selenium driver\\chromedriver_win32\\chromedriver.exe");
		
				driver = new ChromeDriver();// launch chrome
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.get("http://www.google.com");
	}
	
	
	@Test()
	public void googleTitleTest() {
		
	String title= driver.getTitle();
	System.out.println(title);

	Assert.assertEquals(title, "Google");
	
	//Or
	//Assert.assertEquals(title, "Google","title is not match")
	
	//Assert.assertEquals(title, "Google(This is actual value)","title is not match");// we can pass the parameter like this if title is not match
	
		
	}
	
	@Test()
	public void googleLogoTest() {
	boolean logo= driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
	System.out.println(logo);	
	
	//we can use any one method for assertion 
	//Assert.assertEquals(logo,true );
	Assert.assertEquals(logo,true );
	//or
	//Assert.assertTrue(logo);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}