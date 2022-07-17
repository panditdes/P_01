package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassC {

 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Pandit\\Required Document\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();      //upcasting
		
		driver.get("https://www.flipkart.com/"); //get.(string url):void-webdriverpackage selenium;

		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		
		
		Dimension k = new Dimension(1300,1000);
		
		driver.manage().window().setSize(k);
		
		
		//changing position of browser
		Point g = new Point(400,400);
		
		driver.manage().window().setPosition(g);
		
		
		
		// Close and Quite Methods
	
  
		
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		

		driver.switchTo().newWindow(WindowType.TAB);
		
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		
		Thread.sleep(5000);
		
		
		
	 	Thread.sleep(3000);
		
		driver.close(); // Close Method is used to Close the current Tab
		
		Thread.sleep(5000);
		
		
		driver.quit();   //quit method is used to close all the tabs and windows
		
		
		
	
		
	}

}