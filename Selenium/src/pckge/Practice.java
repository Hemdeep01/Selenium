package pckge;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hem\\Desktop\\SELENIUM\\Selenium Again\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement FooterDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(FooterDriver.findElements(By.tagName("a")).size());
		WebElement partone = FooterDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(partone.findElements(By.tagName("a")).size());
		//Actions a= new Actions(partone);
		
		
		for (int i=0;i<partone.findElements(By.tagName("a")).size();i++)
		{	
			String OpenInNewTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			partone.findElements(By.tagName("a")).get(i).sendKeys(OpenInNewTab);

			//driver.navigate().back();
		//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		}
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it= ids.iterator();
		for(int i=0;i<ids.size();i++)
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			Thread.sleep(2000L);
		}
	
		

	}

}
