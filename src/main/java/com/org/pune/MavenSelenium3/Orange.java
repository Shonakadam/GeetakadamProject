package com.org.pune.MavenSelenium3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Orange {
	WebDriver driver;

		@BeforeTest
		public void method() {
		System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		}
		   @Test
		   public void signUp_function() {
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
		
		WebElement user= driver.findElement(By.id("txtUsername"));
		user.sendKeys("Admin");
		
		WebElement pass= wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txtPassword")));
		pass.sendKeys("admin");
		
		WebElement login= wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btnLogin")));
		login.click();
		   }
		
           @AfterTest
            public void teardown() {
        	   driver.quit();
	}

}
