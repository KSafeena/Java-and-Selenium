package JavaScript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_files {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		//uploading single file
//		cd.manage().window().maximize();
//		cd.findElement(By.xpath("//input[@name=\"filesToUpload\"]")).sendKeys("C:\\Users\\REDMI\\Documents\\Effigo Intern\\text1.txt");

		//Uploading multiple files
		String file1="C:\\Users\\REDMI\\Documents\\Effigo Intern\\text1.txt";
		Thread.sleep(2000);
		String file2="C:\\Users\\REDMI\\Documents\\Effigo Intern\\text2.txt";
		cd.findElement(By.xpath("//input[@name=\"filesToUpload\"]")).sendKeys(file1+"\n"+file2);
		

	}

}
