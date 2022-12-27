package seleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scripts 
{
	public static void main(String[] args)
	{
		String key="Webdriver.gecko.driver";
		String value="./softwares/geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver fx = new FirefoxDriver();
		
	}

	

}


