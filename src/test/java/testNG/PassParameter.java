package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassParameter {

	@Parameters({ "param" })
	@Test
	public void test(String param) {
		System.out.println(param + " - " + new Throwable().getStackTrace()[0].getMethodName());
	}
}
