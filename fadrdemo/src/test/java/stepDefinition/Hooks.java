package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
 
public class Hooks {
 
    @Before
    public void open_the_chrome_browser() {
    	System.out.println("------------BEFORE-------------");
    }

    @After
    public void close_the_chrome_broswer() {
    	System.out.println("----------AFTER----------------");
    }
}