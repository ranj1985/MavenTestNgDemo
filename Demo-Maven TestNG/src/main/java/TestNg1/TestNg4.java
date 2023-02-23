package TestNg1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg4 {
	ChromeDriver driver;
	
	@BeforeMethod
	public void LunchBrowser() {
		
		//Arrangement
				System.setProperty("webdriver.chrome.driver","C:\\Users\\aryal\\Desktop\\Selenium driver\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");
				driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}

	
	@Test
	public void LoginTitle() {
		
		//Action
		
		String title=driver.getTitle();
		String expectedTitle="WebDriver | Data Tables";
		
		
		
		//Assertion
		
		Assert.assertEquals(title, expectedTitle);
		//driver.quit();
		
		
	}
	
	
	@Test
	public void ValidatePageHeader() {
		String actualHeaderText=driver.findElement(By.cssSelector("h1")).getText();
		String expectedHeaderText="Data, Tables & Button States";
		Assert.assertEquals(actualHeaderText, expectedHeaderText);
		
		
	}
	
	
	
}
