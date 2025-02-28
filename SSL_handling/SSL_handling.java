package SSL_handling;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSL_handling {

	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		co.setAcceptInsecureCerts(true);
		ChromeDriver cd=new ChromeDriver(co);
		cd.get("https://expired.badssl.com/");
	
		cd.manage().window().maximize();
		System.out.println(cd.getTitle());
		

	}

}
