package com.Selenium.com.Selenium.TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	private   WebDriver driver;
	
	
	
	public Browser(){
		 System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Selenium FrameWork\\Gecko\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		this.driver=new FirefoxDriver();	}
	
	
	public WebDriver getWebDriver(){
		
		return driver;
	}
    public void  setWebDriver(WebDriver driver){
		
		  this.driver=driver;
		  
	}
    
    
    
	
	
	

}
