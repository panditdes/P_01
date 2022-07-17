package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {
	
	                     //NOT COMPLITED

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	    System.setProperty("webdriver.chrome.driver", "F:\\Pandit\\Required Document\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();      //upcasting
		
		driver.get("https://www.reduceimages.com/"); //get.(string url):void-webdriverpackage selenium;

		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
		
		//Actions class method to drag and drop
		
		
		Actions act = new Actions(driver);
		
		Thread.sleep(3000);
		
		WebElement from = driver.findElement(By.xpath("//img[@src='/img/reduce_logo.png']"));
		
		Thread.sleep(3000);
		
		WebElement to = driver.findElement(By.xpath("//div[@class='drop-message']"));
		
		Thread.sleep(3000);
		
		
		//Perform drag and drop
		
		
		act.clickAndHold(from).moveToElement(to).release().build().perform();
		
		
		
		
	
		
	}

}
