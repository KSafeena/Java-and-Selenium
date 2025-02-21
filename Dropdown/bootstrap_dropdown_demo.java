package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrap_dropdown_demo {

	public static void main(String[] args) {
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		cd.manage().window().maximize();
		WebElement container=cd.findElement(By.xpath("//button[@class=\"multiselect dropdown-toggle btn btn-default\"]"));
		container.click();
		List<WebElement> dropdown=cd.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//label"));
		for (int i=0;i<dropdown.size();i++)
		{
			String option=dropdown.get(i).getText();
			if(option.equals("Java")|| option.equals("Python"))
{
				dropdown.get(i).click();
}
			
		}
		
		

	}

}
