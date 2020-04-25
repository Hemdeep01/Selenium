package pckge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FullFlowOfSpiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hem\\Desktop\\SELENIUM\\Selenium Again\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(4000L);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Thread.sleep(2000L);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='IXZ']")).click();
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(2000L);
	//	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		driver.findElement(By.linkText("29")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Select s= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("4");
		Select i= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		i.selectByIndex(1);
		Thread.sleep(2000L);
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		Select j= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		j.selectByIndex(2);
		

		
	}

}
