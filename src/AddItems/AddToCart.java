package AddItems;

import java.awt.List;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shruthi\\Work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		

  java.util.List<WebElement> names=driver.findElements(By.cssSelector("h4.product-name"));
  
   for(int i=0;i<names.size();i++)
   {  
	 
	String prod_names= names.get(i).getText();
	
	if(prod_names.contains("Cucumber"))
		
	{
	      driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();	
	       break;
	
	}  
    }







    }
}