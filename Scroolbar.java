package javaprograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroolbar {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation-Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();		
		//For Scroll down:
		driver.get("http://www.naukri.com/");

		
		String parent= driver.getWindowHandle();
		
		Set<String>S1=driver.getWindowHandles();
		
		Iterator<String>IT=S1.iterator();
		
		while(IT.hasNext())
		{
			
			
			String child =IT.next();
		
			if (!parent.equals(child)) {
				
				driver.switchTo().window(child);

				System.out.println(driver.getTitle());
				driver.close();
				
			}
		}
		
		
		driver.switchTo().window(parent);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2000)", "");
		Thread.sleep(2000);

		//For Scroll up:

		jse.executeScript("window.scrollBy(0,-2000)", "");
		Thread.sleep(2000);

		driver.quit();
		
		
		
		//If you want to scroll horizontally in the right direction, use the following 
		//jse.executeScript("window.scrollBy(2000,0)");

		//If you want to scroll horizontally in the left direction, use the following JavaScrip
		
		//jse.executeScript("window.scrollBy(-2000,0)");

		
		
	}

}
