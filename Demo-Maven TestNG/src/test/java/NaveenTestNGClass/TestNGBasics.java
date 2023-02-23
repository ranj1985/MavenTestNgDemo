package NaveenTestNGClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	/*Set up system property for chrome
	Login method
	LunchChrome Browser
	Enter URL
	Google title test
	Log out from app
	Close Browser
	Delete All cookies
	PASSED: googleTitleTest
*/
	
	// pre-condition annotation--starting with @Before
	
	@BeforeSuite//1
	public void setUp() {
		
		System.out.println("@Before Suite---Set up system property for chrome");
	}
	
	@BeforeTest//2
	public void lunchBrowser() {
		
		System.out.println("@BeforeTest-----LunchChrome Browser");
	}

	@BeforeClass//3
	public void login() {
		
		System.out.println("@BeforeClass---Login to app");
		
	}
	
	/*@beforeSuit-----Set up system property for chrome
	 * @BeforeTest----LunchChrome Browser
	 * @BeforeClass--Login to app
	 * 
	 * @BeforeMethod---enter URL
	 * @Test case-1---google title test
	 * @AfterMethod----log out
	 * 
	 * @BeforeMethod----enter URL
	 * @Test case-2----google logo test
	 * @AfterMethod-----logout
	 * 
	 * @BeforeMethod---enter URL
	 * @Test case-3---Search test
	 * @AfterMethod----log out
	 * 
	 * @AfterClass---close the browser
	 * @AfterTest---Delete All cookies
	 * @AfterSuite--at work we don't need 
	 */
	
	@BeforeMethod//4
	public void enterURL() {
		
		System.out.println("@BeforeMethod----Enter URL");
	}
	
	
	// test case--starting with @Test annotation
	
	@Test//5
	public void googleTitleTest() {
		
		System.out.println("@Test Case 1---Google title test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("@Test Case 2----Search Test");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("@Test case 3---google logo test");
	}
	// post condition -- starts with @After
	
	@AfterMethod//6
	public void logout() {
		
		System.out.println("@AfterMethod---Log out from app");
		
		
	}
	
	@AfterClass//7
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	
	@AfterTest//8
	public void deleteAllCookies() {
		
		
		System.out.println("Delete All cookies");
	}
	
	
	
	@AfterSuite//9
	public void generateTestReport() {
		System.out.println("Generate Reports");
	}
	
	
	
}
