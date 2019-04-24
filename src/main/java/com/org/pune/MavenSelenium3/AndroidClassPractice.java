package com.org.pune.MavenSelenium3;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidClassPractice {

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("platformVersion", "7.0");
		capabilities.setCapability("deviceName", "Micromax Q4311");
		capabilities.setCapability("platformName", "Android");

		WebDriver driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("kapu123@gmail.com");

		WebElement passname = driver.findElement(By.name("pass"));
		passname.sendKeys("kapu1234");

		WebElement but = driver.findElement(By.className("_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy"));
		but.click();

		WebElement forgot = driver.findElement(By.linkText("Forgotten account?"));
		forgot.click();

		WebElement partial = driver.findElement(By.partialLinkText("account"));
		partial.click();
		driver.quit();

	}

}
