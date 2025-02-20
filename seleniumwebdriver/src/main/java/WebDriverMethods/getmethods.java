package WebDriverMethods;
import java.time.Duration;
import java.util.HashSet;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class getmethods {
	public static void main(String[] args) {
		ChromeDriver cd=new ChromeDriver();
		//1. get(URL)
		cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		cd.manage().window().maximize();
		//2. getTitle()
		System.out.println(cd.getTitle());
		WebDriverWait wait=new WebDriverWait(cd, Duration.ofSeconds(50));
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name=\'username\']")));
		element.sendKeys("Admin");
		WebElement element2=cd.findElement(By.xpath("//*[@name=\'password\']"));
		element2.sendKeys("admin123");
		cd.findElement(By.linkText("OrangeHRM, Inc")).click();
		//3. getcurrenturl()
		System.out.println(cd.getCurrentUrl());
		//4.getsourcepage()
		System.out.println(cd.getPageSource());
		Set<String> hs=cd.getWindowHandles();
		System.out.println(hs);
	}
}
