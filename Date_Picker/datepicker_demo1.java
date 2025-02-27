package Date_Picker;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class datepicker_demo1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver cd=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(cd, Duration.ofSeconds(500));
		cd.get("https://jqueryui.com/datepicker/");
		cd.manage().window().maximize();
		cd.switchTo().frame(0);
		WebElement field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='hasDatepicker']")));
		field.click();
		String month="April";
		String Year="2026";
		while(true)
		{
			WebElement month_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ui-datepicker-month']")));
			WebElement year_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"ui-datepicker-year\"]")));
			if(month.equals(month_field.getText()) && Year.equals(year_field.getText()))
			{
				break;
			}
			WebElement forward=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")));
			forward.click();
		}
		//Date Selection
		String date="20";
		
		WebElement date_table=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class=\"ui-datepicker-calendar\"]")));
		List<WebElement> date_field=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr//td")));
        System.out.println(date_field.size());
        for(int i=0;i<=date_field.size();i++)
        {
        	String Current_date=date_field.get(i).getText();
        	if(Current_date.equals(date))
        	{
        		date_field.get(i).click();
        	}
        }
	}

}
