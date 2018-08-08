package com.config;

import configs.Constants;

public class LaunchBrowser {
	public static void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", Constants.driverLoaction);
		
		
	}

}
