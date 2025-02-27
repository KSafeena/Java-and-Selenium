package Mouse_actions;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Right_click {

	public static void main(String[] args) {
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		cd.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(cd, Duration.ofSeconds(50));
		WebElement right_click=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\"right click me\"]")));
		Actions act=new Actions(cd);
		act.contextClick(right_click).perform();
		WebElement element_click=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\"Cut\"]")));
        element_click.click();
        cd.switchTo().alert().accept();
        
	}

}
