package TestNg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg3 {
	
	@Test(priority=1,description="verify the title of page")
	
	public void LoginPage() {
		
		//Arrangement
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aryal\\Desktop\\Selenium driver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");
		driver.manage().window().maximize();
		
		
		//Action
		String title= driver.getTitle();//actual title
		String expectedTitle = "WebDriver | Data Tables";
		
		//Assertion
		Assert.assertEquals(title, expectedTitle);
		driver.quit();
	}
	
	
	
	// if test case  is fails and browser not close that's called hardassertion
	// if whatever test case pass or fails browser will close thats called softassertion.
}
