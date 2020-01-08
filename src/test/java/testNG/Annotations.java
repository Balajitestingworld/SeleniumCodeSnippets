package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
	}

	@Test
	public void test1() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
	}

	@Test
	public void test2() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
	}

	@AfterTest
	public void afterTest() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
	}

	@BeforeGroups
	public void beforeGroups() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
	}

	@AfterGroups
	public void afterGroups() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
	}

	@AfterClass
	public void afterClass() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
	}

//	@DataProvider - name, parallel
//	@Factory

//	@Listeners

//	@Parameters

//	alwaysRun
//	dependsOnGroups
//	dependsOnMethods
//	enabled
//	groups
//	inheritGroups
//	onlyForGroups

}
