package NaveenTestNGClass;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	// If i want execute same test case 10 time, i don;t need to do write 10 time same test case for that we have to use invocationCount method
	
	@Test(invocationCount=10)// run 10 time same test case
	public void sum() {
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println("Sum is =="+c);
		
	}
	
	

}
