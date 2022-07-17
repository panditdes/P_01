package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mouse_Action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "F:\\Pandit\\Required Document\\Selenium\\chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();      //upcasting
			
			driver.get("https://www.flipkart.com/"); //get.(string url):void-webdriverpackage selenium;

			Thread.sleep(2000);
			
			driver.manage().window().maximize();      //for maximize the method
			
			driver.getTitle();
			
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			
			WebElement element = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			
			element.sendKeys("deshpandepandit143@gmail.com");      //email enter
			
			
	        Thread.sleep(2000);
			
			WebElement element1 = driver.findElement(By.xpath("//input[@type='password']"));
			
			element1.sendKeys("Ponds@245");              //password enter
		
		
			Thread.sleep(2000);
		
	        WebElement element2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			
			element2.click();              //submit
			
			Thread.sleep(2000);
		
    		Actions act = new Actions(driver);
			
			
			WebElement Profile = driver.findElement(By.xpath("//div[@class='exehdJ']"));
	
		    act.moveToElement(Profile).perform();
		    
		    
		    Thread.sleep(2000);
		
		    WebElement LogOut = driver.findElement(By.xpath("(//li[@class='_2NOVgj'])[10]"));
		
		
		    act.moveToElement(LogOut).click().build().perform();
	
		
	}

}
