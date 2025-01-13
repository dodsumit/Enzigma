package Enzigma;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicScript {

	public static void main(String[] args) throws InterruptedException {
		
		//Open the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//wait
		Thread.sleep(2000);
		//Navigate to the URL
		driver.get("https://app-staging.nokodr.com/super/apps/auth/v1/index.html#/login");
		
		//Close the browser
		driver.quit();
	}

}