package Dropdown;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

public class hiddendropdowns_demo {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver cd=new ChromeDriver();
        
        cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        cd.manage().window().maximize();

        
        WebDriverWait wait = new WebDriverWait(cd, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        element.sendKeys("Admin");
        cd.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        cd.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("My Info")));
        element1.click();
        WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Nationality']/../../div[2]")));
       String before_click=element2.getText();
       System.out.println("Before click"+before_click);
        element2.click();
        Actions act = new Actions(cd);
        
        act.sendKeys(Keys.ENTER).perform();
 
        String after_click=element2.getText();
        System.out.println("After click:"+after_click);
       
        boolean flag=true;
        while(flag)
        {
        	System.out.println("Entereed while loop");
        	act.sendKeys(Keys.ARROW_DOWN).perform();
        	Thread.sleep(500);
        	element2 = cd.findElement(By.xpath("//*[text()='Nationality']/../../div[2]"));

        	String updated=element2.getText().trim();
        	System.out.println("updated:"+updated);
        	if(updated.equals("American"))
        	{
        		System.out.println("print");
        		act.sendKeys(Keys.ENTER).perform();
        		System.out.println("The selected element is"+element2.getText());
        		flag=false;
        		break;
        		
        	}
        	
        }
       
       

        }   

}
