package forgotPassword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPasswordValidation {

	public static void main(String[] args) {

		// Open the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Navigate to the URL
		driver.get("https://app-staging.nokodr.com/super/apps/auth/v1/index.html#/login");
		
		//Click on Forgot Password text 
		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
		
		//Enter email into the text field
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).sendKeys("dod.sumit1@gmail.com");
		
		//Click on Proceed button
		driver.findElement(By.xpath("//div[text()='Proceed']")).click();

	}

}