package pckge;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class EcomAgain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hem\\Desktop\\SELENIUM\\Selenium Again\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//Thread.sleep(3000L);
	List<WebElement> products=	driver.findElements(By.cssSelector(".product-name"));
	String[] names= {"Cucumber - 1 Kg","Beetroot - 1 Kg"};
	List Items=Arrays.asList(names);
	
	
	
	/*for(int i=0;i<products.size();i++)
	{
		String name= products.get(i).getText();
		if(name.contains("Cucumber"))
		{
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			break;
		}
	}
	*/
	
	

	
	for(int i=0;i<products.size();i++)
	{
		String name= products.get(i).getText();
		//System.out.println(name);
		if(Items.contains(name))
		{
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			
		}
		
	}
	WebDriverWait w= new WebDriverWait(driver, 5);

	driver.findElement(By.className("cart-icon")).click();
	driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
//	Thread.sleep(2000L);
	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));

	driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
	driver.findElement(By.cssSelector("button.promoBtn")).click();
	
	//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
	driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	//Select s= new Select(driver.findElement(by.))
	

	}

}
