package WebDriverMethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowhandlesdemo {

	public static void main(String[] args) {
		ChromeDriver cd=new ChromeDriver();
		cd.get(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		cd.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(cd, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("OrangeHRM, Inc"))).click();
		
		Set<String> id=cd.getWindowHandles();
		System.out.println("The set of the windowhandles are:"+id);
		//getting the id of the single window
		ArrayList<String> list=new ArrayList<String>(id);
		System.out.println(list);
		String id1=list.get(0);
		System.out.println(id1);
		//Attempt 2
//		for(String x:list)
//		{
//			String title=cd.switchTo().window(x).getTitle();
//			System.out.println(title);
//		}
		for(String f:list)
		{
			String title1=cd.switchTo().window(f).getTitle();
			if(title1.equals("Human Resources Management Software | OrangeHRM"))
			{
				cd.close();
			}
		}

	}

}
