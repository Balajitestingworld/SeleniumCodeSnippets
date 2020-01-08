package testNG;

import org.testng.annotations.Test;

public class ParallelTest {

	@Test
	public void test1() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName() + " - " + Thread.currentThread().getId());
	}

	@Test
	public void test2() throws InterruptedException {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName()+ " - " + Thread.currentThread().getId());
		Thread.sleep(2000);
	}
	
	@Test
	public void test3() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName()+ " - " + Thread.currentThread().getId());
	}
}
