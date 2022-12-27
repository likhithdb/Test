package scenarios;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Flipkart
{
@Test
public void tester()
{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("iphone14");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String title=driver.getTitle(); System.out.println(title);
		driver.findElement(By.xpath("(div[.='APPLE iPhone 14 (Midnight, 128 GB)'])[1]")).click();
		Set<String> wins = driver.getWindowHandles();
		for(String win:wins)
		{
		driver.switchTo().window(win);
		}
			WebElement price =driver.findElement(By.xpath("div//['77,490'])[1]"));
			String text=price.getText();
			System.out.println(text);
			driver.quit();
	}
	@Test 
	public void tester2()
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[.='x']")).click();
		
		driver.findElement(By.name("q")).sendKeys("iphone13");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String title=driver.getTitle(); System.out.println(title);
		driver.findElement(By.xpath("(div[.='APPLE iphone 14 (Blue, 128 GB)'])[1]")).click();
		Set<String> wins = driver.getWindowHandles(); 		for(String win:wins)
		{
			driver.switchTo().window(win);
			
		}
		WebElement price=driver.findElement(By.xpath("(//div[.='62,999'])[1]"));
		String text=price.getText(); System.out.println(text);
		driver.quit();
		 
		
	}

}
