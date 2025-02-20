package orangehrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login_automation
{
	public static void main(String[] args)
	{
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait wait=new WebDriverWait(cd, Duration.ofSeconds(50));
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		element.sendKeys("Admin");
		WebElement element1=cd.findElement(By.cssSelector("input[name='password']"));
		element1.sendKeys("admin123");
		WebElement element2=cd.findElement(By.cssSelector(".oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button"));
		element2.click();
		
		
	}
}