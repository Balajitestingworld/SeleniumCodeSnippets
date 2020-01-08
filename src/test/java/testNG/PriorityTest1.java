package testNG;

import org.testng.annotations.Test;

public class PriorityTest1 {

	@Test (groups = { "fast" , "slow"})
	public void test() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
	}
	
	@Test (timeOut = 2000)
	public void test1() throws InterruptedException {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		Thread.sleep(3000);
	}

	@Test 
	public void test2() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
	}
}
