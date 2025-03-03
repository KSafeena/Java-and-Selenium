package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/*
  1.open the app
  2.check the logo
  3.login
  4.close app
  */
public class orangehrm {
	ChromeDriver cd;
	WebDriverWait wait;
	@Test(priority=1)
	void openapp()
	{
		wait=new WebDriverWait(cd, Duration.ofSeconds(50));
		cd=new ChromeDriver();
		cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		cd.manage().window().maximize();
	}
	@Test(priority=2)
	void check_logo()
	{
		wait=new WebDriverWait(cd, Duration.ofSeconds(50));
		WebElement logo=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='company-branding']")));
		boolean status=logo.isDisplayed();
		System.out.println("The logo status:"+status);
		
	}
	@Test(priority=3)
	void login()
	{
		wait=new WebDriverWait(cd, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']"))).sendKeys("Admin");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']"))).sendKeys("admin123");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button"))).click();
	}
	@Test(priority=4)
	void logout()
	{
		cd.close();
	}

}
