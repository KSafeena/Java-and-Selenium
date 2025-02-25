package Web_Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_table {

	public static void main(String[] args) {
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://testautomationpractice.blogspot.com/");
		cd.manage().window().maximize();
		WebElement element=cd.findElement(By.xpath("//table[@name=\"BookTable\"]"));
		int rows=cd.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
		System.out.println("The number of rows are:"+rows);
		int cols=cd.findElements(By.xpath("//table[@name='BookTable']//tr/th")).size();
		System.out.println("The number of columns are:"+cols);
		String Value=cd.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[4]/td")).getText();
		System.out.println(Value);
//		for(int r=2;r<rows;r++)
//		{
//			for(int c=1;c<cols;c++)
//			{
//				String table_values=cd.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
//				System.out.print(table_values+"		");
//				
//			}
//			System.out.println(); 
//		}
		for(int r=2;r<rows;r++)
		{
			
			String author_name=cd.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]/td[2]")).getText();
			if(author_name.equals("Mukesh"))
			{
				String book_name=cd.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]/td[1]")).getText();
				System.out.print(book_name+"  "+author_name);
		}
			System.out.println();

	}
	}

}
