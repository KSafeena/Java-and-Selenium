package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencies_demo {
	@Test(priority=1)
	void open_app()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=2,dependsOnMethods = "open_app")
	void login()
	{
		Assert.assertTrue(false);
	}
	@Test(priority=3,dependsOnMethods = "login")
	void Search()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=4,dependsOnMethods = "login")
	void logout()
	{
		Assert.assertTrue(true);
	}

}
