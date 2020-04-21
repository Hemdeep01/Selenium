package pckge;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdowns {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hem\\Desktop\\SELENIUM\\Selenium Again\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		Thread.sleep(2000L);
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(8000L);
		//driver.findElement(By.id("fromCity")).sendKeys("mum");

	//driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open")).sendKeys("mum");
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("mum");
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000L);

		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("amr");
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ENTER);

		
	
		

		
	}
}
