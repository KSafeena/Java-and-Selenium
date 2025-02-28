package JavaScript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoomin_Zoomout {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.opencart.com");
		cd.manage().window().maximize();
		JavascriptExecutor jse=cd;
		Thread.sleep(2000);
		jse.executeScript("document.body.style.zoom='50%'");
		Thread.sleep(2000);
		jse.executeScript("document.body.style.zoom='80%'");
	}

}
