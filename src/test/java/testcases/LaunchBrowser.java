package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	WebDriver driver;
	@Test
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh-n\\eclipse-workspace\\UcastWebAutomation\\Drivers\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("--headless");
		driver=new ChromeDriver(chromeOptions);
		driver.get("https://www.google.com");
		System.out.println("Browser launched successfully");
		
		
	}

}
