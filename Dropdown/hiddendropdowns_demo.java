package Dropdown;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

public class hiddendropdowns_demo {

    public static void main(String[] args) throws InterruptedException {
        // Initialize ChromeDriver
        ChromeDriver cd = new ChromeDriver();
        cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        cd.manage().window().maximize();

        // Create WebDriverWait instance
        WebDriverWait wait = new WebDriverWait(cd, Duration.ofSeconds(10));

        // Wait for username field and enter credentials
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        element.sendKeys("Admin");
        cd.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        cd.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();

        // Wait for and click on "My Info" tab
        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("My Info")));
        element1.click();

        // Wait for the dropdown element and click to open it
        WebElement nationalityDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Nationality')]/following::div[1]")));
        nationalityDropdown.click(); // Open the dropdown

        // Use Arrow Down keys to select "American"
        for (int i = 0; i < 3; i++) {  // Adjust the number of downs based on option position
            nationalityDropdown.sendKeys(Keys.DOWN);
            Thread.sleep(500); // Small delay for visibility
        }

        // Press ENTER to select the highlighted option
        nationalityDropdown.sendKeys(Keys.RETURN);

        // Close the browser (optional)
        cd.quit();
    }
}
