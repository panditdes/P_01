package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {            

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		 System.setProperty("webdriver.chrome.driver", "F:\\Pandit\\Required Document\\Selenium\\chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();      //upcasting
			
			driver.get("https://www.youtube.com/"); //get.(string url):void-webdriverpackage selenium;

			Thread.sleep(2000);
			
			driver.manage().window().maximize();      //for maximize the method
		
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[@id='meta']")).click();
			
			Thread.sleep(20000);
		
			WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		
		
			search.sendKeys("sami sami song");
		    
		    Thread.sleep(2000);
		    
		    
		    driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		    
		    
		    Thread.sleep(5000);
		    
		    
		    driver.findElement(By.xpath("//a[@id='video-title']")).click();
		
		    
	}

}
