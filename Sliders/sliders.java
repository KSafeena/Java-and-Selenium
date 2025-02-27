package Sliders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sliders {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://testautomationpractice.blogspot.com/");
		cd.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(cd, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"slider-range\"]")));
		WebElement min=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"]/../span[1]")));
		System.out.println(min.getLocation());
		Actions act=new Actions(cd);
		Thread.sleep(50);
		act.dragAndDropBy(min, 30, 0).perform();
		System.out.println("Updated Scale after increasong min scale"+min.getLocation());
		WebElement max=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"]/../span[2]")));
		System.out.println(max.getLocation());
		Thread.sleep(50);
		act.dragAndDropBy(max, 30, 0).perform();
		System.out.println("Updated Scale after incresing max scale:"+max.getLocation());
		

	}

}
