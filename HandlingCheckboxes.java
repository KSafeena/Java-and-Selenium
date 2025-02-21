package seleniumwebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingCheckboxes {

	public static void main(String[] args) {
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://testautomationpractice.blogspot.com/");
		cd.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(cd, Duration.ofSeconds(10));
		//selecting the specific element in the checkbox
//		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='sunday']")));
//		element.click();
		//selecting all the elements in the checkbox
		List<WebElement> checkbox=cd.findElements(By.xpath("//input[@class=\'form-check-input\' and @type=\'checkbox\']"));
		for(int i=0;i<checkbox.size();i++)
		{
			if(checkbox.get(i).isSelected())
			{
			checkbox.get(i).click();
			}
		}
	}

}
