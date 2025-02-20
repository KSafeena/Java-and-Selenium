package WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class navigation {

	public static void main(String[] args) {
		ChromeDriver cd=new ChromeDriver();
		cd.get(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		cd.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(cd, Duration.ofSeconds(50));
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name=\'username\']")));
		element.sendKeys("Admin");
		WebElement element2=cd.findElement(By.xpath("//*[@name=\'password\']"));
		element2.sendKeys("admin123");	
		cd.findElement(By.xpath("//button[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
		cd.navigate().to("https://www.flipkart.com/");
		cd.navigate().back();
		cd.navigate().forward();
		cd.navigate().refresh();
		String url=cd.getCurrentUrl();
		System.out.println(url);
	}

}
