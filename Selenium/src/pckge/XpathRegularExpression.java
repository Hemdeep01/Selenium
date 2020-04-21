package pckge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathRegularExpression {
	
	public static void main(String[]args)
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hem\\Desktop\\SELENIUM\\Selenium Again\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[contains(@name,'ema')]")).sendKeys("hemdeepk.ransi@gmail.com");
	driver.findElement(By.xpath("//input[contains(@type,'passw')]")).sendKeys("hemupreed");
	}
}
