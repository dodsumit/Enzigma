package Enzigma;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signUpValidationValidInputs {

	// for valid input
	public static void main(String[] args) throws InterruptedException {
		// Open the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Navigate to the URL
		driver.get("https://app-staging.nokodr.com/super/apps/auth/v1/index.html#/login");

		// Click on Sign up
		WebElement sign_up = driver.findElement(By.xpath("//a[text()='Sign up']"));
		sign_up.click();

		// Write email in Email text field
		WebElement email = driver.findElement(By.xpath("(//input[@name='username'])[2]"));
		email.sendKeys("dod.sumit1@gmail.com");

		// Select check box
		WebElement checkbox = driver.findElement(By.xpath("//span[@class='slds-checkbox_faux']"));
		checkbox.click();
		Thread.sleep(2000);
		// Click on Proceed button
		WebElement proceed = driver.findElement(By.xpath("//div[text()='Proceed']"));
		proceed.click();
		Thread.sleep(5000);

		String error = "User already exists";
		String verifyCodeSent = "Verification code sent successfully";

		WebElement message = driver.findElement(
				By.xpath("//div[@class='slds-notify slds-notify_toast slds-p-around_small slds-theme_error']"));
		String txt = message.getText();

		Thread.sleep(5000);
		if (txt.contains(error)) {
			System.out.println("user is already exist");
		} else if (txt.contains(verifyCodeSent)) {
			System.out.println("Verification code sent successfully'");

			driver.findElement(By.xpath("//input[@placeholder='Enter Code']"));
			System.out.println("Enter the OTP manually on the web page");

			// Pause the script for manual OTP entry
			System.out.println("After entered the OTP, press Enter here to continue...");
			Scanner scanner = new Scanner(System.in); // Wait for user input
			scanner.nextLine(); // Script will pause until Enter is pressed

			// Click on Verify Code button
			WebElement verifyCode = driver.findElement(By.xpath("//div[text()='Verify Code']"));
			verifyCode.click();

			Thread.sleep(5000);

			// Enter first name into the text field
			WebElement first_Name = driver.findElement(By.xpath("//input[@name='firstName']"));
			first_Name.sendKeys("Sumitkumar");

			// Enter last name into the text field
			WebElement Last_Name = driver.findElement(By.xpath("//input[@name='lastName']"));
			Last_Name.sendKeys("Dod");

			// Enter Password into the text field
			WebElement password = driver.findElement(By.xpath("(//input[@name='password'])[2]"));
			password.sendKeys("SumitKumar1@noKodr");

			// Enter Confirm Password into the text field
			WebElement Confirm_password = driver.findElement(By.xpath("//input[@name='password-confirmpassword']"));
			Confirm_password.sendKeys("SumitKumar1@noKodr");

			// Click on Register button
			WebElement register = driver.findElement(By.xpath("//div[text()='Register']"));
			register.click();
			Thread.sleep(10000);

		}

	}

}