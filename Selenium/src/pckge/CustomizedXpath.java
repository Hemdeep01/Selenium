package pckge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedXpath {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hem\\Desktop\\SELENIUM\\Selenium Again\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Forgot account?")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hemdeep@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("hemdeep");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		//driver.close();
		
	}

}
