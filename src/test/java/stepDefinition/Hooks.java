package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	WebDriver driver;
	
    @Before
    public void open_the_chrome_browser() {
    	System.setProperty("webdriver.chrome.driver", "D:/Eclipse_Workspace/Selenium/WebDrivers/chromedriver.exe");
    	driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
    }

    @After
    public void close_the_chrome_broswer() throws InterruptedException {
//    	WebDriver driver_close = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.close();
    }
    
}