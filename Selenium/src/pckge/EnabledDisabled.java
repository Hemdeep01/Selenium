package pckge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnabledDisabled {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hem\\Desktop\\SELENIUM\\Selenium Again\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000L);

		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		//Thread.sleep(2000L);

	/*	System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		*/

	if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("is enabled");
		}
	else
	{
		System.out.println("is disabled");
	}
	
	//System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
	}

}
