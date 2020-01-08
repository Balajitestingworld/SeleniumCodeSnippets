package testNG;

import org.testng.annotations.*;

public class GroupsTest {

	@BeforeClass
	public void setUp() {
		System.out.println("Before Classt");
	}

	@Test(groups = { "fast" })
	public void aFastTest() {
		System.out.println("Fast test");
	}

	@Test(groups = { "slow" })
	public void aSlowTest() {
		System.out.println("Slow test");
	}
	
	@Test(groups = { "slow" })
	public void aSlowTest1() {
		System.out.println("Slow test1");
	}
	
	@Test(groups = { "slow" , "fast"})
	public void mediumFast() {
		System.out.println("medium Fast");
	}
}
