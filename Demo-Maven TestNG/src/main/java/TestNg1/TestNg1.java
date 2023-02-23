package TestNg1;

import org.testng.annotations.Test;

public class TestNg1 {
	
	@Test(priority=1)
	public  void Loging() {
		System.out.println("Login Page");
		
	}
	@Test(priority=0)
	public  void HomePage() {
		
		
		System.out.println("Lunch Home Page");
	}
	@Test(priority=2)
	public  void LogOut() {
		System.out.println("Log out the page");
	}
	
	@Test
	public void Hello() {
		
		System.out.println("Hello home page");
	}

}
