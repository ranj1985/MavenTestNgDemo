package TestNg;

import org.testng.SkipException;
import org.testng.annotations.Test;

import CommonFolder.BeforeMethod2;

@Test(groups="userRegistration")
public class TestNgSkipTest extends BeforeMethod2{
	
	boolean database=false;
	
	@Test(enabled=false) // this test case will skip for the run
	
	public void testCase1() {
		System.out.println("Test Case One");
		
		
	}
	@Test // this will be run
	public void testCase2() {
		System.out.println("Test case Two");
	}

	@Test
	public void testCase3() { 
	if(database) {
		System.out.println("Running the testcase ");
	}
	else {
		System.out.println("skiping the testcase as db Connection is failed");
		throw new SkipException("Skipping the TestCase");
	}
	
	}
}
