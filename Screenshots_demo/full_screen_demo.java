package Screenshots_demo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class full_screen_demo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.opencart.com/");
		cd.manage().window().maximize();
		TakesScreenshot ts=cd;
		Thread.sleep(2000);
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\REDMI\\Documents\\Effigo Intern\\fullscreen.png");
		source.renameTo(target);
		//2.Capturing the particular area
		WebElement ss=cd.findElement(By.xpath("//div[@class=\"page-header\"]/../div[2]"));
		File source1=ss.getScreenshotAs(OutputType.FILE);
		File target1=new File("C:\\Users\\REDMI\\Documents\\Effigo Intern\\specific_area.png");
		source1.renameTo(target1);
		//3.Capturing the Specific element
		WebElement image=cd.findElement(By.xpath("//img[@title=\"OpenCart - Open Source Shopping Cart Solution\"]"));
		File source2=image.getScreenshotAs(OutputType.FILE);
		File target2=new File("C:\\Users\\REDMI\\Documents\\Effigo Intern\\specific_element.png");
		source2.renameTo(target2);

	}

}
