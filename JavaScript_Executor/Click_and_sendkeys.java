package JavaScript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Argument;

public class Click_and_sendkeys {

	public static void main(String[] args) {
		ChromeDriver cd =new ChromeDriver();
		cd.get("https://testautomationpractice.blogspot.com/");
		cd.manage().window().maximize();
		WebElement name=cd.findElement(By.xpath("//input[@id=\"name\"]"));
		JavascriptExecutor js=cd;
		js.executeScript("arguments[0].setAttribute('value','John')",name);
		WebElement button=cd.findElement(By.xpath("//input[@id=\"male\"]"));
		js.executeScript("arguments[0].click()", button);
	}

}
