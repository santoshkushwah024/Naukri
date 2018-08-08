package launchTest;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.config.LaunchBrowser;
import com.naukri.SignUp;

public class LaunchApplication {
	@BeforeTest
	public void launchBrowser()
	{
		LaunchBrowser.launchBrowser();
	}

	@Test
	public void signUpTest() throws AWTException
	{
		SignUp.signUpPage();
	}
	

}
