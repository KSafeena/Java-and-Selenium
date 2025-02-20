package flipcart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart_automation {

	public static void main(String[] args) {
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.flipkart.com/");
		
		cd.findElement(By.className("_27h2j1")).click();
		/*
		 * Group of elements based on tags
		 */
		List<WebElement> images=cd.findElements(By.tagName("img"));
		System.out.println(images.size());

	}

}
