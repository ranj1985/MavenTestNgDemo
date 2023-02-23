package TestNgRevision;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgPractices1 {
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	@Test(priority=0)
	public void Login() {
		System.out.println("Login the page");
	}
	@Test(priority=1)
	public void Homepage() {
		System.out.println("Login in to the Homepage");
	}

	@Test(priority=2)
	public void Logout() {
		
		System.out.println("Logout from the Homepage");
	}
	@AfterSuite
	public void AfterSuit() {
		System.out.println("AfterSuite");
	}
}
