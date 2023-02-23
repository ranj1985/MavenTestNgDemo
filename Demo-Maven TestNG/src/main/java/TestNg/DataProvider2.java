package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonFolder.BeforeMethod2;

public class DataProvider2 extends BeforeMethod2{
	
	ChromeDriver driver;
	
	//program1
	@Test
	@DataProvider(name="LoginCredntials")
	public Object[][] dataset2(){
		return new Object[][] {
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"}
		} ;
		
	}
	
	
	//program2
	
	@Test(dataProvider ="LoginCredentials")
	// Instead method name , we can pass value of name attribute in dataProviders
	public void Login(String username , String password) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aryal\\Desktop\\Selenium driver\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		// step1
		
		driver.findElement(By.cssSelector("#user-name")).sendKeys(username);
		// step2
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		// step3
		driver.findElement(By.cssSelector("#login-button")).click();
		
		
		

		
		// close the browser
		
		//driver.quit();
		
	
	}
}
