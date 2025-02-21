package Dropdown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {

	public static void main(String[] args) {
		ChromeDriver cd=new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://testautomationpractice.blogspot.com/");
		WebDriverWait wait=new WebDriverWait(cd, Duration.ofSeconds(10));
		WebElement dropcountry=cd.findElement(By.xpath("//select[@class='form-control' and @id='country']"));
		Select drp=new Select(dropcountry);
		drp.selectByVisibleText("Canada");
		//drp.selectByIndex(1);
	    List<WebElement> dropdown=drp.getOptions();
	   for(int i=0;i<dropdown.size();i++)
	   {
		   System.out.println(dropdown.get(i).getText());
	   }
		
	}

}
