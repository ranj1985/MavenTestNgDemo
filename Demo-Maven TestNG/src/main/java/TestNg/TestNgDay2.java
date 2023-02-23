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

public class TestNgDay2 extends BeforeMethod2 {
	
	
	@BeforeSuite
	
	public static void beforeSuit() {
		System.out.println(" Before Suite");
	}
	
	@BeforeTest
	public static void beforeTest() {
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public static void beforeMethod() {
		
		System.out.println("Before method");
	}
	@Test
	public static void Test1() {
		System.out.println(" Test One");
	}
	@Test
	public static void Test2() {
		System.out.println("Test Two");
	}
	@AfterMethod
	public static void afterMethod() {
		System.out.println("After Method");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	@AfterTest
	public static void aferTest() {
		System.out.println("After Test");
	}
	@AfterSuite
	public static void afterSuite() {
		System.out.println("After Suite");
	}

}
