package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertions_demo {
	@Test(priority=1)
	void test1()
	{
		String word1="Java";
		String word2="testng";
		Assert.assertEquals(word1, word2);
	}
	@Test(priority=2)
	void test2()
	{
		Assert.assertEquals("Java", "Java");
	}
	

}
