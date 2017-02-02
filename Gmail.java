package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	static WebDriver driver;

	public static void main(String args[]) throws InterruptedException {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://accounts.google.com");
		driver.findElement(By.name("Email")).sendKeys("info19vikrant");
		driver.findElement(By.name("signIn")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("Passwd")).sendKeys("800");
		driver.findElement(By.name("signIn")).click();
		// driver.quit();
		//driver.close();
	}
}
