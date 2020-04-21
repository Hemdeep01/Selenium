package pckge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class CustomizedCSS {
	public static void main(String[]args)
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hem\\Desktop\\SELENIUM\\Selenium Again\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.cssSelector("input[id='email")).sendKeys("hemdeep@gmail.com");
	driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("hemdeep");
	driver.findElement(By.cssSelector("input[value='Log In']")).click();
}

}
