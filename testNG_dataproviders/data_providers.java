package testNG_dataproviders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import JavaScript_Executor.Click_and_sendkeys;

public class data_providers {
	WebDriverWait wait;
	ChromeDriver cd;
	@BeforeClass
	void setup()
	{
		cd=new ChromeDriver();
		wait=new WebDriverWait(cd, Duration.ofSeconds(50));
		cd.manage().window().maximize();
		
	}
	@Test(dataProvider = "dp")
	void login(String email,String psw)
	{
		cd.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"email\"]"))).sendKeys(email);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']"))).sendKeys(psw);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value=\"Login\"]"))).click();
		Assert.assertTrue(false);
	}
	@DataProvider(name="dp")
	Object[][] dataprovider()
	{
		Object data[][]= {
				{"abc@gmail.com","abc"},
				{"pqr@gmail.com","pqr"},
				{"xyz@gmail.com","xyz"},
				{"opp@gmail.com","opp"}
		};
		return data;
	}
	@AfterClass
	void close() throws InterruptedException
	{
		Thread.sleep(2000);
		cd.close();
	}

}
