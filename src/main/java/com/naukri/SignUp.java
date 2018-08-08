package com.naukri;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.config.*;

public class SignUp {

	public static void signUpPage() throws AWTException{
		Constants.driver.findElement(By.xpath("//input[@value='Register with us']")).click();
		Constants.driver.findElement(By.xpath("//button[text()='I am a Fresher']")).click();
		Constants.driver.findElement(By.name("fname")).click();
		Constants.driver.findElement(By.name("fname")).sendKeys("Topa Yadav");
		Constants.driver.findElement(By.id("email")).click();
		Constants.driver.findElement(By.id("email")).sendKeys("kushwahsantosh91@gmail.com");
		Constants.driver.findElement(By.xpath("//input[@type='password']")).click();
		Constants.driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
		Constants.driver.findElement(By.name("number")).click();
		Constants.driver.findElement(By.name("number")).sendKeys("9039452582");
		Constants.driver.findElement(By.name("city")).click();
		Constants.driver.findElement(By.name("city")).sendKeys("bengaluru/Bangalore");
		Constants.driver.findElement(By.name("uploadCV")).click();
	
			//StringSelection is a class that can be used for copy and paste operations.
			   StringSelection stringSelection = new StringSelection("C:\\Users\\santo\\Desktop\\SantoshResume.doc");
			   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
				Robot robot = new Robot(); 
				robot.keyPress(KeyEvent.VK_CONTROL);
	            robot.keyPress(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_CONTROL);
	            robot.keyPress(KeyEvent.VK_ENTER);
	            robot.keyRelease(KeyEvent.VK_ENTER);
	           	}
	public static void windowHandle(){
		Set<String> whandle = Constants.driver.getWindowHandles();
		Iterator<String> window =  whandle.iterator();
		String parentWindow = window.next();
		String childWindow = window.next();
		Constants.driver.switchTo().window(parentWindow);
		
	}
	}
