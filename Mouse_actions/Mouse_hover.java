package Mouse_actions;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.time.temporal.ChronoField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mouse_hover {

	public static void main(String[] args) {
		ChromeDriver cd=new ChromeDriver();
		Actions act=new Actions(cd);
		cd.get("https://demo.opencart.com/");
		cd.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(cd, Duration.ofSeconds(50));
		WebElement desktop=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='nav navbar-nav']//a[text()='Desktops']")));
		act.moveToElement(desktop).build().perform();
		WebElement mac=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='list-unstyled']//a[text()='Mac (1)']")));
		act.moveToElement(mac).click().build().perform();
	}

}
