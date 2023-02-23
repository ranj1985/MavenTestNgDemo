package TestNg;

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

public class TestNgday3 extends BeforeMethod2 {
	
	
@BeforeSuite
	
	public static void beforeSuit() {
		System.out.println(" SetUp Chrome,Set path for Driver");
	}
	
	@BeforeTest
	public static void beforeTest() {
		System.out.println("Open Chrome");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Open the Application under test-Website");
	}
	
	@BeforeMethod
	public static void beforeMethod() {
		
		System.out.println("Sign In");
	}
	@Test
	public static void Test1() {
		System.out.println(" Search for a product");
	}
	@Test
	public static void Test2() {
		System.out.println("Search for girl Dress");
	}
	@AfterMethod
	public static void afterMethod() {
		System.out.println("Sign out of the application");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("Close the Application under test-Website ");
	}
	@AfterTest
	public static void aferTest() {
		System.out.println("Close the Browser");
	}
	@AfterSuite
	public static void afterSuite() {
		System.out.println("Clean the cookies,send the report to the team");
	}
	
	
	
	

}
