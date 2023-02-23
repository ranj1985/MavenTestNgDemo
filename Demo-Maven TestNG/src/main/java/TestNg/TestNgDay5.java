package TestNg;

import org.testng.annotations.Test;

import CommonFolder.BeforeMethod2;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestNgDay5 extends BeforeMethod2{
	
	
	@Test
	public void Login() {
		
		//Arrangement
		System.out.println(" SetUp Chrome,Set path for Driver");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aryal\\Desktop\\Selenium driver\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("Https://www.google.com");
	
		
		
		
		
		
	driver.quit();	
		
		
		
	}

}
