package Mouse_actions;

import java.time.Duration;
import java.time.temporal.ChronoField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class double_click {

	public static void main(String[] args) {
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://testautomationpractice.blogspot.com/");
		cd.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(cd, Duration.ofSeconds(50));
		WebElement field1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='field1']")));
		field1.clear();
		field1.sendKeys("Selenium");
		WebElement field2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='field2']")));
		WebElement button=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Copy Text']")));
		Actions act=new Actions(cd);
		act.doubleClick(button).build().perform();
		
	}

}
