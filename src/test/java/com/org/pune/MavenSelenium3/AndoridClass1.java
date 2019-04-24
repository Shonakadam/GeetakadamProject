package com.org.pune.MavenSelenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AndoridClass1 {
	  WebDriver driver;
  @Test
  public void f() {
	  WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
	  username.sendKeys("geet123@gmail.com");
	  
	  WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
	  password.sendKeys("password123");
	  
	  WebElement loginbutn=driver.findElement(By.xpath("//button[@id='loginbutton']"));
	  loginbutn.click();
  }
  @BeforeTest
  public void beforemethod() {
	  System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.facebook.com/login");
	  driver.manage().window().maximize();
  }
  @AfterTest
  public void aftermethod() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.quit();
  }
}
