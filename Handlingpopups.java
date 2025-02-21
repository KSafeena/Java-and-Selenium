package seleniumwebdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingpopups {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		cd.manage().window().maximize();
		cd.findElement(By.xpath("//input[@id=\"alertexamples\"]")).click();
		Thread.sleep(500);
		Alert alert=cd.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		cd.findElement(By.xpath("//input[@id=\"confirmexample\"]")).click();
		Thread.sleep(500);
		cd.switchTo().alert().dismiss();
		cd.findElement(By.xpath("//input[@id=\"promptexample\"]")).click();
		Thread.sleep(500);
		Alert text=cd.switchTo().alert();
		text.sendKeys("Welcome");
		text.accept();	
		cd.close();
	}

}
