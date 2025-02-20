package WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class conditions {

	public static void main(String[] args) {
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		cd.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(cd, Duration.ofSeconds(50));
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name=\'username\']")));
		element.sendKeys("Admin");
		WebElement element2=cd.findElement(By.xpath("//*[@name=\'password\']"));
		element2.sendKeys("admin123");
		cd.findElement(By.xpath("//button[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();

		//1.isDisplayed
//		WebElement element3=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")));
//		boolean status=element3.isDisplayed();
//		System.out.println("The status of the button is:"+status);
		//2.is selected
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("My Info"))).click();
		WebElement element3=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']")));
		boolean Check_male=element3.isSelected();
		System.out.println("The button Status of_male:"+Check_male);
		WebElement element4=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\'oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input\']")));
		boolean Check_female=element3.isSelected();
		System.out.println("The button Status of female:"+Check_female);
		WebElement element5=cd.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']"));
		boolean text_status=element5.isEnabled();
		System.out.println("The status of the text field is:"+text_status);
		
		
		
		
		
		
	}

}
