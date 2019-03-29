package com.org.pune.MavenSelenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
		
	WebElement username=driver.findElement(By.id("email"));
	 username.sendKeys("kapu123@gmail.com");
	 
	 WebElement passname=driver.findElement(By.name("pass"));
	 passname.sendKeys("kapu1234");
	 
	 
	 WebElement but=driver.findElement(By.className("_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy"));
	 but.click();
	 
	 WebElement forgot=driver.findElement(By.linkText("Forgotten account?"));
	 forgot.click();
	 
	 
	 WebElement partial= driver.findElement(By.partialLinkText("account"));
	 partial.click();
		driver.quit();
		
		

	}

}
