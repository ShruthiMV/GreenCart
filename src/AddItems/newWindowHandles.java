package AddItems;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shruthi\\Work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//label[text()='CHARTS / VACANCY']")).click();
		System.out.println(driver.getTitle());
		  Set<String> win = driver.getWindowHandles();
		  java.util.Iterator<String> ids   =  win.iterator();
		   String parentId =ids.next();
		   String childId= ids.next();
		   driver.switchTo().window(childId);
		   System.out.println(driver.getTitle());

		
		
	}

}
