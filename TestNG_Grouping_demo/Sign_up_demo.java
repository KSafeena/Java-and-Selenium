package TestNG_Grouping_demo;

import org.testng.annotations.Test;

public class Sign_up_demo {
	@Test(priority=1,groups = {"Regression"})
	void signup_by_email()
	{
		
	}
	@Test(priority=2,groups = {"Regression"})
	void signup_by_facebook()
	{
		
	}
	@Test(priority=3,groups = {"Regression"})
	void signup_by_twitter()
	{
		
	}

}
