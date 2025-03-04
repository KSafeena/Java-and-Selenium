package TestNG_parallel_execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallel_execution {
	WebDriver driver;
	@Parameters({"browser"})
	@BeforeClass
	void setup(String br)
	{
		switch(br)
		{
		case "chrome":driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
		
		
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	}
	@Test(priority=1)
	void testlogo()
	{
		boolean Status=driver.findElement(By.xpath("//img[@alt=\"client brand banner\"]")).isDisplayed();
		Assert.assertEquals(Status, true);
	}
	@Test(priority=2)
	void testurl()
	{
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
	}
	@Test(priority=3)
	void testtitle()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
		
	}
	@Test(priority=4)
	void close()
	{
		driver.close();
	}
}
