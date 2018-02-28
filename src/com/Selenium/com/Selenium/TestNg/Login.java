package com.Selenium.com.Selenium.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login extends Browser  {
	
	
public  WebDriver driver= getWebDriver();
 
	
  @Test(priority=1)
  public void f() {
	  
	  String naga = driver.findElement(By.id("site-title")).getText();
	 Reporter.log("executed");
	  Assert.assertEquals(naga, "A");
  }
  @Test(priority=0)
  public void g() {
	 
	  driver.findElement(By.xpath("//a")).click();
	 
  }
  @BeforeClass
  public void before() {
	  
	   driver.manage().window().maximize();
		 driver.get("http://www.toolsqa.com");
	  driver.findElement(By.xpath("//a")).click();
	  
	  
  }

  @AfterClass
  public void after() throws InterruptedException {
	  Thread.sleep(20000);
	  driver.close();
	  driver.quit();
  }

}
