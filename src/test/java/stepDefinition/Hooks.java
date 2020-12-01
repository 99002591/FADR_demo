package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
 
public class Hooks {
	
    @Before
    public void open_the_chrome_browser() {
    	System.setProperty("webdriver.chrome.driver", "D:/Eclipse_Workspace/Selenium/WebDrivers/chromedriver.exe");
		WebDriver driver_open = new ChromeDriver();
		driver_open.get("https://www.google.co.in");
		driver_open.manage().window().maximize();
    }

    @After
    public void close_the_chrome_broswer() throws InterruptedException {
    	WebDriver driver_close = new ChromeDriver();
    	driver_close.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver_close.close();
    	driver_close.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}