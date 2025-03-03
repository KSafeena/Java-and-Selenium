package TestNG_Grouping_demo;

import org.testng.annotations.Test;

public class payment_methods {
	@Test(priority=1,groups = {"Regression","Sanity"})
	void pay_by_rupee()
	{
		
	}
	@Test(priority=2,groups = {"Regression","Sanity"})
	void pay_by_dollar()
	{
		
	}

}
