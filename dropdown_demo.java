package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropdown_demo {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver cd=new ChromeDriver();
        
        cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        cd.manage().window().maximize();

        
        WebDriverWait wait = new WebDriverWait(cd, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        element.sendKeys("Admin");
        cd.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        cd.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("PIM"))).click();
        WebElement Job_title_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()=\"Job Title\"]/../../div[2]//div[1]//div[1]//div[1]")));
        String Before_click=Job_title_field.getText();
        System.out.println("Before clicking:"+Before_click);
        Thread.sleep(2000);
        Job_title_field.click();
        String afer_click=Job_title_field.getText();
        System.out.println("After clicking:"+afer_click);
        Actions act=new Actions(cd);
        String Value="Database Administrator";
        while(true)
        {
        	act.sendKeys(Keys.ARROW_DOWN).perform();
        	Thread.sleep(2000);
 
        	String updated=Job_title_field.getText();
        	System.out.println("Printing Updated value:"+updated);
        	if(updated.contains(Value) && updated!=null && !updated.isEmpty())
        	{
        		act.sendKeys(Keys.ENTER).perform();
        		System.out.println("The Value Selected is"+updated);
        		break;
        	}
        	
        	
        }
        
	}
}
