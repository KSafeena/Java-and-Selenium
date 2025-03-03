package TestNG_Grouping_demo;

import org.testng.annotations.Test;

public class login_demo {
	@Test(priority=1,groups = {"Sanity"})
	void loginbyemail()
	{
		
	}
	@Test(priority=2,groups = {"Sanity"})
	void loginbyfacebook()
	{
		
	}
	@Test(priority=3,groups = {"Sanity"})
	void loginbytwitter()
	{
		
	}

}
