package pack;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableGmail {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new FirefoxDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		List<WebElement>tab = driver.findElements(By.tagName("img"));
		System.out.println(tab.size());
		

	}
}
