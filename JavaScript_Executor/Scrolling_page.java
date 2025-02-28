package JavaScript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_page {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.opencart.com/");
		cd.manage().window().maximize();
		JavascriptExecutor js=cd;
		//Scrolling by pixel size.
/*js.executeScript("window.scrollBy(0,1500)","");
System.out.println(js.executeScript("return window.pageYOffset;"));
*/
	//Scrolling till the element is visible
/*WebElement ele=cd.findElement(By.xpath("//a[text()=\"Visit All\"]"));
js.executeScript("arguments[0].scrollIntoView();",ele );
*/
//Scroll the page until the end of the page
		Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)","" );
	System.out.println(js.executeScript("return window.pageYOffset;"));
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-document.body.scrollHeight)","" );
	System.out.println(js.executeScript("return window.pageYOffset;"));
	}

}
