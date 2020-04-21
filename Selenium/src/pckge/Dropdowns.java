package pckge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdowns {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hem\\Desktop\\SELENIUM\\Selenium Again\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000L);
		
		
//code for checking a checkbox and counting the number of checkboxes present in a particular page;
		
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected()); 
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();	
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
// code for dynamic dropdowns because arrival city options are not visible until the departure city is selected.
		
		driver.findElement(By.xpath("//input[@value='Departure City']")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();             
		driver.findElement(By.xpath("(//a[@value='ATQ'])")).click();
		driver.findElement(By.cssSelector(".ui-state-default ui-state-highlight ui-state-active")).click();
		
		//driver.findElement(By.linkText("26")).click();
		
		
		
		/* driver.findElement(By.id("divpaxinfo")).click();
		Select s= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("4");
		Select i= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		i.selectByIndex(1);
		Select j= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		j.selectByValue("AED");
		*/
		
	}

}
