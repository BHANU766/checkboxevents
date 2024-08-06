package com.chechboxevents;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class selectsinglecheckbox {
	
	   protected static String url="https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php";
	   WebDriver driver;
 
  @BeforeSuite 
    public void startchromebrowser() {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
  }	
    
  @BeforeClass
  public void openurl() {
	  driver.get(url);
  }
  
  @Test
  public void checkboxid() throws InterruptedException {
	 // WebElement sportselement=driver.findElement(By.id("hobbies"));
	  WebElement sportselement=driver.findElement(By.xpath("//input[@id='hobbies']"));
	  sportselement.click();
	  Thread.sleep(2000);	  
  }

  @AfterSuite
  public void closechromebrowser() {
	  driver.quit();
  }

}
