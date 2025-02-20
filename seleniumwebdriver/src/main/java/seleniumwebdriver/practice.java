package seleniumwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.opencart.com/");
		String title=cd.getTitle();
		if (title.equals("OpenCart - Open Source Shopping Cart Solution"))
		{
			System.out.println("Test Passed");
		}
	
		else
		{
			System.out.println("Test Failed");
		}
		cd.close();
	}

}
