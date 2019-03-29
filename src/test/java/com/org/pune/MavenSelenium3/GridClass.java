package com.org.pune.MavenSelenium3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class GridClass {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.VISTA);
		
		try {
			driver = new RemoteWebDriver(new URL("http://192.168.1.203:4444/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("https://dev.tracko.co.in");
	}

	@Test
	public void sign() {
		WebElement signupbut = driver.findElement(By.xpath("//a[text()='Sign Up Free']"));
		signupbut.click();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();

	}

}
