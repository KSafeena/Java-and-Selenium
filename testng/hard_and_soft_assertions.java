package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hard_and_soft_assertions {
	@Test(priority=1)
	void hard_assert()
	{
		System.out.println("Statement1......");
	  Assert.assertEquals(56, 6);
	  System.out.println("Statement2......");
	}
	@Test(priority=2)
	void soft_assert()
	{
		System.out.println("-------------------------------------");
		System.out.println("Statement1...");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(123, 12);
		System.out.println("Statement2...");
		sa.assertAll();
	}

}
