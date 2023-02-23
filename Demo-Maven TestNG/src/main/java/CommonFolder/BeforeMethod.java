package CommonFolder;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BeforeMethod {
	
	
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Run this annotation Before each Class Method");
		
	}

	
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("Run this annotation after each Class Method");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Run this annotation before each Test Method");
	}
	@AfterTest
	public void afterTest() {
		
		System.out.println("Run this annotation after each Test Method");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		
		
		System.out.println("Run this annotation before every  before suite");
		
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("Run this annotation after every  after suite");
	}
}
