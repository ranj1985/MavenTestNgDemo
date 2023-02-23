package NaveenTestNGClass;

import org.testng.annotations.Test;

public class TestNgFeatures {
	
	// dependency methods
	
	@Test()
	public void loginTest() {
		
	System.out.println("Login Test");	
	int i=9/0;
	}
	//if one method/test depends on loginTest that time if that test fail other test case not running it will skips 
	@Test(dependsOnMethods="loginTest")
	public void HomePage() {
		
		System.out.println("Homepage");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void SearchPageTest() {
	System.out.println("Search page test");
}
	
	@Test(dependsOnMethods="loginTest")
	public void RegPageTest() {
		System.out.println("RegPageTest");
	}
	

}
