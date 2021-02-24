package AddItems;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shruthi\\Work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://krninformatix.com/");
		driver.manage().window().maximize();
		
		WebElement w=driver.findElement(By.xpath("//span[text()='Courses Offered']"));
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		act.moveToElement(w).perform();
		Thread.sleep(2000);
		
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Software Testing']"))).perform();
		Thread.sleep(2000);
	    //driver.findElement(By.xpath("//a[text()='Cucumber Testing']")).click();
		act.sendKeys(Keys.ARROW_DOWN).perform();
	    Thread.sleep(2000);
	}

}
