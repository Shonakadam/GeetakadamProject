package com.org.pune.MavenSelenium3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MainTestClass {
  @Test
  public void f() {
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("http://automationpractice.com/index.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
