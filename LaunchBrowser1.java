package sele1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Capabilities;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;


import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.io.Files;
//import org.seleniumhq.jetty9.server.Response.OutputType;

public class LaunchBrowser1 {
	
	public static WebDriver driver;


	public void launchChromeBrowser() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	       // ChromeOptions chromeOptions = new ChromeOptions();
	       // chromeOptions.addArguments("--headless");
	        //chromeOptions.addArguments("--no-sandbox");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.snapfish.com");

        Thread.sleep(1000);
        
        
        
        System.out.println("Pass");
		
	}
	
public void launchFirefoxBrowser() throws Exception{
		
	 System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
	     
	 DesiredCapabilities capabilities=DesiredCapabilities.firefox();
	 capabilities.setCapability("marionette", true);

	 FirefoxProfile ffprofile = new FirefoxProfile();
	 ffprofile.setPreference("dom.webnotifications.enabled", false);

        driver = new FirefoxDriver((Capabilities) ffprofile);
        driver.manage().window().maximize();

        driver.get("http://www.google.com");

        Thread.sleep(1000);       
      
        
        System.out.println("Pass");
		
	}

public static void captureScreenShot() throws Exception {
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		// now copy the  screenshot to desired location using copyFile //method
		Files.copy(src, new File("/home/local/SLS/yperaboina/LatestEclipse-Workspace/FirstProject/src/Results/"+System.currentTimeMillis()+".png"));
	System.out.println("Captured the screenshot");
	}
 
	catch (IOException e)
	{
		System.out.println(e.getMessage());
 
	}
	
}	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		LaunchBrowser1 lb = new LaunchBrowser1();
		//lb.launchFirefoxBrowser();
		lb.launchChromeBrowser();
		captureScreenShot();
       

		
		
		
		

	}

}
