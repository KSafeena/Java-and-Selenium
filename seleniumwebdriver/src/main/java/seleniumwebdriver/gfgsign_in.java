package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gfgsign_in {

	public static void main(String[] args) {
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.geeksforgeeks.org/");
		cd.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(cd, Duration.ofSeconds(50));
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Sign In']")));
		element.click();
		WebElement element1=cd.findElement(By.xpath("//*[@class=\"mb15 next_input \"]"));
		element1.sendKeys("ksafeena04@gmail.com");
		WebElement element2=cd.findElement(By.xpath("//*[@class=\'next_input \']"));
		element2.sendKeys("123456");
		
		

	}

}
