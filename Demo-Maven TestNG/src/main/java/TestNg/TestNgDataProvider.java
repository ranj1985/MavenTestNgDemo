package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonFolder.BeforeMethod2;

public class TestNgDataProvider extends BeforeMethod2 {
	
	
	@DataProvider(name="loginCredentials")
	public Object[][] dataset(){
		
		//Program 1
		Object[][] dataset=new Object[4][2];
		
		dataset[0][0]="user1";
		dataset[0][1]="pwd1";
		
		dataset[1][0]="user1";
		dataset[1][1]="pwd1";
		
		dataset[2][0]="user1";
		dataset[2][1]="pwd1";
		
		dataset[3][0]="user1";
		dataset[3][1]="pwd1";
		
				
		return dataset;
		
	}

	//Program2
	@DataProvider(name = "data")
	public Object[][] dataset2(){
		return new Object[][] {
			{"user1","pwd1"},
			{"user2","pwd2"},
			{"user3","pwd3"},
			{"user4","pwd4"}
			
		} ;
		
	}
	//Program 3
	@Test(dataProvider ="loginCredentials") 
	// Instead method name , we can pass value of name attribute in dataProviders
	public void Login(String username , String password) {
		System.out.println(username + password);
	}
	
}
