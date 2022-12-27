package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FacebookTest
{
	
@Test
public void test()

{
	
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	String title=driver.getTitle();
	SoftAssert s=new SoftAssert();
	s.assertEquals(title, "Facebook - log in or sign up");
	driver.findElement(By.id("email")).sendKeys("MRL");
	s.assertAll();
	
}
}
