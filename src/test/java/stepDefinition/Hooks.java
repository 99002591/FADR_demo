package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;

public class Hooks {
	
	public static WebDriver driver;
	
    @Before
    public void open_the_chrome_browser() {
    	System.setProperty("webdriver.chrome.driver", "D:/Eclipse_Workspace/Selenium/WebDrivers/chromedriver_87.exe");
    	driver = new ChromeDriver();
		driver.get("https://dev-portal.eastus.cloudapp.azure.com/#/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
    }

    @After
    public void close_the_chrome_broswer() throws InterruptedException {
    	Thread.sleep(3000);
    	driver.close();
    }
    
}