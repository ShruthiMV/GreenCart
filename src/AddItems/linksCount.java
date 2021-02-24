package AddItems;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class linksCount {

	public static void main(String[] args) throws InterruptedException {
	     
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shruthi\\Work\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	System.out.println(driver.findElements(By.tagName("a")).size());
	Thread.sleep(4000);
	WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
	System.out.println(footerdriver.findElements(By.tagName("a")).size());
	
	WebElement coulumndriver=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println(coulumndriver.findElements(By.tagName("a")).size());
	
	for(int i=1;i<coulumndriver.findElements(By.tagName("a")).size();i++)
		
	{
	
	String clickontab=Keys.chord(Keys.CONTROL,Keys.ENTER);
	
	coulumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickontab);
	
	}
	
	     Set<String> abc=driver.getWindowHandles();
	        java.util.Iterator<String> it  = abc.iterator();
	
	        while(it.hasNext())
	        	
	        {
	        
	        driver.switchTo().window(it.next());
	        System.out.println(driver.getTitle());
	        
	        
	        }
	
	
	
	
	
	
	
	
		
		
		
		
		
		

	}

}
