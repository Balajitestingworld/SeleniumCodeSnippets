package testNG;

import org.testng.annotations.Test;

public class PriorityTest{
	
	@Test (testName = "Login with Valid Credentials")
	public void test3() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
	}

//	Enabled 
	@Test (groups = { "fast" })
	public void test4() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
	}	

	@Test 
	public void test5() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
//		Thread.sleep(2000);
	}	
}
