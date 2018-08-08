package com.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", Constants.driverLocation);
		Constants.driver = new ChromeDriver();
		Constants.driver.manage().window().maximize();
		Constants.driver.get(Constants.Url);
		Constants.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);		
	
			
	}

}
