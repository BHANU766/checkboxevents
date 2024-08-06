package com.chechboxevents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectmultiplecheckbox {
      
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
public void multiplecheckbox() throws InterruptedException {	
	  List<WebElement> allelements=driver.findElements(By.xpath("//input[@type='checkbox']"));	  
	  for(WebElement el: allelements) {
		  if(!el.isSelected()) {
			  el.click();
		  }
		  
	  }
	  Thread.sleep(3000);
}

@AfterSuite
public void closechromebrowser() {
	  driver.quit();
}
}
