package NaveenTestNGClass;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	
//	@Test(timeOut=2000)// this will stop after given time done
//	public void infinitLoop() {
//		
//		int i=1;
//		while(i==1) {
//			System.out.println(i);
//		}
//		
//	}
	
//	@Test(invocationTimeOut=200,expectedExceptions=NumberFormatException.class)
//	public void infiLoop() {
//		
//		int a=1;
//		while(a==1) {
//			System.out.println(a);
//		}
//	}
	
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1() {
		
		String x="100A";
		Integer.parseInt(x);// we don't use in real work. Just for knowledge
		
	}

}
