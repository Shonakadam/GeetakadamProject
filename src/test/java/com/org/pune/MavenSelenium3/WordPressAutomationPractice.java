package com.org.pune.MavenSelenium3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WordPressAutomationPractice {
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforemethod() {
	  System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
 
     
	
  }
  @AfterTest
  public void aftermethod() {
	  
  }
}
