package testng;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class annotations_demo {
	@BeforeSuite
	void before_suit()
	{
		System.out.println("Before suite");
	}
	@AfterSuite
	void after_suit()
	{
		System.out.println("After suite");
	}
	@BeforeClass
	void before_class()
	{
		System.out.println("Before class");
	}
	@AfterClass
	void after_class()
	{
		System.out.println("After class");
	}
	@BeforeTest
	void before_test()
	{
		System.out.println("Before test");
	}
	@AfterTest
	void after_test()
	{
		System.out.println("After test");
	}
	@BeforeMethod
	void before_method()
	{
		System.out.println("Before method");
	}
	@AfterMethod
	void after_method()
	{
		System.out.println("After method");
	}
	@Test(priority=1)
	void test1()
	{
		System.out.println("Test1");
	}
	@Test(priority=2)
	void test2()
	{
		System.out.println("Test2");
	}
}
