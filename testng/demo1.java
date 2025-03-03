package testng;

import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;


public class demo1 {
	@Test(priority=1)
	void openapp()
	{
		System.out.println("Opening app.....");
	}
	@Test(priority=2)
	void login()
	{
		System.out.println("Logging in....");
	}
	@Test(priority=3)
	void logout()
	{
		System.out.println("Logging out.....");
	}

}
