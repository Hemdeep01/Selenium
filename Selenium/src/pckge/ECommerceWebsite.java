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




public class ECommerceWebsite {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hem\\Desktop\\SELENIUM\\Selenium Again\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		String[] Things= {"Cucumber","Tomato","Beans"};
		
		//convert array into arraylist for easy search 
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		
		List Items= Arrays.asList(Things);
		
		for(int i=0; i<products.size();i++)
		{
			
			String name= products.get(i).getText();
			if(Items.contains(name))
			{
				driver.findElement(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}
		
		
	}

}
