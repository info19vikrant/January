package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cls {
 static WebDriver driver;
	public static void main(String args[])
	{
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("u_0_1")).sendKeys("akash");
		driver.findElement(By.id("u_0_3")).sendKeys("malik");
		driver.findElement(By.id("u_0_6")).sendKeys("8002569775");
		driver.findElement(By.id("u_0_9")).sendKeys("8002569775");
		driver.findElement(By.id("u_0_b")).sendKeys("passwordisthis");
		driver.findElement(By.id("day")).sendKeys("27");
		driver.findElement(By.id("month")).sendKeys("jan");
		driver.findElement(By.id("year")).sendKeys("1993");
		driver.findElement(By.id("u_0_j")).click();
		driver.findElement(By.id("u_0_f")).click();
		//driver.quit();
		//driver.close();
	}
}
