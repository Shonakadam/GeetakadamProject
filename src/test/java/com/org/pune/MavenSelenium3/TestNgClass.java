package com.org.pune.MavenSelenium3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TestNgClass {
  @Test
  public void f() {
	
  }
  @BeforeTest
  public void beforeTest() {

      System.setProperty("webdriver.gecko.driver", "Resoures/geckodriver.exe");
      WebDriver driver= new FirefoxDriver();
      driver.get("https://www.eclipse.org/m2e/");
    
  }

  @AfterTest
  public void afterTest() {
  }

}
 