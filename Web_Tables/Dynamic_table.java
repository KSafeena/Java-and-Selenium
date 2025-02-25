package Web_Tables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamic_table {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://demo.opencart.com/admin/index.php");
		cd.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(cd, Duration.ofSeconds(50));
		WebElement user_name=cd.findElement(By.xpath("//input[@placeholder='Username']"));
		user_name.clear();
		user_name.sendKeys("demo");
		WebElement password=cd.findElement(By.xpath("//input[@placeholder='Password']"));
		password.clear();
		password.sendKeys("demo");
		cd.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		WebElement click=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fas fa-user']")));
		click.click();
		WebElement click2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class=\"collapse show\"]//a")));
		click2.click();
		cd.findElement(By.xpath("//table[@class='table table-bordered table-hover']"));
		String str=cd.findElement(By.xpath("//div[contains(text(),'Showing')]")).getText();
		System.out.println(str.indexOf("("));
		System.out.println(str.indexOf("Pages"));
		String total_pages=str.substring(str.indexOf("(")+1,str.indexOf("Pages")-1);
		System.out.println(total_pages);
		int total=Integer.parseInt(total_pages);
		for(int p=1;p<=6;p++)
		{
			if(p>1)
			{
				Thread.sleep(2000);
				WebElement page=cd.findElement(By.xpath("//ul[@class='pagination']//li/*[text()="+p+"]"));
				page.click();
			}
			
		}
//		cd.findElement(By.xpath("//table[@class='table table-bordered table-hover']"));
//		int row_size=cd.findElements(By.xpath("//table[@class=\"table table-bordered table-hover\"]//tbody//tr")).size();
//		System.out.println("number of rows:"+row_size);
//		for(int r=1;r<row_size;r++)
//			
//		{
//			Thread.sleep(2000);
//			for(int col=1;col<row_size;col++)
//			{
//				
//				String data=cd.findElement(By.xpath("//form[@id='form-customer']//tbody//tr["+r+"]//td["+col+"]")).getText();
//				System.out.print(data+"   ");
//			}
//			System.out.println();
//		}

	}

}
